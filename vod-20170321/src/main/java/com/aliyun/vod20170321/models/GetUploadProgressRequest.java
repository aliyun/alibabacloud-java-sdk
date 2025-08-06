// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadProgressRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthInfo")
    public String authInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthTimestamp")
    public Long authTimestamp;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Source")
    public String source;

    @NameInMap("TerminalType")
    public String terminalType;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadInfoList")
    public String uploadInfoList;

    @NameInMap("UserId")
    public Long userId;

    public static GetUploadProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadProgressRequest self = new GetUploadProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadProgressRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetUploadProgressRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public GetUploadProgressRequest setAuthTimestamp(Long authTimestamp) {
        this.authTimestamp = authTimestamp;
        return this;
    }
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    public GetUploadProgressRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetUploadProgressRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetUploadProgressRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public GetUploadProgressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetUploadProgressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetUploadProgressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetUploadProgressRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetUploadProgressRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

    public GetUploadProgressRequest setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public GetUploadProgressRequest setUploadInfoList(String uploadInfoList) {
        this.uploadInfoList = uploadInfoList;
        return this;
    }
    public String getUploadInfoList() {
        return this.uploadInfoList;
    }

    public GetUploadProgressRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
