// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddEndPointRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("VpcID")
    public String vpcID;

    @NameInMap("Vswitch")
    public String vswitch;

    @NameInMap("Zone")
    public String zone;

    @NameInMap("Product")
    public String product;

    public static AddEndPointRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEndPointRequest self = new AddEndPointRequest();
        return TeaModel.build(map, self);
    }

    public AddEndPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddEndPointRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public AddEndPointRequest setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }
    public String getVpcID() {
        return this.vpcID;
    }

    public AddEndPointRequest setVswitch(String vswitch) {
        this.vswitch = vswitch;
        return this;
    }
    public String getVswitch() {
        return this.vswitch;
    }

    public AddEndPointRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public AddEndPointRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
