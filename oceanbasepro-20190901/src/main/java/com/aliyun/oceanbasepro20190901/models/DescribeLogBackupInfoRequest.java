// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeLogBackupInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeLogBackupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupInfoRequest self = new DescribeLogBackupInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
