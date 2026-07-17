// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static DescribeElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanRequest self = new DescribeElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
