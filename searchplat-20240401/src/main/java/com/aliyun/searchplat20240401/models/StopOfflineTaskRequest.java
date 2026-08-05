// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StopOfflineTaskRequest extends TeaModel {
    /**
     * <p>The parallelism of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("parallelism")
    public Integer parallelism;

    /**
     * <p>The start offset.</p>
     * 
     * <strong>example:</strong>
     * <p>1747900639</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static StopOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopOfflineTaskRequest self = new StopOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopOfflineTaskRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public StopOfflineTaskRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public StopOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
