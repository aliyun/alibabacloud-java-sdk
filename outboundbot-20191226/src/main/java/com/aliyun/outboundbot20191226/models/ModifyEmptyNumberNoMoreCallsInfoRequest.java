// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyEmptyNumberNoMoreCallsInfoRequest extends TeaModel {
    /**
     * <p>Enable or disable the nonexistent number no-call feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EmptyNumberNoMoreCalls")
    public Boolean emptyNumberNoMoreCalls;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>Policy level. Use 2 for business instances.</p>
     * <ul>
     * <li><p>0: system</p>
     * </li>
     * <li><p>1: tenant</p>
     * </li>
     * <li><p>2: instance</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static ModifyEmptyNumberNoMoreCallsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmptyNumberNoMoreCallsInfoRequest self = new ModifyEmptyNumberNoMoreCallsInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEmptyNumberNoMoreCallsInfoRequest setEmptyNumberNoMoreCalls(Boolean emptyNumberNoMoreCalls) {
        this.emptyNumberNoMoreCalls = emptyNumberNoMoreCalls;
        return this;
    }
    public Boolean getEmptyNumberNoMoreCalls() {
        return this.emptyNumberNoMoreCalls;
    }

    public ModifyEmptyNumberNoMoreCallsInfoRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public ModifyEmptyNumberNoMoreCallsInfoRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
