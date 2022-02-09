// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupStrategyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStrategyRequest self = new DescribeBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
