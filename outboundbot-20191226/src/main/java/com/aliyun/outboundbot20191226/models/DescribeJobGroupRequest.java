// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupRequest extends TeaModel {
    @NameInMap("BriefTypes")
    public java.util.List<String> briefTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46a9ad0c-3e11-44da-a9a7-2c21bf5ce185</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DescribeJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupRequest self = new DescribeJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupRequest setBriefTypes(java.util.List<String> briefTypes) {
        this.briefTypes = briefTypes;
        return this;
    }
    public java.util.List<String> getBriefTypes() {
        return this.briefTypes;
    }

    public DescribeJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeJobGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
