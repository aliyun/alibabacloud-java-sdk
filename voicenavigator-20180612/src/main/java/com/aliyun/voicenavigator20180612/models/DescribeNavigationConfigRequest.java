// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeNavigationConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeNavigationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNavigationConfigRequest self = new DescribeNavigationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNavigationConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
