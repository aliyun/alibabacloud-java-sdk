// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppServiceId")
    public String appServiceId;

    @NameInMap("InstanceCount")
    public Long instanceCount;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ShareMode")
    public Boolean shareMode;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("ListenersRepeatList")
    public java.util.List<String> listenersRepeatList;

    public static CreateCasLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceRequest self = new CreateCasLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateCasLoadbalanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCasLoadbalanceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public CreateCasLoadbalanceRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateCasLoadbalanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateCasLoadbalanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasLoadbalanceRequest setShareMode(Boolean shareMode) {
        this.shareMode = shareMode;
        return this;
    }
    public Boolean getShareMode() {
        return this.shareMode;
    }

    public CreateCasLoadbalanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateCasLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateCasLoadbalanceRequest setListenersRepeatList(java.util.List<String> listenersRepeatList) {
        this.listenersRepeatList = listenersRepeatList;
        return this;
    }
    public java.util.List<String> getListenersRepeatList() {
        return this.listenersRepeatList;
    }

}
