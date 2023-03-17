// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEngineVersionResponseBody extends TeaModel {
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
     * <p>Indicates whether the instance minor version is the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**: The instance minor version is the latest version.</p>
     * <p>*   **false**: The instance minor version is not the latest version.</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    @NameInMap("IsNewSSLMode")
    public String isNewSSLMode;

    /**
     * <p>Indicates whether the instance supports the new SSL encryption feature.</p>
     */
    @NameInMap("IsRedisCompatibleVersion")
    public String isRedisCompatibleVersion;

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

}
