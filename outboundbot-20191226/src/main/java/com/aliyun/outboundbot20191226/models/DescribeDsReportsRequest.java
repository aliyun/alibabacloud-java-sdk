// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDsReportsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9eb8fe4f-b286-4834-9688-2c9b171e223e</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DescribeDsReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDsReportsRequest self = new DescribeDsReportsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDsReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDsReportsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
