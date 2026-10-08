// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    /**
     * <p>The list of minor engine versions.</p>
     */
    @NameInMap("MinorVersionItems")
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems> minorVersionItems;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The community minor version that corresponds to the minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7.38</p>
         */
        @NameInMap("CommunityMinorVersion")
        public String communityMinorVersion;

        /**
         * <p>The database engine that corresponds to the minor version.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version that corresponds to the minor version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time of the minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>20231213</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The expiration status of the minor engine version. Valid values:</p>
         * <ul>
         * <li><strong>vaild</strong>: Milvus version is valid.</li>
         * <li><strong>expired</strong>: Milvus version has expired.</li>
         * </ul>
         * <blockquote>
         * <p>If the offline status is Offline, Milvus version has been taken offline and the expiration status is ignored. If the offline status is Online and the expiration status is expired, Milvus version has exceeded its lifecycle. If the offline status is Online and the expiration status is vaild, Milvus version is still within its lifecycle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vaild</p>
         */
        @NameInMap("ExpireStatus")
        public String expireStatus;

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsHotfixVersion")
        public Boolean isHotfixVersion;

        /**
         * <p>The version number of the minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_20220731</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The instance edition that corresponds to the minor version. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: high-availability series.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The URL of the release notes for the minor version.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release type. Valid values:</p>
         * <ul>
         * <li><strong>LTS</strong>: Long-term support version.</li>
         * <li><strong>BETA</strong>: Preview version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BETA</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The offline status of the minor engine version. Valid values:</p>
         * <ul>
         * <li><strong>Offline</strong>: Milvus version has been taken offline.</li>
         * <li><strong>Online</strong>: Milvus version is online.</li>
         * </ul>
         * <blockquote>
         * <p>If the offline status is Offline, Milvus version has been taken offline and the expiration status is ignored. If the offline status is Online and the expiration status is expired, Milvus version has exceeded its lifecycle. If the offline status is Online and the expiration status is vaild, Milvus version is still within its lifecycle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The tag that corresponds to the minor engine version. Valid values:</p>
         * <ul>
         * <li><strong>pgsql_docker_image</strong>: general instance tag.</li>
         * <li><strong>pgsql_babelfish_image</strong>: Babelfish instance tag.</li>
         * </ul>
         * <blockquote>
         * <p>This value is returned only for <strong>PostgreSQL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pgsql_babelfish_image</p>
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

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems setExpireStatus(String expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public String getExpireStatus() {
            return this.expireStatus;
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
