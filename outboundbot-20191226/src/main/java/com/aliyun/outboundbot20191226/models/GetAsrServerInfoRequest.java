// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAsrServerInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>024f8cf0-c842-4c01-b74b-c8667e4579c7</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static GetAsrServerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsrServerInfoRequest self = new GetAsrServerInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAsrServerInfoRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetAsrServerInfoRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
