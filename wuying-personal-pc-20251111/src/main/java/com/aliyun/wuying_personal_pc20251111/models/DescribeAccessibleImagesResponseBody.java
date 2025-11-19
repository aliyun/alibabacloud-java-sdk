// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeAccessibleImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeAccessibleImagesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeAccessibleImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleImagesResponseBody self = new DescribeAccessibleImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleImagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAccessibleImagesResponseBody setData(java.util.List<DescribeAccessibleImagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccessibleImagesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAccessibleImagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAccessibleImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessibleImagesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo extends TeaModel {
        @NameInMap("CurrentPassword")
        public String currentPassword;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageCode")
        public String imageCode;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("IsCopyPassword")
        public Boolean isCopyPassword;

        @NameInMap("IsEncrypted")
        public Boolean isEncrypted;

        @NameInMap("IsFree")
        public Boolean isFree;

        @NameInMap("PeriodDays")
        public Integer periodDays;

        @NameInMap("RedeemCount")
        public Integer redeemCount;

        @NameInMap("RedeemQuota")
        public Integer redeemQuota;

        public static DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo self = new DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setCurrentPassword(String currentPassword) {
            this.currentPassword = currentPassword;
            return this;
        }
        public String getCurrentPassword() {
            return this.currentPassword;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setImageCode(String imageCode) {
            this.imageCode = imageCode;
            return this;
        }
        public String getImageCode() {
            return this.imageCode;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setIsCopyPassword(Boolean isCopyPassword) {
            this.isCopyPassword = isCopyPassword;
            return this;
        }
        public Boolean getIsCopyPassword() {
            return this.isCopyPassword;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setIsFree(Boolean isFree) {
            this.isFree = isFree;
            return this;
        }
        public Boolean getIsFree() {
            return this.isFree;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setPeriodDays(Integer periodDays) {
            this.periodDays = periodDays;
            return this;
        }
        public Integer getPeriodDays() {
            return this.periodDays;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setRedeemCount(Integer redeemCount) {
            this.redeemCount = redeemCount;
            return this;
        }
        public Integer getRedeemCount() {
            return this.redeemCount;
        }

        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo setRedeemQuota(Integer redeemQuota) {
            this.redeemQuota = redeemQuota;
            return this;
        }
        public Integer getRedeemQuota() {
            return this.redeemQuota;
        }

    }

    public static class DescribeAccessibleImagesResponseBodyData extends TeaModel {
        @NameInMap("ActivityType")
        public String activityType;

        @NameInMap("AuthTime")
        public String authTime;

        @NameInMap("CanUpdate")
        public Boolean canUpdate;

        @NameInMap("CurrentImageCodeInfo")
        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo currentImageCodeInfo;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("DockerImageSize")
        public Integer dockerImageSize;

        @NameInMap("EnableStartUpConfig")
        public Boolean enableStartUpConfig;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageScope")
        public String imageScope;

        @NameInMap("ImageSource")
        public String imageSource;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("IsGpu")
        public Boolean isGpu;

        @NameInMap("IsLinggou")
        public String isLinggou;

        @NameInMap("IsWorkstation")
        public Boolean isWorkstation;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperationSystem")
        public String operationSystem;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ReceiverType")
        public String receiverType;

        @NameInMap("ShareCodes")
        public java.util.List<String> shareCodes;

        @NameInMap("ShareCodesIncludeDisable")
        public java.util.List<String> shareCodesIncludeDisable;

        @NameInMap("Shared")
        public Boolean shared;

        @NameInMap("SharedBy")
        public String sharedBy;

        @NameInMap("SourceDesktopId")
        public String sourceDesktopId;

        @NameInMap("SourceDesktopType")
        public String sourceDesktopType;

        @NameInMap("SourceImageId")
        public String sourceImageId;

        @NameInMap("SourceImageName")
        public String sourceImageName;

        @NameInMap("StartUpFileList")
        public java.util.List<String> startUpFileList;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportPublish")
        public Boolean supportPublish;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("ValidationCode")
        public String validationCode;

        public static DescribeAccessibleImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessibleImagesResponseBodyData self = new DescribeAccessibleImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccessibleImagesResponseBodyData setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public DescribeAccessibleImagesResponseBodyData setAuthTime(String authTime) {
            this.authTime = authTime;
            return this;
        }
        public String getAuthTime() {
            return this.authTime;
        }

        public DescribeAccessibleImagesResponseBodyData setCanUpdate(Boolean canUpdate) {
            this.canUpdate = canUpdate;
            return this;
        }
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        public DescribeAccessibleImagesResponseBodyData setCurrentImageCodeInfo(DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo currentImageCodeInfo) {
            this.currentImageCodeInfo = currentImageCodeInfo;
            return this;
        }
        public DescribeAccessibleImagesResponseBodyDataCurrentImageCodeInfo getCurrentImageCodeInfo() {
            return this.currentImageCodeInfo;
        }

        public DescribeAccessibleImagesResponseBodyData setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeAccessibleImagesResponseBodyData setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeAccessibleImagesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessibleImagesResponseBodyData setDockerImageSize(Integer dockerImageSize) {
            this.dockerImageSize = dockerImageSize;
            return this;
        }
        public Integer getDockerImageSize() {
            return this.dockerImageSize;
        }

        public DescribeAccessibleImagesResponseBodyData setEnableStartUpConfig(Boolean enableStartUpConfig) {
            this.enableStartUpConfig = enableStartUpConfig;
            return this;
        }
        public Boolean getEnableStartUpConfig() {
            return this.enableStartUpConfig;
        }

        public DescribeAccessibleImagesResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAccessibleImagesResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAccessibleImagesResponseBodyData setImageScope(String imageScope) {
            this.imageScope = imageScope;
            return this;
        }
        public String getImageScope() {
            return this.imageScope;
        }

        public DescribeAccessibleImagesResponseBodyData setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public DescribeAccessibleImagesResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeAccessibleImagesResponseBodyData setIsGpu(Boolean isGpu) {
            this.isGpu = isGpu;
            return this;
        }
        public Boolean getIsGpu() {
            return this.isGpu;
        }

        public DescribeAccessibleImagesResponseBodyData setIsLinggou(String isLinggou) {
            this.isLinggou = isLinggou;
            return this;
        }
        public String getIsLinggou() {
            return this.isLinggou;
        }

        public DescribeAccessibleImagesResponseBodyData setIsWorkstation(Boolean isWorkstation) {
            this.isWorkstation = isWorkstation;
            return this;
        }
        public Boolean getIsWorkstation() {
            return this.isWorkstation;
        }

        public DescribeAccessibleImagesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAccessibleImagesResponseBodyData setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public String getOperationSystem() {
            return this.operationSystem;
        }

        public DescribeAccessibleImagesResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAccessibleImagesResponseBodyData setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public DescribeAccessibleImagesResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeAccessibleImagesResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeAccessibleImagesResponseBodyData setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public DescribeAccessibleImagesResponseBodyData setShareCodes(java.util.List<String> shareCodes) {
            this.shareCodes = shareCodes;
            return this;
        }
        public java.util.List<String> getShareCodes() {
            return this.shareCodes;
        }

        public DescribeAccessibleImagesResponseBodyData setShareCodesIncludeDisable(java.util.List<String> shareCodesIncludeDisable) {
            this.shareCodesIncludeDisable = shareCodesIncludeDisable;
            return this;
        }
        public java.util.List<String> getShareCodesIncludeDisable() {
            return this.shareCodesIncludeDisable;
        }

        public DescribeAccessibleImagesResponseBodyData setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public DescribeAccessibleImagesResponseBodyData setSharedBy(String sharedBy) {
            this.sharedBy = sharedBy;
            return this;
        }
        public String getSharedBy() {
            return this.sharedBy;
        }

        public DescribeAccessibleImagesResponseBodyData setSourceDesktopId(String sourceDesktopId) {
            this.sourceDesktopId = sourceDesktopId;
            return this;
        }
        public String getSourceDesktopId() {
            return this.sourceDesktopId;
        }

        public DescribeAccessibleImagesResponseBodyData setSourceDesktopType(String sourceDesktopType) {
            this.sourceDesktopType = sourceDesktopType;
            return this;
        }
        public String getSourceDesktopType() {
            return this.sourceDesktopType;
        }

        public DescribeAccessibleImagesResponseBodyData setSourceImageId(String sourceImageId) {
            this.sourceImageId = sourceImageId;
            return this;
        }
        public String getSourceImageId() {
            return this.sourceImageId;
        }

        public DescribeAccessibleImagesResponseBodyData setSourceImageName(String sourceImageName) {
            this.sourceImageName = sourceImageName;
            return this;
        }
        public String getSourceImageName() {
            return this.sourceImageName;
        }

        public DescribeAccessibleImagesResponseBodyData setStartUpFileList(java.util.List<String> startUpFileList) {
            this.startUpFileList = startUpFileList;
            return this;
        }
        public java.util.List<String> getStartUpFileList() {
            return this.startUpFileList;
        }

        public DescribeAccessibleImagesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessibleImagesResponseBodyData setSupportPublish(Boolean supportPublish) {
            this.supportPublish = supportPublish;
            return this;
        }
        public Boolean getSupportPublish() {
            return this.supportPublish;
        }

        public DescribeAccessibleImagesResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeAccessibleImagesResponseBodyData setValidationCode(String validationCode) {
            this.validationCode = validationCode;
            return this;
        }
        public String getValidationCode() {
            return this.validationCode;
        }

    }

}
