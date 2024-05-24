// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopJobRequestBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
