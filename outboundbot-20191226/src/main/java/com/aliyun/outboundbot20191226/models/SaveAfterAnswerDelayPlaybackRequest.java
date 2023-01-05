// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAfterAnswerDelayPlaybackRequest extends TeaModel {
    @NameInMap("AfterAnswerDelayPlayback")
    public Integer afterAnswerDelayPlayback;

    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static SaveAfterAnswerDelayPlaybackRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAfterAnswerDelayPlaybackRequest self = new SaveAfterAnswerDelayPlaybackRequest();
        return TeaModel.build(map, self);
    }

    public SaveAfterAnswerDelayPlaybackRequest setAfterAnswerDelayPlayback(Integer afterAnswerDelayPlayback) {
        this.afterAnswerDelayPlayback = afterAnswerDelayPlayback;
        return this;
    }
    public Integer getAfterAnswerDelayPlayback() {
        return this.afterAnswerDelayPlayback;
    }

    public SaveAfterAnswerDelayPlaybackRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public SaveAfterAnswerDelayPlaybackRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
