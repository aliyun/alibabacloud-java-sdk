// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalEmbeddingModelModeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ListMultimodalEmbeddingModelModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalEmbeddingModelModeRequest self = new ListMultimodalEmbeddingModelModeRequest();
        return TeaModel.build(map, self);
    }

    public ListMultimodalEmbeddingModelModeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
