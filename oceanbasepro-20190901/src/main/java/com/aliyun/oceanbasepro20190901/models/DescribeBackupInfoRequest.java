// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeBackupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupInfoRequest self = new DescribeBackupInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
