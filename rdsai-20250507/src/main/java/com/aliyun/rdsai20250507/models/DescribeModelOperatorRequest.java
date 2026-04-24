// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeModelOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorRequest self = new DescribeModelOperatorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
