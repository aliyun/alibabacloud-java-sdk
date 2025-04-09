// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDialogueNodeStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeff669b-388f-4619-82af-81e177df5628</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a3c670d1-01bf-491d-b9aa-759b1a82f47c</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    public static DescribeDialogueNodeStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogueNodeStatisticsRequest self = new DescribeDialogueNodeStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDialogueNodeStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDialogueNodeStatisticsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public DescribeDialogueNodeStatisticsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
