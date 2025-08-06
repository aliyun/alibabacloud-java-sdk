// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RenewAppLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RenewAppLicenseResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RenewAppLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewAppLicenseResponseBody self = new RenewAppLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewAppLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewAppLicenseResponseBody setData(RenewAppLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewAppLicenseResponseBodyData getData() {
        return this.data;
    }

    public RenewAppLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RenewAppLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewAppLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewAppLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RenewAppLicenseResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static RenewAppLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewAppLicenseResponseBodyData self = new RenewAppLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewAppLicenseResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
