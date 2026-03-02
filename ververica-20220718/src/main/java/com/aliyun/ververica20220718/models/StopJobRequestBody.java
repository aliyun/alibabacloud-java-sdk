// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopJobRequestBody extends TeaModel {
    /**
     * <p>The strategy that is used to stop a job. Valid values:</p>
     * <ul>
     * <li><code>NONE</code>: Directly stop the job.</li>
     * <li><code>STOP_WITH_SAVEPOINT</code>: Stop the job after a savepoint is generated.</li>
     * <li><code>STOP_WITH_DRAIN</code>: Stop the job and drain the pipeline. Use this strategy only if you want to permanently terminate the job.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("stopStrategy")
    public String stopStrategy;

    public static StopJobRequestBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobRequestBody self = new StopJobRequestBody();
        return TeaModel.build(map, self);
    }

    public StopJobRequestBody setStopStrategy(String stopStrategy) {
        this.stopStrategy = stopStrategy;
        return this;
    }
    public String getStopStrategy() {
        return this.stopStrategy;
    }

}
