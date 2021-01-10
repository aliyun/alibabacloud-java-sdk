// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeLsifhoverResponseBody extends TeaModel {
    @NameInMap("Contents")
    public CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents contents;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Range")
    public CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange range;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeLsifhoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeLsifhoverResponseBody self = new CreateLinkeantcodeAntcodeLsifhoverResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setContents(CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents contents) {
        this.contents = contents;
        return this;
    }
    public CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents getContents() {
        return this.contents;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setRange(CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange range) {
        this.range = range;
        return this;
    }
    public CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange getRange() {
        return this.range;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Kind")
        public String kind;

        public static CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents self = new CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateLinkeantcodeAntcodeLsifhoverResponseBodyContents setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

    }

    public static class CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange self = new CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public CreateLinkeantcodeAntcodeLsifhoverResponseBodyRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

    }

}
