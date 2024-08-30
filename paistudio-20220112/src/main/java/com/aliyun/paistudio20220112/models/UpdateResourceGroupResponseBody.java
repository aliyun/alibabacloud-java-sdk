// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    /**
     * <strong>example:</strong>
     * <p>FFB1D4B4-B253-540A-9B3B-AA711C48A1B7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupResponseBody self = new UpdateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public UpdateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
