// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SetAllowIPRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Product")
    public String product;

    @NameInMap("AllowIP")
    public String allowIP;

    @NameInMap("Append")
    public Boolean append;

    public static SetAllowIPRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAllowIPRequest self = new SetAllowIPRequest();
        return TeaModel.build(map, self);
    }

    public SetAllowIPRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetAllowIPRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SetAllowIPRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SetAllowIPRequest setAllowIP(String allowIP) {
        this.allowIP = allowIP;
        return this;
    }
    public String getAllowIP() {
        return this.allowIP;
    }

    public SetAllowIPRequest setAppend(Boolean append) {
        this.append = append;
        return this;
    }
    public Boolean getAppend() {
        return this.append;
    }

}
