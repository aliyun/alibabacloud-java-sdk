// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    /**
     * <p>Details about the GDNs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The region ID of the cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The role of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Primary**: the primary cluster</p>
         * <p>*   **standby**: the secondary cluster</p>
         * <br>
         * <p>> A GDN consists of one primary cluster and up to four secondary clusters. For more information, see [GDN](~~160381~~).</p>
         */
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
        /**
         * <p>The time when the GDN was created. The time is in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Details about clusters in the GDN.</p>
         */
        @NameInMap("DBClusters")
        public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> DBClusters;

        /**
         * <p>The type of the database engine. Only **MySQL** is supported.</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine. Only the **8.0** version is supported.</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The description of the GDN. The description must meet the following requirements:</p>
         * <br>
         * <p>*   It cannot start with `http://` or `https://`.</p>
         * <p>*   It must start with a letter.</p>
         * <p>*   It can contain letters, digits, underscores (\_), and hyphens (-).</p>
         * <p>*   It must be 2 to 126 characters in length.</p>
         */
        @NameInMap("GDNDescription")
        public String GDNDescription;

        /**
         * <p>The ID of the GDN.</p>
         */
        @NameInMap("GDNId")
        public String GDNId;

        /**
         * <p>The status of the GDN. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The GDN is being created.</p>
         * <p>*   **active**: The GDN is running.</p>
         * <p>*   **deleting**: The GDN is being deleted.</p>
         * <p>*   **locked**: The GDN is locked. If the GDN is locked, you cannot perform operations on clusters in the GDN.</p>
         * <p>*   **removing_member**: The secondary cluster is being removed from the GDN.</p>
         */
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
