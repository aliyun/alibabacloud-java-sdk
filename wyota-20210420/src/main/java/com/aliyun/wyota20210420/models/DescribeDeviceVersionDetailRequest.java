// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceVersionDetailRequest extends TeaModel {
    @NameInMap("Model")
    public String model;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Region")
    public String region;

    @NameInMap("VersionName")
    public String versionName;

    public static DescribeDeviceVersionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceVersionDetailRequest self = new DescribeDeviceVersionDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceVersionDetailRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeDeviceVersionDetailRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDeviceVersionDetailRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDeviceVersionDetailRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
