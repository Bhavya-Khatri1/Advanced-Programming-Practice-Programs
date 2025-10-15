% Facts: student marks
marks(ram, 85).
marks(anu, 45).
marks(vijay, 60).

% Rules: pass or fail
pass(Student) :- marks(Student, Marks), Marks >= 50.
fail(Student) :- marks(Student, Marks), Marks < 50.

% Queries you can run:
% ?- pass(X).       % Who passed?
% ?- fail(X).       % Who failed?
% ?- pass(ram).     % Did Ram pass?
% ?- findall(X, pass(X), PassedList).  % List all students who passed
