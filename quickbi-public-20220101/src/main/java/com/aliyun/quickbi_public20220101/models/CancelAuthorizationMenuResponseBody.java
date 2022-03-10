// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelAuthorizationMenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Integer result;

    @NameInMap("Success")
    public Boolean success;

    public static CancelAuthorizationMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAuthorizationMenuResponseBody self = new CancelAuthorizationMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAuthorizationMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelAuthorizationMenuResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public CancelAuthorizationMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
