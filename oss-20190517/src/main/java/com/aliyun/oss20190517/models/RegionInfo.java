// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RegionInfo extends TeaModel {
    // accelerate endpoint
    @NameInMap("AccelerateEndpoint")
    public String accelerateEndpoint;

    // internal endpoint
    @NameInMap("InternalEndpoint")
    public String internalEndpoint;

    // internet endpoint
    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    // region
    @NameInMap("Region")
    public String region;

    public static RegionInfo build(java.util.Map<String, ?> map) throws Exception {
        RegionInfo self = new RegionInfo();
        return TeaModel.build(map, self);
    }

    public RegionInfo setAccelerateEndpoint(String accelerateEndpoint) {
        this.accelerateEndpoint = accelerateEndpoint;
        return this;
    }
    public String getAccelerateEndpoint() {
        return this.accelerateEndpoint;
    }

    public RegionInfo setInternalEndpoint(String internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
        return this;
    }
    public String getInternalEndpoint() {
        return this.internalEndpoint;
    }

    public RegionInfo setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public RegionInfo setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
