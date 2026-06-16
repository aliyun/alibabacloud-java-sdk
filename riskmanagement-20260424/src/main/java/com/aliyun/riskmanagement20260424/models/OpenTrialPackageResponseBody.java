// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class OpenTrialPackageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OpenTrialPackageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
