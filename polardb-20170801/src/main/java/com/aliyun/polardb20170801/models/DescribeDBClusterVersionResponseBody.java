// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
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
     * <p>- If DBVersion is 8.0, the valid values of this parameter are:</p>
     * <p>  - 8.0.2</p>
     * <p>  - 8.0.1</p>
     * <p>- If DBVersion is 5.7, set the value of this parameter to 5.7.28.</p>
     * <p>- If DBVersion is 5.6, the value of this parameter is 5.6.16.</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The revision version of the database engine.</p>
     * <p>>For a cluster of the PolarDB for MySQL 5.6, the DBRevisionVersion parameter returns the revision version information only if the Revision Version is released later than August 31, 2020. Otherwise, this parameter returns an empty value.</p>
     */
    @NameInMap("DBRevisionVersion")
    public String DBRevisionVersion;

    @NameInMap("DBRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionResponseBodyDBRevisionVersionList> DBRevisionVersionList;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <br>
     * <p>- 5.6</p>
     * <p>- 5.7</p>
     * <p>- 8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the minor version. Valid values:</p>
     * <br>
     * <p>*   **Stable**: The minor version is stable.</p>
     * <p>*   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</p>
     * <p>*   **HighRisk**: The minor version has critical defects. We recommend that you immediately update the cluster to the latest minor version.</p>
     * <br>
     * <p>>  For more information about how to update the minor version, see [Minor version update](~~158572~~).</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>Indicates whether the kernel is of the latest version. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("IsLatestVersion")
    public String isLatestVersion;

    /**
     * <p>Indicates whether PolarProxy uses the latest version. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public String isProxyLatestVersion;

    /**
     * <p>The latest version of PolarProxy.</p>
     */
    @NameInMap("ProxyLatestVersion")
    public String proxyLatestVersion;

    /**
     * <p>The revision version of the database engine.</p>
     */
    @NameInMap("ProxyRevisionVersion")
    public String proxyRevisionVersion;

    /**
     * <p>The status of PolarProxy. Valid values:</p>
     * <br>
     * <p>- Stable: The minor version is stable.</p>
     * <p>- Old: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</p>
     * <p>- HighRisk: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.</p>
     * <p>- Beta: The minor version is a beta version.</p>
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
         * <p>The release notes for the revision version.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release status of the revision version. Valid values:</p>
         * <br>
         * <p>*   **Stable**: The revision version is stable.</p>
         * <p>*   **Old**: The revision version is outdated. We recommend that you do not update the cluster to this version.</p>
         * <p>*   **HighRisk**: The revision version has critical defects. We recommend that you do not update the cluster to this version.</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The code of the revision version of the database engine to which the cluster can be upgraded.</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <p>The revision version of the database engine.</p>
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
