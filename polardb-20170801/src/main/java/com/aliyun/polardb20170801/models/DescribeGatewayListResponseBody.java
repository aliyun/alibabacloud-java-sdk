// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayListResponseBody extends TeaModel {
    /**
     * <p>The list of gateway instances.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeGatewayListResponseBodyItems> items;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeGatewayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayListResponseBody self = new DescribeGatewayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayListResponseBody setItems(java.util.List<DescribeGatewayListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeGatewayListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeGatewayListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewayListResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGatewayListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayListResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGatewayListResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The expiration time of the cluster.</p>
         * <ul>
         * <li>If the billing method of the cluster is subscription, the actual expiration time is returned.</li>
         * <li>If the billing method of the cluster is pay-as-you-go, an empty value is returned.</li>
         * </ul>
         * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2028-09-01T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <p>The gateway description.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxx</p>
         */
        @NameInMap("GwDescription")
        public String gwDescription;

        /**
         * <p>The last modification time.</p>
         * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-29T09:31:37Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The billing method. Valid values: </p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The application status. Valid values:</p>
         * <ul>
         * <li>CREATE: being created.</li>
         * <li>ACTIVATION: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9u0v2yuskt1gth3uuju</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGatewayListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayListResponseBodyItems self = new DescribeGatewayListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayListResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGatewayListResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeGatewayListResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGatewayListResponseBodyItems setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeGatewayListResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeGatewayListResponseBodyItems setGwDescription(String gwDescription) {
            this.gwDescription = gwDescription;
            return this;
        }
        public String getGwDescription() {
            return this.gwDescription;
        }

        public DescribeGatewayListResponseBodyItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeGatewayListResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGatewayListResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGatewayListResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGatewayListResponseBodyItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeGatewayListResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
