// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditLicenseRequest extends TeaModel {
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

    public static EditLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        EditLicenseRequest self = new EditLicenseRequest();
        return TeaModel.build(map, self);
    }

    public EditLicenseRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public EditLicenseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EditLicenseRequest setAppPlatforms(String appPlatforms) {
        this.appPlatforms = appPlatforms;
        return this;
    }
    public String getAppPlatforms() {
        return this.appPlatforms;
    }

    public EditLicenseRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public EditLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditLicenseRequest setSdkModels(String sdkModels) {
        this.sdkModels = sdkModels;
        return this;
    }
    public String getSdkModels() {
        return this.sdkModels;
    }

}
