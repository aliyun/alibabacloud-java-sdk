// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2.0.16.13.14.0</p>
     */
    @NameInMap("DBLatestStableVersion")
    public String DBLatestStableVersion;

    /**
     * <p>The latest version of the database kernel.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0.1.1.16</p>
     */
    @NameInMap("DBLatestVersion")
    public String DBLatestVersion;

    /**
     * <p>The minor version of the database engine.</p>
     * <ul>
     * <li><p>If <code>DBVersion</code> is <strong>8.0</strong>, valid values are:</p>
     * <ul>
     * <li><p><strong>8.0.2</strong></p>
     * </li>
     * <li><p><strong>8.0.1</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If <code>DBVersion</code> is <strong>5.7</strong>, the value is <strong>5.7.28</strong>.</p>
     * </li>
     * <li><p>If <code>DBVersion</code> is <strong>5.6</strong>, the value is <strong>5.6.16</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0.1</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The revision version of the database engine.</p>
     * <blockquote>
     * <p>For a PolarDB for MySQL 5.6 cluster, this parameter is returned only when the release date of the revision version is later than 20200831. Otherwise, this parameter is empty. For more information about the kernel version of a PolarDB for MySQL cluster, see <a href="https://help.aliyun.com/document_detail/423884.html">Kernel release notes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8.0.1.1.7</p>
     */
    @NameInMap("DBRevisionVersion")
    public String DBRevisionVersion;

    /**
     * <p>A list of upgradable versions.</p>
     */
    @NameInMap("DBRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionResponseBodyDBRevisionVersionList> DBRevisionVersionList;

    /**
     * <p>The major version of the database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>8.0</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the current minor version of the database. Valid values:</p>
     * <ul>
     * <li><p><strong>Stable</strong>: The current version is stable.</p>
     * </li>
     * <li><p><strong>Old</strong>: The current version is outdated. Upgrade to the latest version.</p>
     * </li>
     * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Upgrade to the latest version immediately.</p>
     * </li>
     * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about how to upgrade the minor version of a database, see <a href="https://help.aliyun.com/document_detail/158572.html">Upgrade versions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLatestStableVersion")
    public String isLatestStableVersion;

    /**
     * <p>Indicates whether the current database kernel version is the latest version. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLatestVersion")
    public String isLatestVersion;

    /**
     * <p>Indicates whether the current database proxy version is the latest version. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public String isProxyLatestVersion;

    /**
     * <p>The latest version of the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4.17</p>
     */
    @NameInMap("ProxyLatestVersion")
    public String proxyLatestVersion;

    /**
     * <p>The version of the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4.15</p>
     */
    @NameInMap("ProxyRevisionVersion")
    public String proxyRevisionVersion;

    /**
     * <p>A list of upgradable proxy versions.</p>
     * <ul>
     * <li><p><strong>Stable</strong>: The current version is stable.</p>
     * </li>
     * <li><p><strong>Old</strong>: This version is outdated and not recommended for upgrades.</p>
     * </li>
     * <li><p><strong>HighRisk</strong>: This version has critical bugs and is not recommended for upgrades.</p>
     * </li>
     * <li><p><strong>Beta</strong>: This is a beta version.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ProxyRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionResponseBodyProxyRevisionVersionList> proxyRevisionVersionList;

    /**
     * <p>The status of the database proxy version. Valid values:</p>
     * <ul>
     * <li><p><strong>Stable</strong>: The current version is stable.</p>
     * </li>
     * <li><p><strong>Old</strong>: The current version is outdated. Upgrade to the latest version.</p>
     * </li>
     * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Upgrade to the latest version immediately.</p>
     * </li>
     * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about how to upgrade the database proxy version, see <a href="https://help.aliyun.com/document_detail/158572.html">Upgrade versions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("ProxyVersionStatus")
    public String proxyVersionStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>47921222-0D37-4133-8C0D-017DC3******</p>
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

    public DescribeDBClusterVersionResponseBody setDBLatestStableVersion(String DBLatestStableVersion) {
        this.DBLatestStableVersion = DBLatestStableVersion;
        return this;
    }
    public String getDBLatestStableVersion() {
        return this.DBLatestStableVersion;
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

    public DescribeDBClusterVersionResponseBody setIsLatestStableVersion(String isLatestStableVersion) {
        this.isLatestStableVersion = isLatestStableVersion;
        return this;
    }
    public String getIsLatestStableVersion() {
        return this.isLatestStableVersion;
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

    public DescribeDBClusterVersionResponseBody setProxyRevisionVersionList(java.util.List<DescribeDBClusterVersionResponseBodyProxyRevisionVersionList> proxyRevisionVersionList) {
        this.proxyRevisionVersionList = proxyRevisionVersionList;
        return this;
    }
    public java.util.List<DescribeDBClusterVersionResponseBodyProxyRevisionVersionList> getProxyRevisionVersionList() {
        return this.proxyRevisionVersionList;
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
         * <p>The release notes of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseNote</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release status of the database version. Valid values:</p>
         * <ul>
         * <li><p><strong>Stable</strong>: The current version is stable.</p>
         * </li>
         * <li><p><strong>Old</strong>: The current version is outdated. Do not upgrade to this version.</p>
         * </li>
         * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Do not upgrade to this version.</p>
         * </li>
         * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The revision version code of the database engine. You can use this code to specify the target version for an upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <p>The revision version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0.1.1.35.1</p>
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

    public static class DescribeDBClusterVersionResponseBodyProxyRevisionVersionList extends TeaModel {
        /**
         * <p>The release notes of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>ReleaseNote</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release type. Valid values:</p>
         * <ul>
         * <li><p><strong>LTS</strong>: long-term support version.</p>
         * </li>
         * <li><p><strong>BETA</strong>: preview version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LTS</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The revision version code of the database proxy engine. You can use this code to specify the target version for an upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <p>The revision version of the database proxy engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.8.24</p>
         */
        @NameInMap("RevisionVersionName")
        public String revisionVersionName;

        public static DescribeDBClusterVersionResponseBodyProxyRevisionVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterVersionResponseBodyProxyRevisionVersionList self = new DescribeDBClusterVersionResponseBodyProxyRevisionVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterVersionResponseBodyProxyRevisionVersionList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBClusterVersionResponseBodyProxyRevisionVersionList setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBClusterVersionResponseBodyProxyRevisionVersionList setRevisionVersionCode(String revisionVersionCode) {
            this.revisionVersionCode = revisionVersionCode;
            return this;
        }
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        public DescribeDBClusterVersionResponseBodyProxyRevisionVersionList setRevisionVersionName(String revisionVersionName) {
            this.revisionVersionName = revisionVersionName;
            return this;
        }
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

    }

}
