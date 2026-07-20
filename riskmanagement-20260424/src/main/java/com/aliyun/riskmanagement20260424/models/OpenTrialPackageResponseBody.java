// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class OpenTrialPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OpenTrialPackageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static OpenTrialPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenTrialPackageResponseBody self = new OpenTrialPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenTrialPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenTrialPackageResponseBody setData(OpenTrialPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OpenTrialPackageResponseBodyData getData() {
        return this.data;
    }

    public OpenTrialPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenTrialPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenTrialPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenTrialPackageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5F4B631D-0358-5B7B-8B84-FB924138ED91</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static OpenTrialPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OpenTrialPackageResponseBodyData self = new OpenTrialPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OpenTrialPackageResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
