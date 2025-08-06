// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayerConfigRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("AuthInfo")
    public String authInfo;

    @NameInMap("AuthTimestamp")
    public Long authTimestamp;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("OsName")
    public String osName;

    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("Rule")
    public String rule;

    public static GetPlayerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayerConfigRequest self = new GetPlayerConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPlayerConfigRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetPlayerConfigRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public GetPlayerConfigRequest setAuthTimestamp(Long authTimestamp) {
        this.authTimestamp = authTimestamp;
        return this;
    }
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    public GetPlayerConfigRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public GetPlayerConfigRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public GetPlayerConfigRequest setOsName(String osName) {
        this.osName = osName;
        return this;
    }
    public String getOsName() {
        return this.osName;
    }

    public GetPlayerConfigRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public GetPlayerConfigRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

}
