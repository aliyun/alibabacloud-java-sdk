// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMetricStoreRequest extends TeaModel {
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    @NameInMap("mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static UpdateMetricStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricStoreRequest self = new UpdateMetricStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetricStoreRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public UpdateMetricStoreRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public UpdateMetricStoreRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateMetricStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
