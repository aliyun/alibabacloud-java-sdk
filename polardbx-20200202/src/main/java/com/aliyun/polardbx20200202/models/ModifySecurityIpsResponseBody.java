// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsResponseBody self = new ModifySecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityIpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
