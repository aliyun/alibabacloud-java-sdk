// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Brand")
    public String brand;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("OS")
    public String OS;

    @NameInMap("OSVersion")
    public String OSVersion;

    @NameInMap("SDKVersion")
    public String SDKVersion;

    public static GetPlayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayConfigRequest self = new GetPlayConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPlayConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetPlayConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetPlayConfigRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public GetPlayConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetPlayConfigRequest setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public String getOS() {
        return this.OS;
    }

    public GetPlayConfigRequest setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
        return this;
    }
    public String getOSVersion() {
        return this.OSVersion;
    }

    public GetPlayConfigRequest setSDKVersion(String SDKVersion) {
        this.SDKVersion = SDKVersion;
        return this;
    }
    public String getSDKVersion() {
        return this.SDKVersion;
    }

}
