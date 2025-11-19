// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeImageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeImageDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeImageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageDetailResponseBody self = new DescribeImageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageDetailResponseBody setData(DescribeImageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeImageDetailResponseBodyDataCurrentImageCodeInfo extends TeaModel {
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

        public static DescribeImageDetailResponseBodyDataCurrentImageCodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageDetailResponseBodyDataCurrentImageCodeInfo self = new DescribeImageDetailResponseBodyDataCurrentImageCodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setCurrentPassword(String currentPassword) {
            this.currentPassword = currentPassword;
            return this;
        }
        public String getCurrentPassword() {
            return this.currentPassword;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setImageCode(String imageCode) {
            this.imageCode = imageCode;
            return this;
        }
        public String getImageCode() {
            return this.imageCode;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setIsCopyPassword(Boolean isCopyPassword) {
            this.isCopyPassword = isCopyPassword;
            return this;
        }
        public Boolean getIsCopyPassword() {
            return this.isCopyPassword;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setIsFree(Boolean isFree) {
            this.isFree = isFree;
            return this;
        }
        public Boolean getIsFree() {
            return this.isFree;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setPeriodDays(Integer periodDays) {
            this.periodDays = periodDays;
            return this;
        }
        public Integer getPeriodDays() {
            return this.periodDays;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setRedeemCount(Integer redeemCount) {
            this.redeemCount = redeemCount;
            return this;
        }
        public Integer getRedeemCount() {
            return this.redeemCount;
        }

        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo setRedeemQuota(Integer redeemQuota) {
            this.redeemQuota = redeemQuota;
            return this;
        }
        public Integer getRedeemQuota() {
            return this.redeemQuota;
        }

    }

    public static class DescribeImageDetailResponseBodyData extends TeaModel {
        @NameInMap("CurrentImageCodeInfo")
        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo currentImageCodeInfo;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableStartUpConfig")
        public Boolean enableStartUpConfig;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageScope")
        public String imageScope;

        @NameInMap("IsGpu")
        public Boolean isGpu;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ShareCodes")
        public java.util.List<String> shareCodes;

        @NameInMap("ShareCodesIncludeDisable")
        public java.util.List<String> shareCodesIncludeDisable;

        @NameInMap("Shared")
        public Boolean shared;

        @NameInMap("SourceDesktopType")
        public String sourceDesktopType;

        @NameInMap("StartUpFileList")
        public java.util.List<String> startUpFileList;

        @NameInMap("Status")
        public String status;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeImageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageDetailResponseBodyData self = new DescribeImageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageDetailResponseBodyData setCurrentImageCodeInfo(DescribeImageDetailResponseBodyDataCurrentImageCodeInfo currentImageCodeInfo) {
            this.currentImageCodeInfo = currentImageCodeInfo;
            return this;
        }
        public DescribeImageDetailResponseBodyDataCurrentImageCodeInfo getCurrentImageCodeInfo() {
            return this.currentImageCodeInfo;
        }

        public DescribeImageDetailResponseBodyData setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeImageDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageDetailResponseBodyData setEnableStartUpConfig(Boolean enableStartUpConfig) {
            this.enableStartUpConfig = enableStartUpConfig;
            return this;
        }
        public Boolean getEnableStartUpConfig() {
            return this.enableStartUpConfig;
        }

        public DescribeImageDetailResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeImageDetailResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageDetailResponseBodyData setImageScope(String imageScope) {
            this.imageScope = imageScope;
            return this;
        }
        public String getImageScope() {
            return this.imageScope;
        }

        public DescribeImageDetailResponseBodyData setIsGpu(Boolean isGpu) {
            this.isGpu = isGpu;
            return this;
        }
        public Boolean getIsGpu() {
            return this.isGpu;
        }

        public DescribeImageDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageDetailResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeImageDetailResponseBodyData setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public DescribeImageDetailResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImageDetailResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageDetailResponseBodyData setShareCodes(java.util.List<String> shareCodes) {
            this.shareCodes = shareCodes;
            return this;
        }
        public java.util.List<String> getShareCodes() {
            return this.shareCodes;
        }

        public DescribeImageDetailResponseBodyData setShareCodesIncludeDisable(java.util.List<String> shareCodesIncludeDisable) {
            this.shareCodesIncludeDisable = shareCodesIncludeDisable;
            return this;
        }
        public java.util.List<String> getShareCodesIncludeDisable() {
            return this.shareCodesIncludeDisable;
        }

        public DescribeImageDetailResponseBodyData setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public DescribeImageDetailResponseBodyData setSourceDesktopType(String sourceDesktopType) {
            this.sourceDesktopType = sourceDesktopType;
            return this;
        }
        public String getSourceDesktopType() {
            return this.sourceDesktopType;
        }

        public DescribeImageDetailResponseBodyData setStartUpFileList(java.util.List<String> startUpFileList) {
            this.startUpFileList = startUpFileList;
            return this;
        }
        public java.util.List<String> getStartUpFileList() {
            return this.startUpFileList;
        }

        public DescribeImageDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageDetailResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
