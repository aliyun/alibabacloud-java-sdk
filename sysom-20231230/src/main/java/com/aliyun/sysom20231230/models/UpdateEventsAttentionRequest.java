// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionRequest extends TeaModel {
    /**
     * <p>Sensitivity of the anomalous activity. Valid values are -1 to 3. A value of -1 decreases sensitivity by 1 degree, and a value of 0 increases sensitivity by 1 degree.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("mode")
    public Integer mode;

    /**
     * <p>Scope of effect: cluster or edge zone</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("range")
    public String range;

    /**
     * <p>UUID corresponding to the anomalous activity</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03de78af-f49f-433d-b5b1-0f6a70c493ba</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static UpdateEventsAttentionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventsAttentionRequest self = new UpdateEventsAttentionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventsAttentionRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public UpdateEventsAttentionRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public UpdateEventsAttentionRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
