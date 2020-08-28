// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVerificationcodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVerificationcodeResponseData data;

    public static RecognizeVerificationcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVerificationcodeResponse self = new RecognizeVerificationcodeResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVerificationcodeResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static RecognizeVerificationcodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVerificationcodeResponseData self = new RecognizeVerificationcodeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
