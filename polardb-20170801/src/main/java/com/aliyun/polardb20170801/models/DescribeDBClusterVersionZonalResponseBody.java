// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>8.0.1.1.16</p>
     */
    @NameInMap("DBLatestVersion")
    public String DBLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>8.0.1</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <strong>example:</strong>
     * <p>8.0.1.1.7</p>
     */
    @NameInMap("DBRevisionVersion")
    public String DBRevisionVersion;

    @NameInMap("DBRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList> DBRevisionVersionList;

    /**
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLatestVersion")
    public String isLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public String isProxyLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>2.4.17</p>
     */
    @NameInMap("ProxyLatestVersion")
    public String proxyLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>2.4.15</p>
     */
    @NameInMap("ProxyRevisionVersion")
    public String proxyRevisionVersion;

    @NameInMap("ProxyRevisionVersionList")
    public java.util.List<DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList> proxyRevisionVersionList;

    /**
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("ProxyVersionStatus")
    public String proxyVersionStatus;

    /**
     * <strong>example:</strong>
     * <p>47921222-0D37-4133-8C0D-017DC3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterVersionZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionZonalResponseBody self = new DescribeDBClusterVersionZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionZonalResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBLatestVersion(String DBLatestVersion) {
        this.DBLatestVersion = DBLatestVersion;
        return this;
    }
    public String getDBLatestVersion() {
        return this.DBLatestVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBMinorVersion(String DBMinorVersion) {
        this.DBMinorVersion = DBMinorVersion;
        return this;
    }
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBRevisionVersion(String DBRevisionVersion) {
        this.DBRevisionVersion = DBRevisionVersion;
        return this;
    }
    public String getDBRevisionVersion() {
        return this.DBRevisionVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBRevisionVersionList(java.util.List<DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList> DBRevisionVersionList) {
        this.DBRevisionVersionList = DBRevisionVersionList;
        return this;
    }
    public java.util.List<DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList> getDBRevisionVersionList() {
        return this.DBRevisionVersionList;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterVersionZonalResponseBody setIsLatestVersion(String isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public String getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setIsProxyLatestVersion(String isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public String getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setProxyLatestVersion(String proxyLatestVersion) {
        this.proxyLatestVersion = proxyLatestVersion;
        return this;
    }
    public String getProxyLatestVersion() {
        return this.proxyLatestVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setProxyRevisionVersion(String proxyRevisionVersion) {
        this.proxyRevisionVersion = proxyRevisionVersion;
        return this;
    }
    public String getProxyRevisionVersion() {
        return this.proxyRevisionVersion;
    }

    public DescribeDBClusterVersionZonalResponseBody setProxyRevisionVersionList(java.util.List<DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList> proxyRevisionVersionList) {
        this.proxyRevisionVersionList = proxyRevisionVersionList;
        return this;
    }
    public java.util.List<DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList> getProxyRevisionVersionList() {
        return this.proxyRevisionVersionList;
    }

    public DescribeDBClusterVersionZonalResponseBody setProxyVersionStatus(String proxyVersionStatus) {
        this.proxyVersionStatus = proxyVersionStatus;
        return this;
    }
    public String getProxyVersionStatus() {
        return this.proxyVersionStatus;
    }

    public DescribeDBClusterVersionZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ReleaseNote</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <strong>example:</strong>
         * <p>8.0.1.1.35.1</p>
         */
        @NameInMap("RevisionVersionName")
        public String revisionVersionName;

        public static DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList self = new DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList setRevisionVersionCode(String revisionVersionCode) {
            this.revisionVersionCode = revisionVersionCode;
            return this;
        }
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        public DescribeDBClusterVersionZonalResponseBodyDBRevisionVersionList setRevisionVersionName(String revisionVersionName) {
            this.revisionVersionName = revisionVersionName;
            return this;
        }
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

    }

    public static class DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ReleaseNote</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <strong>example:</strong>
         * <p>LTS</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <strong>example:</strong>
         * <p>2.8.24</p>
         */
        @NameInMap("RevisionVersionName")
        public String revisionVersionName;

        public static DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList self = new DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList setRevisionVersionCode(String revisionVersionCode) {
            this.revisionVersionCode = revisionVersionCode;
            return this;
        }
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        public DescribeDBClusterVersionZonalResponseBodyProxyRevisionVersionList setRevisionVersionName(String revisionVersionName) {
            this.revisionVersionName = revisionVersionName;
            return this;
        }
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

    }

}
