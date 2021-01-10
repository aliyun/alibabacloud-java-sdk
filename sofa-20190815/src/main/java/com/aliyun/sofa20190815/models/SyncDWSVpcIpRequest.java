// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncDWSVpcIpRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcMappingIpJsonStr")
    public String vpcMappingIpJsonStr;

    public static SyncDWSVpcIpRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDWSVpcIpRequest self = new SyncDWSVpcIpRequest();
        return TeaModel.build(map, self);
    }

    public SyncDWSVpcIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncDWSVpcIpRequest setVpcMappingIpJsonStr(String vpcMappingIpJsonStr) {
        this.vpcMappingIpJsonStr = vpcMappingIpJsonStr;
        return this;
    }
    public String getVpcMappingIpJsonStr() {
        return this.vpcMappingIpJsonStr;
    }

}
