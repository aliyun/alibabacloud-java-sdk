// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVINCodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVINCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>911FC8CF-CC27-477E-BE3B-7ED77DF4DFE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVINCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVINCodeResponseBody self = new RecognizeVINCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVINCodeResponseBody setData(RecognizeVINCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVINCodeResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVINCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVINCodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LVBB2FAF777999888</p>
         */
        @NameInMap("VinCode")
        public String vinCode;

        public static RecognizeVINCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVINCodeResponseBodyData self = new RecognizeVINCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVINCodeResponseBodyData setVinCode(String vinCode) {
            this.vinCode = vinCode;
            return this;
        }
        public String getVinCode() {
            return this.vinCode;
        }

    }

}
