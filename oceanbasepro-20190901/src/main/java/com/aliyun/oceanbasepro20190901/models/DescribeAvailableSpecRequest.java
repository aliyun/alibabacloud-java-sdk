// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("UpgradeType")
    public String upgradeType;

    public static DescribeAvailableSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableSpecRequest self = new DescribeAvailableSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableSpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeAvailableSpecRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

}
