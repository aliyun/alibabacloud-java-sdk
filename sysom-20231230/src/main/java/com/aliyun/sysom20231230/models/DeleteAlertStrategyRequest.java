// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    public static DeleteAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertStrategyRequest self = new DeleteAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertStrategyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
