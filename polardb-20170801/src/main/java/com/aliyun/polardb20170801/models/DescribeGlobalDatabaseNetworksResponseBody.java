// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    /**
     * <p>A list of GDNs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The role of the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>primary</strong>: The primary cluster.</p>
         * </li>
         * <li><p><strong>standby</strong>: The standby cluster.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A GDN consists of one primary cluster and up to four standby clusters. For more information, see <a href="https://help.aliyun.com/document_detail/160381.html">Global Database Network</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
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

    public static class DescribeGlobalDatabaseNetworksResponseBodyItemsLabels extends TeaModel {
        /**
         * <p>The GDN version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("GDNVersion")
        public String GDNVersion;

        public static DescribeGlobalDatabaseNetworksResponseBodyItemsLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworksResponseBodyItemsLabels self = new DescribeGlobalDatabaseNetworksResponseBodyItemsLabels();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworksResponseBodyItemsLabels setGDNVersion(String GDNVersion) {
            this.GDNVersion = GDNVersion;
            return this;
        }
        public String getGDNVersion() {
            return this.GDNVersion;
        }

    }

    public static class DescribeGlobalDatabaseNetworksResponseBodyItems extends TeaModel {
        /**
         * <p>The time at which the GDN was created, in UTC. The format is <code>YYYY-MM-DDTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-23T05:46:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A list of clusters in the GDN.</p>
         */
        @NameInMap("DBClusters")
        public java.util.List<DescribeGlobalDatabaseNetworksResponseBodyItemsDBClusters> DBClusters;

        /**
         * <p>The database engine type. Only <strong>MySQL</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The database engine version. Only version <strong>8.0</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The GDN description. Requirements:</p>
         * <ul>
         * <li><p>Cannot start with http\:// or https\://.</p>
         * </li>
         * <li><p>Must start with a letter or a Chinese character.</p>
         * </li>
         * <li><p>Can contain letters, Chinese characters, digits, underscores (_), or hyphens (-).</p>
         * </li>
         * <li><p>Must be 2 to 126 characters long.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GDNDescription")
        public String GDNDescription;

        /**
         * <p>The GDN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-****************</p>
         */
        @NameInMap("GDNId")
        public String GDNId;

        /**
         * <p>The status of the GDN. Valid values:</p>
         * <ul>
         * <li><p><strong>creating</strong>: The GDN is being created.</p>
         * </li>
         * <li><p><strong>active</strong>: The GDN is running.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The GDN is being deleted.</p>
         * </li>
         * <li><p><strong>locked</strong>: The GDN is locked. This status prevents any operations on clusters in the GDN.</p>
         * </li>
         * <li><p><strong>removing_member</strong>: A standby cluster is being removed from the GDN.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("GDNStatus")
        public String GDNStatus;

        /**
         * <p>The tags applied to the GDN.</p>
         */
        @NameInMap("Labels")
        public DescribeGlobalDatabaseNetworksResponseBodyItemsLabels labels;

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

        public DescribeGlobalDatabaseNetworksResponseBodyItems setLabels(DescribeGlobalDatabaseNetworksResponseBodyItemsLabels labels) {
            this.labels = labels;
            return this;
        }
        public DescribeGlobalDatabaseNetworksResponseBodyItemsLabels getLabels() {
            return this.labels;
        }

    }

}
