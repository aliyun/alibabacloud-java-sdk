// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVINCodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVINCodeResponseData data;

    public static RecognizeVINCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVINCodeResponse self = new RecognizeVINCodeResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVINCodeResponseData extends TeaModel {
        @NameInMap("VinCode")
        @Validation(required = true)
        public String vinCode;

        public static RecognizeVINCodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVINCodeResponseData self = new RecognizeVINCodeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
