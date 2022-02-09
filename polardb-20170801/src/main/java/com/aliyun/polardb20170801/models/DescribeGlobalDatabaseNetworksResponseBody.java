// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeGlobalDatabaseNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworksResponseBody self = new DescribeGlobalDatabaseNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworksResponseBody setItems(java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeGlobalDatabaseNetworksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeGlobalDatabaseNetworksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Role")
        public String role;

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

        public DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeGlobalDatabaseNetworksResponseBodyItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBClusters")
        public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> DBClusters;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("GDNDescription")
        public String GDNDescription;

        @NameInMap("GDNId")
        public String GDNId;

        @NameInMap("GDNStatus")
        public String GDNStatus;

        public static DescribeGlobalDatabaseNetworksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworksResponseBodyItems self = new DescribeGlobalDatabaseNetworksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeGlobalDatabaseNetworksResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNDescription(String GDNDescription) {
            this.GDNDescription = GDNDescription;
            return this;
        }
        public String getGDNDescription() {
            return this.GDNDescription;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }
        public String getGDNId() {
            return this.GDNId;
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItems setGDNStatus(String GDNStatus) {
            this.GDNStatus = GDNStatus;
            return this;
        }
        public String getGDNStatus() {
            return this.GDNStatus;
        }

    }

}
