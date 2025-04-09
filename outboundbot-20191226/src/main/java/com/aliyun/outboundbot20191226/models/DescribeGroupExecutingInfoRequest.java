// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGroupExecutingInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3640dda7-e5b1-4b3e-9ccf-da4fc5402e11</p>
     */
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
