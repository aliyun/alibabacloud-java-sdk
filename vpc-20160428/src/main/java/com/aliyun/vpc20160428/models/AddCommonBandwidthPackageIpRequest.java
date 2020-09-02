// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("IpInstanceId")
    @Validation(required = true)
    public String ipInstanceId;

    @NameInMap("IpType")
    public String ipType;

    public static AddCommonBandwidthPackageIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpRequest self = new AddCommonBandwidthPackageIpRequest();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCommonBandwidthPackageIpRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public AddCommonBandwidthPackageIpRequest setIpInstanceId(String ipInstanceId) {
        this.ipInstanceId = ipInstanceId;
        return this;
    }
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    public AddCommonBandwidthPackageIpRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

}
