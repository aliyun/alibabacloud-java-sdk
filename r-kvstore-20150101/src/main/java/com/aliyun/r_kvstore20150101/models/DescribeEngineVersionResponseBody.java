// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The information about the latest minor version to which the instance can be upgraded.</p>
     */
    @NameInMap("DBLatestMinorVersion")
    public DescribeEngineVersionResponseBodyDBLatestMinorVersion DBLatestMinorVersion;

    /**
     * <p>The update notes for the minor version of the instance, including the release time, minor version number, type (such as new feature), and detailed description.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;releaseInfo\&quot;:{\&quot;createTime\&quot;:\&quot;2021-07-27\&quot;,\&quot;level\&quot;:1,\&quot;releaseVersion\&quot;:\&quot;0.5.4\&quot;,\&quot;releaseNote\&quot;:\&quot;Feature update: Enhanced stability.\&quot;}],\&quot;versionChangesLevel\&quot;:2}</p>
     */
    @NameInMap("DBVersionRelease")
    public String DBVersionRelease;

    /**
     * <p>Indicates whether the major version of the instance can be upgraded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The major version can be upgraded.</li>
     * <li><strong>false</strong>: The major version cannot be upgraded, usually because it is already the latest version.</li>
     * </ul>
     * <blockquote>
     * <p>To upgrade the major version, call the <a href="https://help.aliyun.com/document_detail/473776.html">ModifyInstanceMajorVersion</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUpgradeMajorVersion")
    public Boolean enableUpgradeMajorVersion;

    /**
     * <p>Indicates whether the minor version of the instance can be upgraded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The minor version can be upgraded.</li>
     * <li><strong>false</strong>: The minor version is already the latest and cannot be upgraded.</li>
     * </ul>
     * <blockquote>
     * <p>To upgrade the minor version, call the <a href="https://help.aliyun.com/document_detail/473777.html">ModifyInstanceMinorVersion</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUpgradeMinorVersion")
    public Boolean enableUpgradeMinorVersion;

    /**
     * <p>The database engine type. Valid values: <strong>redis</strong> and <strong>memcache</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Indicates whether automatic minor version upgrade is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsAutoUpgradeOpen")
    public String isAutoUpgradeOpen;

    /**
     * <p>Indicates whether the minor version of the instance is the latest. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether the new TLS version is supported. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsNewSSLMode")
    public String isNewSSLMode;

    /**
     * <p>Indicates whether NGLB mode is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOpenNGLB")
    public String isOpenNGLB;

    /**
     * <p>Indicates whether the instance is a Redis-compatible version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsRedisCompatibleVersion")
    public String isRedisCompatibleVersion;

    /**
     * <p>Indicates whether SSL is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSSLEnable")
    public String isSSLEnable;

    /**
     * <p>The major version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>The current minor version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>redis-5.0_0.5.0</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

    /**
     * <p>The information about the latest minor version to which the proxy node can be upgraded.</p>
     */
    @NameInMap("ProxyLatestMinorVersion")
    public DescribeEngineVersionResponseBodyProxyLatestMinorVersion proxyLatestMinorVersion;

    /**
     * <p>The current minor version of the proxy node.</p>
     * <blockquote>
     * <p>This parameter is returned only for instances of the cluster or read/write splitting architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6.6.0</p>
     */
    @NameInMap("ProxyMinorVersion")
    public String proxyMinorVersion;

    /**
     * <p>The update notes for the minor version of the proxy node, including the release time, minor version number, type (such as new feature), and detailed description.</p>
     * <blockquote>
     * <p>This parameter is returned only for instances of the cluster or read/write splitting architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;releaseInfo\&quot;:[{\&quot;createTime\&quot;:\&quot;2021-06-08\&quot;,\&quot;level\&quot;:0,\&quot;releaseVersion\&quot;:\&quot;6.6.2\&quot;,\&quot;releaseNote\&quot;:\&quot;New feature: Added support for some internal commands.\&quot;}],\&quot;versionChangesLevel\&quot;:2}</p>
     */
    @NameInMap("ProxyVersionRelease")
    public String proxyVersionRelease;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A52974D1-9D57-4805-86CC-92E6EDE8****</p>
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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

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
        @NameInMap("ReleaseInfo")
        public DescribeEngineVersionResponseBodyDBLatestMinorVersionVersionReleaseReleaseInfo releaseInfo;

        /**
         * <p>The importance level of the version upgrade (recommended upgrade level). Valid values:</p>
         * <ul>
         * <li>0: Normal.</li>
         * <li>1: Important.</li>
         * <li>2: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The importance level of the version change. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Normal.</li>
         * <li><strong>1</strong>: Important.</li>
         * <li><strong>2</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>7.0.1.4</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The version evolution path from the current minor version of the instance to the latest minor version. This is consistent with the version documentation. You can refer to the version release notes for more detailed information.</p>
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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

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
        @NameInMap("ReleaseInfo")
        public DescribeEngineVersionResponseBodyProxyLatestMinorVersionVersionReleaseReleaseInfo releaseInfo;

        /**
         * <p>The importance level of the version upgrade (recommended upgrade level). Valid values:</p>
         * <ul>
         * <li>0: Normal.</li>
         * <li>1: Important.</li>
         * <li>2: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The importance level of the version change. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Normal.</li>
         * <li><strong>1</strong>: Important.</li>
         * <li><strong>2</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>7.0.6</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The version evolution path from the current minor version of the instance to the latest minor version. This is consistent with the version documentation. You can refer to the version release notes for more detailed information.</p>
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
