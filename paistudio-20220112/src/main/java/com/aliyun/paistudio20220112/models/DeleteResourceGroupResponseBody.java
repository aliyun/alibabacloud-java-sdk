// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    public static DeleteResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponseBody self = new DeleteResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceGroupResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

}
