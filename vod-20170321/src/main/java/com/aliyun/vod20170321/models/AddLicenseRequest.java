// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddLicenseRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppPlatforms")
    public String appPlatforms;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SdkModels")
    public String sdkModels;

    public static AddLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLicenseRequest self = new AddLicenseRequest();
        return TeaModel.build(map, self);
    }

    public AddLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public AddLicenseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLicenseRequest setAppPlatforms(String appPlatforms) {
        this.appPlatforms = appPlatforms;
        return this;
    }
    public String getAppPlatforms() {
        return this.appPlatforms;
    }

    public AddLicenseRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public AddLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddLicenseRequest setSdkModels(String sdkModels) {
        this.sdkModels = sdkModels;
        return this;
    }
    public String getSdkModels() {
        return this.sdkModels;
    }

}
