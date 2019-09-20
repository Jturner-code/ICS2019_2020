namespace ICS.Quantum{
	open Microsoft.Quantum.Intrinsic;
    open Microsoft.Quantum.Canon;
    open Microsoft.Quantum.Math;
    open Microsoft.Quantum.Diagnostics;
	open Microsoft.Quantum.Measurement;
	open Microsoft.Quantum.Samples;

	operation HelloWorld(): Unit{
		Message("Hello World");
	}
	operation Hello(name: String): Unit{
		Message($ "Hello (name)");
	}
	operation HelloSeward(name: String): Unit{
		Message("Hello Mr. Seward");
	}
	
}
