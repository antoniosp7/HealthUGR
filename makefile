compile:
	sbt clean
	sbt compile

clean:
	rm -rf target

.PHONY: clean all