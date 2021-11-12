// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class BindInstance2VpcRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceVpcName")
    public String instanceVpcName;

    @NameInMap("Network")
    public String network;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VirtualSwitchId")
    public String virtualSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static BindInstance2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInstance2VpcRequest self = new BindInstance2VpcRequest();
        return TeaModel.build(map, self);
    }

    public BindInstance2VpcRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public BindInstance2VpcRequest setInstanceVpcName(String instanceVpcName) {
        this.instanceVpcName = instanceVpcName;
        return this;
    }
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    public BindInstance2VpcRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public BindInstance2VpcRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public BindInstance2VpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindInstance2VpcRequest setVirtualSwitchId(String virtualSwitchId) {
        this.virtualSwitchId = virtualSwitchId;
        return this;
    }
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    public BindInstance2VpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
