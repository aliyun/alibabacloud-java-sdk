// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEngineVersionResponseBody extends TeaModel {
    /**
     * <p>该实例当前可升级至最新的小版本信息。</p>
     */
    @NameInMap("DBLatestMinorVersion")
    public DescribeEngineVersionResponseBodyDBLatestMinorVersion DBLatestMinorVersion;

    /**
     * <p>The release notes for the minor version of the instance, including the release date, minor version number, release type such as new feature, and description.</p>
     */
    @NameInMap("DBVersionRelease")
    public String DBVersionRelease;

    /**
     * <p>Indicates whether the major version can be upgraded for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: The major version can be upgraded.</p>
     * <p>*   **false**: The major version is the latest version and cannot be upgraded.</p>
     * <br>
     * <p>>  To upgrade the major version, call the [ModifyInstanceMajorVersion](~~95259~~) operation.</p>
     */
    @NameInMap("EnableUpgradeMajorVersion")
    public Boolean enableUpgradeMajorVersion;

    /**
     * <p>Indicates whether the minor version can be updated for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: The minor version can be updated.</p>
     * <p>*   **false**: The minor version is the latest version and cannot be updated.</p>
     * <br>
     * <p>>  To update the minor version, call the [ModifyInstanceMinorVersion](~~129381~~) operation.</p>
     */
    @NameInMap("EnableUpgradeMinorVersion")
    public Boolean enableUpgradeMinorVersion;

    /**
     * <p>The database engine of the instance. Valid values: **redis** and **memcache**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>是否打开了小版本升级。</p>
     */
    @NameInMap("IsAutoUpgradeOpen")
    public String isAutoUpgradeOpen;

    /**
     * <p>Indicates whether the instance minor version is the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**: The instance minor version is the latest version.</p>
     * <p>*   **false**: The instance minor version is not the latest version.</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>是否支持新版 ssl。</p>
     */
    @NameInMap("IsNewSSLMode")
    public String isNewSSLMode;

    @NameInMap("IsOpenNGLB")
    public String isOpenNGLB;

    /**
     * <p>Indicates whether the instance supports the new SSL encryption feature.</p>
     */
    @NameInMap("IsRedisCompatibleVersion")
    public String isRedisCompatibleVersion;

    /**
     * <p>是否打开了小版本升级。</p>
     */
    @NameInMap("IsSSLEnable")
    public String isSSLEnable;

    /**
     * <p>The major version of the instance.</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The minor version of the instance.</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

    /**
     * <p>该Proxy节点当前可升级至最新的小版本信息。</p>
     */
    @NameInMap("ProxyLatestMinorVersion")
    public DescribeEngineVersionResponseBodyProxyLatestMinorVersion proxyLatestMinorVersion;

    /**
     * <p>The minor version of proxy nodes.</p>
     * <br>
     * <p>>  This parameter is returned only for cluster and read/write splitting instances.</p>
     */
    @NameInMap("ProxyMinorVersion")
    public String proxyMinorVersion;

    /**
     * <p>The release notes for the minor version of proxy nodes. The release notes include the release date, minor version number, release type such as new feature, and description.</p>
     * <br>
     * <p>>  This parameter is returned only for cluster and read/write splitting instances.</p>
     */
    @NameInMap("ProxyVersionRelease")
    public String proxyVersionRelease;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEngineVersionResponseBody self = new DescribeEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEngineVersionResponseBody setDBLatestMinorVersion(DescribeEngineVersionResponseBodyDBLatestMinorVersion DBLatestMinorVersion) {
        this.DBLatestMinorVersion = DBLatestMinorVersion;
        return this;
    }
    public DescribeEngineVersionResponseBodyDBLatestMinorVersion getDBLatestMinorVersion() {
        return this.DBLatestMinorVersion;
    }

    public DescribeEngineVersionResponseBody setDBVersionRelease(String DBVersionRelease) {
        this.DBVersionRelease = DBVersionRelease;
        return this;
    }
    public String getDBVersionRelease() {
        return this.DBVersionRelease;
    }

    public DescribeEngineVersionResponseBody setEnableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
        this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
        return this;
    }
    public Boolean getEnableUpgradeMajorVersion() {
        return this.enableUpgradeMajorVersion;
    }

    public DescribeEngineVersionResponseBody setEnableUpgradeMinorVersion(Boolean enableUpgradeMinorVersion) {
        this.enableUpgradeMinorVersion = enableUpgradeMinorVersion;
        return this;
    }
    public Boolean getEnableUpgradeMinorVersion() {
        return this.enableUpgradeMinorVersion;
    }

    public DescribeEngineVersionResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeEngineVersionResponseBody setIsAutoUpgradeOpen(String isAutoUpgradeOpen) {
        this.isAutoUpgradeOpen = isAutoUpgradeOpen;
        return this;
    }
    public String getIsAutoUpgradeOpen() {
        return this.isAutoUpgradeOpen;
    }

    public DescribeEngineVersionResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeEngineVersionResponseBody setIsNewSSLMode(String isNewSSLMode) {
        this.isNewSSLMode = isNewSSLMode;
        return this;
    }
    public String getIsNewSSLMode() {
        return this.isNewSSLMode;
    }

    public DescribeEngineVersionResponseBody setIsOpenNGLB(String isOpenNGLB) {
        this.isOpenNGLB = isOpenNGLB;
        return this;
    }
    public String getIsOpenNGLB() {
        return this.isOpenNGLB;
    }

    public DescribeEngineVersionResponseBody setIsRedisCompatibleVersion(String isRedisCompatibleVersion) {
        this.isRedisCompatibleVersion = isRedisCompatibleVersion;
        return this;
    }
    public String getIsRedisCompatibleVersion() {
        return this.isRedisCompatibleVersion;
    }

    public DescribeEngineVersionResponseBody setIsSSLEnable(String isSSLEnable) {
        this.isSSLEnable = isSSLEnable;
        return this;
    }
    public String getIsSSLEnable() {
        return this.isSSLEnable;
    }

    public DescribeEngineVersionResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeEngineVersionResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeEngineVersionResponseBody setProxyLatestMinorVersion(DescribeEngineVersionResponseBodyProxyLatestMinorVersion proxyLatestMinorVersion) {
        this.proxyLatestMinorVersion = proxyLatestMinorVersion;
        return this;
    }
    public DescribeEngineVersionResponseBodyProxyLatestMinorVersion getProxyLatestMinorVersion() {
        return this.proxyLatestMinorVersion;
    }

    public DescribeEngineVersionResponseBody setProxyMinorVersion(String proxyMinorVersion) {
        this.proxyMinorVersion = proxyMinorVersion;
        return this;
    }
    public String getProxyMinorVersion() {
        return this.proxyMinorVersion;
    }

    public DescribeEngineVersionResponseBody setProxyVersionRelease(String proxyVersionRelease) {
        this.proxyVersionRelease = proxyVersionRelease;
        return this;
    }
    public String getProxyVersionRelease() {
        return this.proxyVersionRelease;
    }

    public DescribeEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList extends TeaModel {
        /**
         * <p>实例的创建时间。</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>重要等级。</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>版本发布说明。</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>可升级的版本英文描述。</p>
         */
        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        /**
         * <p>EMR发行版。</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        public static DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList self = new DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

    }

    public static class DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo extends TeaModel {
        @NameInMap("ReleaseInfoList")
        public java.util.List<DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> releaseInfoList;

        public static DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo self = new DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo setReleaseInfoList(java.util.List<DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> releaseInfoList) {
            this.releaseInfoList = releaseInfoList;
            return this;
        }
        public java.util.List<DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> getReleaseInfoList() {
            return this.releaseInfoList;
        }

    }

    public static class DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease extends TeaModel {
        /**
         * <p>小版本信息。</p>
         */
        @NameInMap("ReleaseInfo")
        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo releaseInfo;

        /**
         * <p>版本升级的重要性（推荐升级程度），取值：</p>
         * <p>* 0：一般重要</p>
         * <p>* 1：比较重要</p>
         * <p>* 2：非常重要</p>
         */
        @NameInMap("VersionChangesLevel")
        public String versionChangesLevel;

        public static DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease self = new DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease setReleaseInfo(DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo releaseInfo) {
            this.releaseInfo = releaseInfo;
            return this;
        }
        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo getReleaseInfo() {
            return this.releaseInfo;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease setVersionChangesLevel(String versionChangesLevel) {
            this.versionChangesLevel = versionChangesLevel;
            return this;
        }
        public String getVersionChangesLevel() {
            return this.versionChangesLevel;
        }

    }

    public static class DescribeEngineVersionResponseBodyDBLatestMinorVersion extends TeaModel {
        /**
         * <p>版本变更的重要性，取值：</p>
         * <p>* **0**：一般重要</p>
         * <p>* **1**：比较重要</p>
         * <p>* **2**：非常重要</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>版本号。</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>从实例当前小版本到最新小版本的版本演进路线，与版本文档一致，可以直接至版本说明文档查看更详细的信息。</p>
         */
        @NameInMap("VersionRelease")
        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease versionRelease;

        public static DescribeEngineVersionResponseBodyDBLatestMinorVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyDBLatestMinorVersion self = new DescribeEngineVersionResponseBodyDBLatestMinorVersion();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersion setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersion setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeEngineVersionResponseBodyDBLatestMinorVersion setVersionRelease(DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease versionRelease) {
            this.versionRelease = versionRelease;
            return this;
        }
        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionRelease getVersionRelease() {
            return this.versionRelease;
        }

    }

    public static class DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList extends TeaModel {
        /**
         * <p>版本的发布时间。</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>版本变更的重要性，取值：</p>
         * <p>* **0**：一般重要</p>
         * <p>* **1**：比较重要</p>
         * <p>* **2**：非常重要</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>版本的变更说明。</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>可升级的版本英文描述。</p>
         */
        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        /**
         * <p>EMR发行版。</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        public static DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList self = new DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

    }

    public static class DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo extends TeaModel {
        @NameInMap("ReleaseInfoList")
        public java.util.List<DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> releaseInfoList;

        public static DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo self = new DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo setReleaseInfoList(java.util.List<DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> releaseInfoList) {
            this.releaseInfoList = releaseInfoList;
            return this;
        }
        public java.util.List<DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfoReleaseInfoList> getReleaseInfoList() {
            return this.releaseInfoList;
        }

    }

    public static class DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease extends TeaModel {
        /**
         * <p>小版本信息。</p>
         */
        @NameInMap("ReleaseInfo")
        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo releaseInfo;

        /**
         * <p>版本升级的重要性（推荐升级程度），取值：</p>
         * <p>* 0：一般重要</p>
         * <p>* 1：比较重要</p>
         * <p>* 2：非常重要</p>
         */
        @NameInMap("VersionChangesLevel")
        public String versionChangesLevel;

        public static DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease self = new DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease setReleaseInfo(DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo releaseInfo) {
            this.releaseInfo = releaseInfo;
            return this;
        }
        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo getReleaseInfo() {
            return this.releaseInfo;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease setVersionChangesLevel(String versionChangesLevel) {
            this.versionChangesLevel = versionChangesLevel;
            return this;
        }
        public String getVersionChangesLevel() {
            return this.versionChangesLevel;
        }

    }

    public static class DescribeEngineVersionResponseBodyProxyLatestMinorVersion extends TeaModel {
        /**
         * <p>版本变更的重要性，取值：</p>
         * <p>* **0**：一般重要</p>
         * <p>* **1**：比较重要</p>
         * <p>* **2**：非常重要</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>版本号。</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>从实例当前小版本到最新小版本的版本演进路线，与版本文档一致，可以直接至版本说明文档查看更详细的信息。</p>
         */
        @NameInMap("VersionRelease")
        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease versionRelease;

        public static DescribeEngineVersionResponseBodyProxyLatestMinorVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeEngineVersionResponseBodyProxyLatestMinorVersion self = new DescribeEngineVersionResponseBodyProxyLatestMinorVersion();
            return TeaModel.build(map, self);
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersion setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersion setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeEngineVersionResponseBodyProxyLatestMinorVersion setVersionRelease(DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease versionRelease) {
            this.versionRelease = versionRelease;
            return this;
        }
        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionRelease getVersionRelease() {
            return this.versionRelease;
        }

    }

}
