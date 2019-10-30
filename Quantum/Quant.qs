namespace ICS.Quantum{
	open Microsoft.Quantum.Intrinsic;
    open Microsoft.Quantum.Canon;
    open Microsoft.Quantum.Math;
    open Microsoft.Quantum.Diagnostics;
	open Microsoft.Quantum.Measurement;
	open Microsoft.Quantum.Samples;

	operation qubitPlay(): Unit{
	
		mutable count = 0;
		let maxCount = 10;
	
	
		using (qs = Qubit[maxCount]){
		for (i in 1 .. maxCount){
			X(qs[i-1]);
			H(qs[i-1]);
			if (M(qs[i-1])== Zero){
				//Message("It was zero");
			} else{
				//Message("It was one");
				set count += 1;
			}	
		}
		ResetAll(qs);
	}
	Message($"There were (maxCount-count) zeroe and (count) ones" 
	}
	
	operation Entangle():{
	
	let maxCount = 1000
	mutable q0Zeroes = 0;
	mutable q1Zeroes = 0;
	mutable agree = 0;
	for(i in 1 .. maxCount)
	using(qs = Qubit[2]){
		H(qs[0]);
		CNOt(qs[0], qs[1]);
		let r0 = M(qs[0]);
		let r1 = M(qs[0]);
		
		if (r0 == Zero){
			set q0Zeroes+=1;
	}	if (r1 == Zero{
			set q0Zeroes+=1;
	}	if (r0 == r1){
			set q0Zeroes+=1;
	}	ResetAll(gs);
	}Message($"Qs[0] was {M(qs[0])==Zero} and Qs[1] was {M(qs[0])==Zero}");
	}
	
}
