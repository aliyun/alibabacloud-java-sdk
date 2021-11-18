// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Region extends TeaModel {
    // 城市
    @NameInMap("RegionCity")
    public String regionCity;

    // id
    @NameInMap("RegionId")
    public String regionId;

    // 名称
    @NameInMap("RegionName")
    public String regionName;

    // 州省
    @NameInMap("RegionState")
    public String regionState;

    // 服务地址
    @NameInMap("ServiceUrl")
    public String serviceUrl;

    public static Region build(java.util.Map<String, ?> map) throws Exception {
        Region self = new Region();
        return TeaModel.build(map, self);
    }

    public Region setRegionCity(String regionCity) {
        this.regionCity = regionCity;
        return this;
    }
    public String getRegionCity() {
        return this.regionCity;
    }

    public Region setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Region setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public Region setRegionState(String regionState) {
        this.regionState = regionState;
        return this;
    }
    public String getRegionState() {
        return this.regionState;
    }

    public Region setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }
    public String getServiceUrl() {
        return this.serviceUrl;
    }

}
