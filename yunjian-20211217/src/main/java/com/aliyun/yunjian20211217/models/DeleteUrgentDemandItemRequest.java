// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("modifier")
    public String modifier;

    public static DeleteUrgentDemandItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandItemRequest self = new DeleteUrgentDemandItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandItemRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteUrgentDemandItemRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

}
