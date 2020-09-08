// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static RemoveClusterFromServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterFromServiceMeshResponse self = new RemoveClusterFromServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClusterFromServiceMeshResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveClusterFromServiceMeshResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveClusterFromServiceMeshResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
