// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StoreMaterialTemporarilyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StoreMaterialTemporarilyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StoreMaterialTemporarilyResponseBody self = new StoreMaterialTemporarilyResponseBody();
        return TeaModel.build(map, self);
    }

    public StoreMaterialTemporarilyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StoreMaterialTemporarilyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
