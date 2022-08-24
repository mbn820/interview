BUILD

    mvn clean install

RUN

    mvn exec:java -Dexec.mainClass="mbn.App"

EXECUTE TESTS

    mvn test