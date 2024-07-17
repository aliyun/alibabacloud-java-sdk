// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexOnlineStrategyRequest extends TeaModel {
    /**
     * <p>The index change rate.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("changeRate")
    public Integer changeRate;

    public static ModifyIndexOnlineStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexOnlineStrategyRequest self = new ModifyIndexOnlineStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIndexOnlineStrategyRequest setChangeRate(Integer changeRate) {
        this.changeRate = changeRate;
        return this;
    }
    public Integer getChangeRate() {
        return this.changeRate;
    }

}
