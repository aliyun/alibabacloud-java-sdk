// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobDataParsingTaskProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

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
