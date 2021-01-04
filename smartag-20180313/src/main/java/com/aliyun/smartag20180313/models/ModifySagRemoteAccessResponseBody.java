// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRemoteAccessResponseBody extends TeaModel {
    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RemoteAccessIp")
    public String remoteAccessIp;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySagRemoteAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRemoteAccessResponseBody self = new ModifySagRemoteAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagRemoteAccessResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ModifySagRemoteAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ModifySagRemoteAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySagRemoteAccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
