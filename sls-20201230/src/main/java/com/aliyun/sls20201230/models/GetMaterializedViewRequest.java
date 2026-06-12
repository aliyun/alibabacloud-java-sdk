// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("returnStatus")
    public Boolean returnStatus;

    public static GetMaterializedViewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaterializedViewRequest self = new GetMaterializedViewRequest();
        return TeaModel.build(map, self);
    }

    public GetMaterializedViewRequest setReturnStatus(Boolean returnStatus) {
        this.returnStatus = returnStatus;
        return this;
    }
    public Boolean getReturnStatus() {
        return this.returnStatus;
    }

}
