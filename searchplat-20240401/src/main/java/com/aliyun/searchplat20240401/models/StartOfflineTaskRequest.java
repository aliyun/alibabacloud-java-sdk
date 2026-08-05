// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StartOfflineTaskRequest extends TeaModel {
    /**
     * <p>The degree of task parallelism.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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

    public static StartOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOfflineTaskRequest self = new StartOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartOfflineTaskRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public StartOfflineTaskRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public StartOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
