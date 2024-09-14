// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RescaleJobParam extends TeaModel {
    @NameInMap("jobParallelism")
    public Long jobParallelism;

    public static RescaleJobParam build(java.util.Map<String, ?> map) throws Exception {
        RescaleJobParam self = new RescaleJobParam();
        return TeaModel.build(map, self);
    }

    public RescaleJobParam setJobParallelism(Long jobParallelism) {
        this.jobParallelism = jobParallelism;
        return this;
    }
    public Long getJobParallelism() {
        return this.jobParallelism;
    }

}
