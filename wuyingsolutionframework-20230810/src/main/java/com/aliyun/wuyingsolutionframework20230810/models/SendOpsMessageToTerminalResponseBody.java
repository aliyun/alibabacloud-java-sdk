// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingsolutionframework20230810.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2F015A9B-C457-5E5A-A58D-215CCEBC4A80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendOpsMessageToTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalResponseBody self = new SendOpsMessageToTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendOpsMessageToTerminalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendOpsMessageToTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendOpsMessageToTerminalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
