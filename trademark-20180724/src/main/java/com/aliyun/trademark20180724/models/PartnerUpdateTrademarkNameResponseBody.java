// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class PartnerUpdateTrademarkNameResponseBody extends TeaModel {
    // allowRetry
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // dynamicCode
    @NameInMap("DynamicCode")
    public String dynamicCode;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // dynamicMessage
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // success
    @NameInMap("Success")
    public Boolean success;

    // appName
    @NameInMap("AppName")
    public String appName;

    public static PartnerUpdateTrademarkNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PartnerUpdateTrademarkNameResponseBody self = new PartnerUpdateTrademarkNameResponseBody();
        return TeaModel.build(map, self);
    }

    public PartnerUpdateTrademarkNameResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public PartnerUpdateTrademarkNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PartnerUpdateTrademarkNameResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public PartnerUpdateTrademarkNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PartnerUpdateTrademarkNameResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public PartnerUpdateTrademarkNameResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PartnerUpdateTrademarkNameResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PartnerUpdateTrademarkNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PartnerUpdateTrademarkNameResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
