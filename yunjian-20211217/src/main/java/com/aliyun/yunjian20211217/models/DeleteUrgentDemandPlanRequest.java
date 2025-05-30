// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>222111</p>
     */
    @NameInMap("modifier")
    public String modifier;

    public static DeleteUrgentDemandPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandPlanRequest self = new DeleteUrgentDemandPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandPlanRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteUrgentDemandPlanRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

}
