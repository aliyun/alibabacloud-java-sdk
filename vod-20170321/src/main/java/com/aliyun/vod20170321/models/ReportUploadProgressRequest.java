// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ReportUploadProgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DonePartsCount")
    public Integer donePartsCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartSize")
    public Long partSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    @NameInMap("TotalPart")
    public Integer totalPart;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadPoint")
    public String uploadPoint;

    @NameInMap("UploadRatio")
    public Float uploadRatio;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("VideoId")
    public String videoId;

    public static ReportUploadProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadProgressRequest self = new ReportUploadProgressRequest();
        return TeaModel.build(map, self);
    }

    public ReportUploadProgressRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ReportUploadProgressRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public ReportUploadProgressRequest setAuthTimestamp(Long authTimestamp) {
        this.authTimestamp = authTimestamp;
        return this;
    }
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    public ReportUploadProgressRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ReportUploadProgressRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ReportUploadProgressRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public ReportUploadProgressRequest setDonePartsCount(Integer donePartsCount) {
        this.donePartsCount = donePartsCount;
        return this;
    }
    public Integer getDonePartsCount() {
        return this.donePartsCount;
    }

    public ReportUploadProgressRequest setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public ReportUploadProgressRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public ReportUploadProgressRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ReportUploadProgressRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public ReportUploadProgressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportUploadProgressRequest setPartSize(Long partSize) {
        this.partSize = partSize;
        return this;
    }
    public Long getPartSize() {
        return this.partSize;
    }

    public ReportUploadProgressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportUploadProgressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReportUploadProgressRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ReportUploadProgressRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

    public ReportUploadProgressRequest setTotalPart(Integer totalPart) {
        this.totalPart = totalPart;
        return this;
    }
    public Integer getTotalPart() {
        return this.totalPart;
    }

    public ReportUploadProgressRequest setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public ReportUploadProgressRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public ReportUploadProgressRequest setUploadPoint(String uploadPoint) {
        this.uploadPoint = uploadPoint;
        return this;
    }
    public String getUploadPoint() {
        return this.uploadPoint;
    }

    public ReportUploadProgressRequest setUploadRatio(Float uploadRatio) {
        this.uploadRatio = uploadRatio;
        return this;
    }
    public Float getUploadRatio() {
        return this.uploadRatio;
    }

    public ReportUploadProgressRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ReportUploadProgressRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
