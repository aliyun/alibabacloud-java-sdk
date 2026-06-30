// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateYikeProductionRequest extends TeaModel {
    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_12334**</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>The project title.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateYikeProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateYikeProductionRequest self = new UpdateYikeProductionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateYikeProductionRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public UpdateYikeProductionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
