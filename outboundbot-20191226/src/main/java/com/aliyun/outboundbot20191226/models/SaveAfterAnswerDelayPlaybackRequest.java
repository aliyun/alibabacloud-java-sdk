// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAfterAnswerDelayPlaybackRequest extends TeaModel {
    /**
     * <p>Delay before playback starts, in seconds. Default is 0 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AfterAnswerDelayPlayback")
    public Integer afterAnswerDelayPlayback;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>980116ec-2d3d-4747-8059-dc25e7af8501</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>Policy level (required)</p>
     * <ul>
     * <li>2: Instance</li>
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
