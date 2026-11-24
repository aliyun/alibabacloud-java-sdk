// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AppInfoDTO extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>vod-demo-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application type. Valid values:</p>
     * <ul>
     * <li>1: Common application.</li>
     * <li>2: Embedded SDK.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02T03:04:05Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 03:04:05</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 03:04:05</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3ba9c7d21f4e6a80</p>
     */
    @NameInMap("ItemId")
    public String itemId;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02T03:04:05Z</p>
     */
    @NameInMap("ModificationTime")
    public String modificationTime;

    /**
     * <p>The list of platform information included in the application.</p>
     */
    @NameInMap("Platforms")
    public java.util.List<AppInfoDTOPlatforms> platforms;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2544469002080159</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static AppInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoDTO self = new AppInfoDTO();
        return TeaModel.build(map, self);
    }

    public AppInfoDTO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInfoDTO setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public AppInfoDTO setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AppInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppInfoDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppInfoDTO setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public AppInfoDTO setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public AppInfoDTO setPlatforms(java.util.List<AppInfoDTOPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<AppInfoDTOPlatforms> getPlatforms() {
        return this.platforms;
    }

    public AppInfoDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class AppInfoDTOPlatforms extends TeaModel {
        /**
         * <p>The platform ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3ba9c7d21f4e6a81</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The authorization list.</p>
         */
        @NameInMap("LicenseItemIds")
        public java.util.List<String> licenseItemIds;

        /**
         * <p>The package name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.vodapp</p>
         */
        @NameInMap("PkgName")
        public String pkgName;

        /**
         * <p>The package signature.</p>
         * 
         * <strong>example:</strong>
         * <p>8e610rzjg613h0u58v8473d029h7</p>
         */
        @NameInMap("PkgSignature")
        public String pkgSignature;

        /**
         * <p>The platform type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PlatformType")
        public Long platformType;

        /**
         * <p>The platform type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static AppInfoDTOPlatforms build(java.util.Map<String, ?> map) throws Exception {
            AppInfoDTOPlatforms self = new AppInfoDTOPlatforms();
            return TeaModel.build(map, self);
        }

        public AppInfoDTOPlatforms setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public AppInfoDTOPlatforms setLicenseItemIds(java.util.List<String> licenseItemIds) {
            this.licenseItemIds = licenseItemIds;
            return this;
        }
        public java.util.List<String> getLicenseItemIds() {
            return this.licenseItemIds;
        }

        public AppInfoDTOPlatforms setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public AppInfoDTOPlatforms setPkgSignature(String pkgSignature) {
            this.pkgSignature = pkgSignature;
            return this;
        }
        public String getPkgSignature() {
            return this.pkgSignature;
        }

        public AppInfoDTOPlatforms setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

        public AppInfoDTOPlatforms setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
