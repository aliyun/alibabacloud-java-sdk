// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetEmptyNumberNoMoreCallsInfoRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db3e679b-7d5e-4d9b-828a-345adca455f3</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>Strategy level. Set to 2 for business instances.</p>
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

    public static GetEmptyNumberNoMoreCallsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmptyNumberNoMoreCallsInfoRequest self = new GetEmptyNumberNoMoreCallsInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEmptyNumberNoMoreCallsInfoRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetEmptyNumberNoMoreCallsInfoRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
