// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobErrorInfoResponseBody extends TeaModel {
    @NameInMap("ErrorInfo")
    public GetTrainingJobErrorInfoResponseBodyErrorInfo errorInfo;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainingJobErrorInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobErrorInfoResponseBody self = new GetTrainingJobErrorInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobErrorInfoResponseBody setErrorInfo(GetTrainingJobErrorInfoResponseBodyErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public GetTrainingJobErrorInfoResponseBodyErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public GetTrainingJobErrorInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainingJobErrorInfoResponseBodyErrorInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>additional info</p>
         */
        @NameInMap("AdditionalInfo")
        public String additionalInfo;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        public static GetTrainingJobErrorInfoResponseBodyErrorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobErrorInfoResponseBodyErrorInfo self = new GetTrainingJobErrorInfoResponseBodyErrorInfo();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobErrorInfoResponseBodyErrorInfo setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public GetTrainingJobErrorInfoResponseBodyErrorInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetTrainingJobErrorInfoResponseBodyErrorInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
