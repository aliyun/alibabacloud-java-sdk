// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The latest version of the database engine.</p>
     */
    @NameInMap("DBLatestVersion")
    public String DBLatestVersion;

    /**
     * <p>The minor version of the database engine.</p>
     * <br>
     * <p>*   If `DBVersion` is **8.0**, the valid values of this parameter are:</p>
     * <br>
     * <p>    *   **8.0.2**</p>
     * <p>    *   **8.0.1**</p>
     * <br>
     * <p>*   If `DBVersion` is **5.7**, set the value of this parameter to **5.7.28**.</p>
     * <br>
     * <p>*   If `DBVersion` is **5.6**, the value of this parameter is **5.6.16**.</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The revision version of the database engine.</p>
     * <br>
     * <p>> For a cluster of the PolarDB for MySQL 5.6, the `DBRevisionVersion` parameter returns the revision version information only if the revision version is released later than August 31, 2020. Otherwise, this parameter returns an empty value. For more information about the kernel version of a cluster that runs the PolarDB for MySQL, see [PolarDB for MySQL](~~423884~~).</p>
     */
    @NameInMap("DBRevisionVersion")
    public String DBRevisionVersion;

    /**
     * <p>可升级的版本信息列表。</p>
     */
    @NameInMap("DBRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionResponseBodyDBRevisionVersionList> DBRevisionVersionList;

    /**
     * <p>The major version of the database engine. Valid values:</p>
     * <br>
     * <p>*   **8.0**</p>
     * <p>*   **5.7**</p>
     * <p>*   **5.6**</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the minor version. Valid values:</p>
     * <br>
     * <p>*   **Stable**: The minor version is stable.</p>
     * <p>*   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</p>
     * <p>*   **HighRisk**: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.</p>
     * <br>
     * <p>> For more information about how to upgrade the minor version, see [Upgrade versions](~~158572~~).</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>Indicates whether the kernel version is the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsLatestVersion")
    public String isLatestVersion;

    /**
     * <p>Indicates whether PolarProxy is the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public String isProxyLatestVersion;

    /**
     * <p>The latest version of PolarProxy.</p>
     */
    @NameInMap("ProxyLatestVersion")
    public String proxyLatestVersion;

    /**
     * <p>The version of PolarProxy.</p>
     */
    @NameInMap("ProxyRevisionVersion")
    public String proxyRevisionVersion;

    /**
     * <p>The status of PolarProxy. Valid values:</p>
     * <br>
     * <p>*   **Stable**: The minor version is stable.</p>
     * <p>*   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</p>
     * <p>*   **HighRisk**: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.</p>
     * <br>
     * <p>> For more information about how to upgrade the PolarProxy version, see [Upgrade versions](~~158572~~).</p>
     */
    @NameInMap("ProxyVersionStatus")
    public String proxyVersionStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionResponseBody self = new DescribeDBClusterVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterVersionResponseBody setDBLatestVersion(String DBLatestVersion) {
        this.DBLatestVersion = DBLatestVersion;
        return this;
    }
    public String getDBLatestVersion() {
        return this.DBLatestVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBMinorVersion(String DBMinorVersion) {
        this.DBMinorVersion = DBMinorVersion;
        return this;
    }
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBRevisionVersion(String DBRevisionVersion) {
        this.DBRevisionVersion = DBRevisionVersion;
        return this;
    }
    public String getDBRevisionVersion() {
        return this.DBRevisionVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBRevisionVersionList(java.util.List<DescribeDBClusterVersionResponseBodyDBRevisionVersionList> DBRevisionVersionList) {
        this.DBRevisionVersionList = DBRevisionVersionList;
        return this;
    }
    public java.util.List<DescribeDBClusterVersionResponseBodyDBRevisionVersionList> getDBRevisionVersionList() {
        return this.DBRevisionVersionList;
    }

    public DescribeDBClusterVersionResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterVersionResponseBody setIsLatestVersion(String isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public String getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterVersionResponseBody setIsProxyLatestVersion(String isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public String getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDBClusterVersionResponseBody setProxyLatestVersion(String proxyLatestVersion) {
        this.proxyLatestVersion = proxyLatestVersion;
        return this;
    }
    public String getProxyLatestVersion() {
        return this.proxyLatestVersion;
    }

    public DescribeDBClusterVersionResponseBody setProxyRevisionVersion(String proxyRevisionVersion) {
        this.proxyRevisionVersion = proxyRevisionVersion;
        return this;
    }
    public String getProxyRevisionVersion() {
        return this.proxyRevisionVersion;
    }

    public DescribeDBClusterVersionResponseBody setProxyVersionStatus(String proxyVersionStatus) {
        this.proxyVersionStatus = proxyVersionStatus;
        return this;
    }
    public String getProxyVersionStatus() {
        return this.proxyVersionStatus;
    }

    public DescribeDBClusterVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterVersionResponseBodyDBRevisionVersionList extends TeaModel {
        /**
         * <p>版本发布说明。</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>数据库版本发布状态。取值范围如下：</p>
         * <p>* **Stable**：当前版本状态稳定。</p>
         * <p>* **Old**：当前版本过旧，不建议升级到该版本。</p>
         * <p>* **HighRisk**：当前版本有严重缺陷，不建议升级到该版本。</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>数据库引擎的修订版本Code，用于指定升级到该目标版本。</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <p>数据库引擎的修订版本号。</p>
         */
        @NameInMap("RevisionVersionName")
        public String revisionVersionName;

        public static DescribeDBClusterVersionResponseBodyDBRevisionVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterVersionResponseBodyDBRevisionVersionList self = new DescribeDBClusterVersionResponseBodyDBRevisionVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterVersionResponseBodyDBRevisionVersionList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBClusterVersionResponseBodyDBRevisionVersionList setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBClusterVersionResponseBodyDBRevisionVersionList setRevisionVersionCode(String revisionVersionCode) {
            this.revisionVersionCode = revisionVersionCode;
            return this;
        }
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        public DescribeDBClusterVersionResponseBodyDBRevisionVersionList setRevisionVersionName(String revisionVersionName) {
            this.revisionVersionName = revisionVersionName;
            return this;
        }
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

    }

}
