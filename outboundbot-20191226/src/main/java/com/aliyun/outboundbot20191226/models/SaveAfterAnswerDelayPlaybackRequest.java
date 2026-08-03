// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAfterAnswerDelayPlaybackRequest extends TeaModel {
    /**
     * <p>The playback time for delayed playback. If this parameter is not specified, the default value 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AfterAnswerDelayPlayback")
    public Integer afterAnswerDelayPlayback;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>980116ec-2d3d-4747-8059-dc25e7af8501</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>The policy level (required). Valid values:</p>
     * <ul>
     * <li>2: instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
