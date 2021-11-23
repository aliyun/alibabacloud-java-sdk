// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVerificationcodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVerificationcodeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVerificationcodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVerificationcodeResponseBody self = new RecognizeVerificationcodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVerificationcodeResponseBody setData(RecognizeVerificationcodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVerificationcodeResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVerificationcodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVerificationcodeResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static RecognizeVerificationcodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVerificationcodeResponseBodyData self = new RecognizeVerificationcodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVerificationcodeResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
