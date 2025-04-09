// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3c92de8-e4bd-4db4-a962-50f8acce40bc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>040355a9-e80c-4308-b85c-aa5b9fd25246</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    public static DescribeIntentStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentStatisticsRequest self = new DescribeIntentStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIntentStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIntentStatisticsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public DescribeIntentStatisticsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
