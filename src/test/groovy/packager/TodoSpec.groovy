package packager

import spock.lang.Specification


class TodoSpec extends Specification {

    def "MakeDh.withRequiredFilesProvided does not provide understandable information on what's wrong when src/ubuntu/debian does not exist"() {
        expect:
        false
    }

    def "looks like the downloaded archive was not extracted... in fact nothing was copied to build/ubuntu"() {
        expect:
        false
    }

    def "downloader will always download to jetty.tar.gz"() {
        expect:
        false
    }

    def "extractor does not detect failures"() {
        expect:
        false
    }

    def "makedh will not create the build/ubuntu/debian dir if it does not exist"() {
        expect:
        false
    }
}
