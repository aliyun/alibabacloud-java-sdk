// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeWhitelistIpsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rds_copilot****_public_cn-4****02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeWhitelistIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistIpsRequest self = new DescribeWhitelistIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
