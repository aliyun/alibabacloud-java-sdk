// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteComfyProductionRequest extends TeaModel {
    /**
     * <p>The ID of the production.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5bda20-5cd4-4d55-8d23-88d624a18caa</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static DeleteComfyProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComfyProductionRequest self = new DeleteComfyProductionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComfyProductionRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
