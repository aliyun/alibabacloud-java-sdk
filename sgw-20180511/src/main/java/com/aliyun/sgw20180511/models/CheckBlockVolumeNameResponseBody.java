// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckBlockVolumeNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsAlreadyExist")
    public Boolean isAlreadyExist;

    @NameInMap("IsRequireRecovery")
    public String isRequireRecovery;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckBlockVolumeNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockVolumeNameResponseBody self = new CheckBlockVolumeNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBlockVolumeNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckBlockVolumeNameResponseBody setIsAlreadyExist(Boolean isAlreadyExist) {
        this.isAlreadyExist = isAlreadyExist;
        return this;
    }
    public Boolean getIsAlreadyExist() {
        return this.isAlreadyExist;
    }

    public CheckBlockVolumeNameResponseBody setIsRequireRecovery(String isRequireRecovery) {
        this.isRequireRecovery = isRequireRecovery;
        return this;
    }
    public String getIsRequireRecovery() {
        return this.isRequireRecovery;
    }

    public CheckBlockVolumeNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckBlockVolumeNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBlockVolumeNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
