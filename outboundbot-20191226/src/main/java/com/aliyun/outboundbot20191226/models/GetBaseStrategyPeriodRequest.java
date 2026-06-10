// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetBaseStrategyPeriodRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>024f8cf0-c842-4c01-b74b-c8667e4579c7</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>Strategy level. Default value is 2.</p>
     * <ul>
     * <li><p>0: System</p>
     * </li>
     * <li><p>1: Tenant</p>
     * </li>
     * <li><p>2: Instance</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static GetBaseStrategyPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaseStrategyPeriodRequest self = new GetBaseStrategyPeriodRequest();
        return TeaModel.build(map, self);
    }

    public GetBaseStrategyPeriodRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetBaseStrategyPeriodRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
