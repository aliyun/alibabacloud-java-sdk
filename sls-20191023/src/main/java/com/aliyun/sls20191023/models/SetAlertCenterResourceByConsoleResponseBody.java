// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertCenterResourceByConsoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetAlertCenterResourceByConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAlertCenterResourceByConsoleResponseBody self = new SetAlertCenterResourceByConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAlertCenterResourceByConsoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetAlertCenterResourceByConsoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetAlertCenterResourceByConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAlertCenterResourceByConsoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
