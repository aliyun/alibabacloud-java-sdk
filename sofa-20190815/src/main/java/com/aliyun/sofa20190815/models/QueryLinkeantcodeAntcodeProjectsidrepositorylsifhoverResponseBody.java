// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Contents")
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents contents;

    @NameInMap("Range")
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange range;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setContents(QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents contents) {
        this.contents = contents;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents getContents() {
        return this.contents;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBody setRange(QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange range) {
        this.range = range;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange getRange() {
        return this.range;
    }

    public static class QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents extends TeaModel {
        @NameInMap("Kind")
        public String kind;

        @NameInMap("Value")
        public String value;

        public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyContents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseBodyRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
