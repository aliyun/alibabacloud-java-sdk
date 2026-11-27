// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLSampleEvent extends TeaModel {
    /**
     * <p>The supplementary information for the event. The specific content depends on the event type.</p>
     * 
     * <strong>example:</strong>
     * <p>uid_generated</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The source component or execution stage of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>DataLoader</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The decimal string of the training step. An empty string is used when the corresponding information is not collected.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("GlobalStep")
    public String globalStep;

    /**
     * <p>The training or sampling stage to which the event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_PREPROCESS</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>The millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293208012</p>
     */
    @NameInMap("TimestampMs")
    public Long timestampMs;

    /**
     * <p>The destination component or execution action of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>Trainer</p>
     */
    @NameInMap("To")
    public String to;

    public static RLSampleEvent build(java.util.Map<String, ?> map) throws Exception {
        RLSampleEvent self = new RLSampleEvent();
        return TeaModel.build(map, self);
    }

    public RLSampleEvent setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public RLSampleEvent setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public RLSampleEvent setGlobalStep(String globalStep) {
        this.globalStep = globalStep;
        return this;
    }
    public String getGlobalStep() {
        return this.globalStep;
    }

    public RLSampleEvent setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public RLSampleEvent setTimestampMs(Long timestampMs) {
        this.timestampMs = timestampMs;
        return this;
    }
    public Long getTimestampMs() {
        return this.timestampMs;
    }

    public RLSampleEvent setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
