// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckMnsServiceResponseBody extends TeaModel {
    @NameInMap("CheckMessage")
    public String checkMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckMnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMnsServiceResponseBody self = new CheckMnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMnsServiceResponseBody setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
        return this;
    }
    public String getCheckMessage() {
        return this.checkMessage;
    }

    public CheckMnsServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckMnsServiceResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public CheckMnsServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckMnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMnsServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
