// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelFreeLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FailedLicenseItemIdList")
    public java.util.List<String> failedLicenseItemIdList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DelFreeLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelFreeLicenseResponseBody self = new DelFreeLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public DelFreeLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DelFreeLicenseResponseBody setFailedLicenseItemIdList(java.util.List<String> failedLicenseItemIdList) {
        this.failedLicenseItemIdList = failedLicenseItemIdList;
        return this;
    }
    public java.util.List<String> getFailedLicenseItemIdList() {
        return this.failedLicenseItemIdList;
    }

    public DelFreeLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DelFreeLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DelFreeLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelFreeLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
