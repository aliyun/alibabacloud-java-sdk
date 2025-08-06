// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadProgress")
    public GetUploadProgressResponseBodyUploadProgress uploadProgress;

    public static GetUploadProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadProgressResponseBody self = new GetUploadProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadProgressResponseBody setUploadProgress(GetUploadProgressResponseBodyUploadProgress uploadProgress) {
        this.uploadProgress = uploadProgress;
        return this;
    }
    public GetUploadProgressResponseBodyUploadProgress getUploadProgress() {
        return this.uploadProgress;
    }

    public static class GetUploadProgressResponseBodyUploadProgressUploadProgressList extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("AuthInfo")
        public String authInfo;

        @NameInMap("AuthTimestamp")
        public String authTimestamp;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DonePartsCount")
        public Integer donePartsCount;

        @NameInMap("FileCreateTime")
        public String fileCreateTime;

        @NameInMap("FileHash")
        public String fileHash;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("PartSize")
        public Long partSize;

        @NameInMap("Source")
        public String source;

        @NameInMap("TerminalType")
        public String terminalType;

        @NameInMap("TotalPart")
        public String totalPart;

        @NameInMap("UploadAddress")
        public String uploadAddress;

        @NameInMap("UploadId")
        public String uploadId;

        @NameInMap("UploadPoint")
        public String uploadPoint;

        @NameInMap("UploadRatio")
        public Float uploadRatio;

        @NameInMap("UploadSpeed")
        public Float uploadSpeed;

        @NameInMap("VideoId")
        public String videoId;

        public static GetUploadProgressResponseBodyUploadProgressUploadProgressList build(java.util.Map<String, ?> map) throws Exception {
            GetUploadProgressResponseBodyUploadProgressUploadProgressList self = new GetUploadProgressResponseBodyUploadProgressUploadProgressList();
            return TeaModel.build(map, self);
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setAuthInfo(String authInfo) {
            this.authInfo = authInfo;
            return this;
        }
        public String getAuthInfo() {
            return this.authInfo;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setAuthTimestamp(String authTimestamp) {
            this.authTimestamp = authTimestamp;
            return this;
        }
        public String getAuthTimestamp() {
            return this.authTimestamp;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setDonePartsCount(Integer donePartsCount) {
            this.donePartsCount = donePartsCount;
            return this;
        }
        public Integer getDonePartsCount() {
            return this.donePartsCount;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setFileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }
        public String getFileCreateTime() {
            return this.fileCreateTime;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setPartSize(Long partSize) {
            this.partSize = partSize;
            return this;
        }
        public Long getPartSize() {
            return this.partSize;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setTotalPart(String totalPart) {
            this.totalPart = totalPart;
            return this;
        }
        public String getTotalPart() {
            return this.totalPart;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setUploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }
        public String getUploadAddress() {
            return this.uploadAddress;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setUploadPoint(String uploadPoint) {
            this.uploadPoint = uploadPoint;
            return this;
        }
        public String getUploadPoint() {
            return this.uploadPoint;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setUploadRatio(Float uploadRatio) {
            this.uploadRatio = uploadRatio;
            return this;
        }
        public Float getUploadRatio() {
            return this.uploadRatio;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setUploadSpeed(Float uploadSpeed) {
            this.uploadSpeed = uploadSpeed;
            return this;
        }
        public Float getUploadSpeed() {
            return this.uploadSpeed;
        }

        public GetUploadProgressResponseBodyUploadProgressUploadProgressList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

    public static class GetUploadProgressResponseBodyUploadProgress extends TeaModel {
        @NameInMap("UploadProgressList")
        public java.util.List<GetUploadProgressResponseBodyUploadProgressUploadProgressList> uploadProgressList;

        public static GetUploadProgressResponseBodyUploadProgress build(java.util.Map<String, ?> map) throws Exception {
            GetUploadProgressResponseBodyUploadProgress self = new GetUploadProgressResponseBodyUploadProgress();
            return TeaModel.build(map, self);
        }

        public GetUploadProgressResponseBodyUploadProgress setUploadProgressList(java.util.List<GetUploadProgressResponseBodyUploadProgressUploadProgressList> uploadProgressList) {
            this.uploadProgressList = uploadProgressList;
            return this;
        }
        public java.util.List<GetUploadProgressResponseBodyUploadProgressUploadProgressList> getUploadProgressList() {
            return this.uploadProgressList;
        }

    }

}
