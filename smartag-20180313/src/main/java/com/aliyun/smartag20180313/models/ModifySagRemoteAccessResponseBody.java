// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRemoteAccessResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned after calling the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The remote access IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.2</p>
     */
    @NameInMap("RemoteAccessIp")
    public String remoteAccessIp;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FF203D7-462D-498E-94F9-2B2FA462DD23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SN of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sag61a344**</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifySagRemoteAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRemoteAccessResponseBody self = new ModifySagRemoteAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagRemoteAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySagRemoteAccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySagRemoteAccessResponseBody setRemoteAccessIp(String remoteAccessIp) {
        this.remoteAccessIp = remoteAccessIp;
        return this;
    }
    public String getRemoteAccessIp() {
        return this.remoteAccessIp;
    }

    public ModifySagRemoteAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySagRemoteAccessResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ModifySagRemoteAccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
