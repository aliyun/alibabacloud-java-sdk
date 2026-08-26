// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterRequest extends TeaModel {
    /**
     * <p>The AI cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The model operator space.</p>
     * 
     * <strong>example:</strong>
     * <p>pms-xxx</p>
     */
    @NameInMap("ModelSpace")
    public String modelSpace;

    public static DeleteAIDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterRequest self = new DeleteAIDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAIDBClusterRequest setModelSpace(String modelSpace) {
        this.modelSpace = modelSpace;
        return this;
    }
    public String getModelSpace() {
        return this.modelSpace;
    }

}
