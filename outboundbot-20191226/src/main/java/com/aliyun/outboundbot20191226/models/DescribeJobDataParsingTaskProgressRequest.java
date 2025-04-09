// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobDataParsingTaskProgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c209abb3-6804-4a75-b2c7-dd55c8c61b6a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50d5e164-9365-4261-980e-3d979c2c948c</p>
     */
    @NameInMap("JobDataParsingTaskId")
    public String jobDataParsingTaskId;

    public static DescribeJobDataParsingTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobDataParsingTaskProgressRequest self = new DescribeJobDataParsingTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobDataParsingTaskProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeJobDataParsingTaskProgressRequest setJobDataParsingTaskId(String jobDataParsingTaskId) {
        this.jobDataParsingTaskId = jobDataParsingTaskId;
        return this;
    }
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

}
