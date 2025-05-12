// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionRequest extends TeaModel {
    @NameInMap("mode")
    public Integer mode;

    @NameInMap("range")
    public String range;

    /**
     * <p>This parameter is required.</p>
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
