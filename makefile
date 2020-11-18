compile:
	sbt clean
	sbt compile

run:
	sbt run

test:
	sbt test

clean:
	rm -rf target

.PHONY: clean all