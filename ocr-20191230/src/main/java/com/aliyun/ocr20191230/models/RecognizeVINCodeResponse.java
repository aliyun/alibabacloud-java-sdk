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

    public RecognizeVINCodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeVINCodeResponse setData(RecognizeVINCodeResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeVINCodeResponseData getData() {
        return this.data;
    }

    public static class RecognizeVINCodeResponseData extends TeaModel {
        @NameInMap("VinCode")
        @Validation(required = true)
        public String vinCode;

        public static RecognizeVINCodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVINCodeResponseData self = new RecognizeVINCodeResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeVINCodeResponseData setVinCode(String vinCode) {
            this.vinCode = vinCode;
            return this;
        }
        public String getVinCode() {
            return this.vinCode;
        }

    }

}
