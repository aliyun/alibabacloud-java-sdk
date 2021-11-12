// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class UnbindInstance2VpcRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceVpcName")
    public String instanceVpcName;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UnbindInstance2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstance2VpcRequest self = new UnbindInstance2VpcRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInstance2VpcRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UnbindInstance2VpcRequest setInstanceVpcName(String instanceVpcName) {
        this.instanceVpcName = instanceVpcName;
        return this;
    }
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    public UnbindInstance2VpcRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public UnbindInstance2VpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
