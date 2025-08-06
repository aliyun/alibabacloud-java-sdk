// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFreeLicenseRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppPlatforms")
    public String appPlatforms;

    @NameInMap("SdkModels")
    public String sdkModels;

    public static AddFreeLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFreeLicenseRequest self = new AddFreeLicenseRequest();
        return TeaModel.build(map, self);
    }

    public AddFreeLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public AddFreeLicenseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddFreeLicenseRequest setAppPlatforms(String appPlatforms) {
        this.appPlatforms = appPlatforms;
        return this;
    }
    public String getAppPlatforms() {
        return this.appPlatforms;
    }

    public AddFreeLicenseRequest setSdkModels(String sdkModels) {
        this.sdkModels = sdkModels;
        return this;
    }
    public String getSdkModels() {
        return this.sdkModels;
    }

}
