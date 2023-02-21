// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    /**
     * <p>An array that consists of details of the minor engine versions.</p>
     */
    @NameInMap("MinorVersionItems")
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems> minorVersionItems;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBMiniEngineVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBMiniEngineVersionsResponseBody self = new DescribeDBMiniEngineVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBMiniEngineVersionsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBMiniEngineVersionsResponseBody setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeDBMiniEngineVersionsResponseBody setMinorVersionItems(java.util.List<DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems> minorVersionItems) {
        this.minorVersionItems = minorVersionItems;
        return this;
    }
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems> getMinorVersionItems() {
        return this.minorVersionItems;
    }

    public DescribeDBMiniEngineVersionsResponseBody setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeDBMiniEngineVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBMiniEngineVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems extends TeaModel {
        /**
         * <p>The PostgreSQL version to which the minor engine version corresponds. For more information, see [Release notes for AliPG](~~126002~~).</p>
         * <br>
         * <p>>  This parameter is valid only when the Engine parameter is set to **PostgreSQL**.</p>
         */
        @NameInMap("CommunityMinorVersion")
        public String communityMinorVersion;

        /**
         * <p>The database engine that corresponds to the minor engine version.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version that corresponds to the minor engine version.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         */
        @NameInMap("IsHotfixVersion")
        public Boolean isHotfixVersion;

        /**
         * <p>The version of the minor engine.</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The RDS edition of the instance that runs the minor engine version. Valid values:</p>
         * <br>
         * <p>*   **Basic**: RDS Basic Edition</p>
         * <p>*   **HighAvailability**: RDS High-availability Edition</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The URL of the release notes for the minor engine version.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release type. Valid values:</p>
         * <br>
         * <p>*   **LTS**: a long-term version</p>
         * <p>*   **BETA**: a preview version</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The status of the minor engine version.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The tag that corresponds to the minor engine version. Valid values:</p>
         * <br>
         * <p>*   **pgsql_docker_image**: tag of common instances</p>
         * <p>*   **pgsql_babelfish_image**: tag of the instance for which Babelfish is enabled</p>
         * <br>
         * <p>>  This parameter is valid only when the Engine parameter is set to **PostgreSQL**.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems self = new DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setCommunityMinorVersion(String communityMinorVersion) {
            this.communityMinorVersion = communityMinorVersion;
            return this;
        }
        public String getCommunityMinorVersion() {
            return this.communityMinorVersion;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setIsHotfixVersion(Boolean isHotfixVersion) {
            this.isHotfixVersion = isHotfixVersion;
            return this;
        }
        public Boolean getIsHotfixVersion() {
            return this.isHotfixVersion;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
