// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaseVersion")
    public String baseVersion;

    @NameInMap("Channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OsVersion")
    public String osVersion;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetVersionType")
    public String targetVersionType;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetDeviceOtaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoRequest self = new GetDeviceOtaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoRequest setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public String getBaseVersion() {
        return this.baseVersion;
    }

    public GetDeviceOtaInfoRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetDeviceOtaInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceOtaInfoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetDeviceOtaInfoRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetDeviceOtaInfoRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public GetDeviceOtaInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetDeviceOtaInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDeviceOtaInfoRequest setTargetVersionType(String targetVersionType) {
        this.targetVersionType = targetVersionType;
        return this;
    }
    public String getTargetVersionType() {
        return this.targetVersionType;
    }

    public GetDeviceOtaInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
