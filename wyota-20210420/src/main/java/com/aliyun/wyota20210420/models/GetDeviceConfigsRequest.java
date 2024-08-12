// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceConfigsRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Region")
    public String region;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("UrclVersion")
    public String urclVersion;

    @NameInMap("UserCustomId")
    public String userCustomId;

    public static GetDeviceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigsRequest self = new GetDeviceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetDeviceConfigsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetDeviceConfigsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public GetDeviceConfigsRequest setUrclVersion(String urclVersion) {
        this.urclVersion = urclVersion;
        return this;
    }
    public String getUrclVersion() {
        return this.urclVersion;
    }

    public GetDeviceConfigsRequest setUserCustomId(String userCustomId) {
        this.userCustomId = userCustomId;
        return this;
    }
    public String getUserCustomId() {
        return this.userCustomId;
    }

}
