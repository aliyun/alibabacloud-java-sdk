// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleResponse self = new DeleteRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
