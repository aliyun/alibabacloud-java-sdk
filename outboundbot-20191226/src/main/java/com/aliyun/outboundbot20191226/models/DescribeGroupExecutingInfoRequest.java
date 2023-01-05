// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGroupExecutingInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DescribeGroupExecutingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupExecutingInfoRequest self = new DescribeGroupExecutingInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupExecutingInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGroupExecutingInfoRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
