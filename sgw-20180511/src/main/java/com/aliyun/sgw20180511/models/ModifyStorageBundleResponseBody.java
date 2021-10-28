// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyStorageBundleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyStorageBundleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageBundleResponseBody self = new ModifyStorageBundleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStorageBundleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyStorageBundleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyStorageBundleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyStorageBundleResponseBody setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public ModifyStorageBundleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
