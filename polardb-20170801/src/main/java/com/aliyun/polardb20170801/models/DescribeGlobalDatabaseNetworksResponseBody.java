// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items;

    public static DescribeGlobalDatabaseNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworksResponseBody self = new DescribeGlobalDatabaseNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeGlobalDatabaseNetworksResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGlobalDatabaseNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDatabaseNetworksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalDatabaseNetworksResponseBody setItems(java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("Role")
        public String role;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters self = new DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeGlobalDatabaseNetworksResponseBodyItems extends TeaModel {
        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("GDNId")
        public String GDNId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GDNStatus")
        public String GDNStatus;

        @NameInMap("DBClusters")
        public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> DBClusters;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("GDNDescription")
        public String GDNDescription;

        public static DescribeGlobalDatabaseNetworksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworksResponseBodyItems self = new DescribeGlobalDatabaseNetworksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }
        public String getGDNId() {
            return this.GDNId;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNStatus(String GDNStatus) {
            this.GDNStatus = GDNStatus;
            return this;
        }
        public String getGDNStatus() {
            return this.GDNStatus;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setDBClusters(java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> DBClusters) {
            this.DBClusters = DBClusters;
            return this;
        }
        public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> getDBClusters() {
            return this.DBClusters;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNDescription(String GDNDescription) {
            this.GDNDescription = GDNDescription;
            return this;
        }
        public String getGDNDescription() {
            return this.GDNDescription;
        }

    }

}
