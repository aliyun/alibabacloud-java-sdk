// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    @NameInMap("MinorVersionItems")
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems> minorVersionItems;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("IsHotfixVersion")
        public Boolean isHotfixVersion;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseType")
        public String releaseType;

        @NameInMap("StatusDesc")
        public String statusDesc;

        public static DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems self = new DescribeDBMiniEngineVersionsResponseBodyMinorVersionItems();
            return TeaModel.build(map, self);
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

    }

}
