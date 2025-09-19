// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertStrategyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    public static GetAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertStrategyRequest self = new GetAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
