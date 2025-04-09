// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAfterAnswerDelayPlaybackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static GetAfterAnswerDelayPlaybackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAfterAnswerDelayPlaybackRequest self = new GetAfterAnswerDelayPlaybackRequest();
        return TeaModel.build(map, self);
    }

    public GetAfterAnswerDelayPlaybackRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetAfterAnswerDelayPlaybackRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
