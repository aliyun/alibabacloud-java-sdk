// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPriceRequest extends TeaModel {
    /**
     * <p>The cluster edition. Valid values:</p>
     * <ul>
     * <li>Normal: Cluster Edition.</li>
     * <li>Basic: Single Node Edition.</li>
     * <li>ArchiveNormal: Archive Database.</li>
     * <li>SENormal: Standard Edition.</li>
     * <li>NormalMultimaster: Multi-master Cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The cluster ID. Required for non-BUY scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node specifications. Required for the BUY scenario. Example format: polar.mysql.x4.large.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.large</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The list of node IDs to delete. Used when ModifyType is set to DELETE.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-**************</p>
     */
    @NameInMap("DBNodeIds")
    public java.util.List<String> DBNodeIds;

    /**
     * <p>The number of nodes. Valid for the BUY scenario. This value includes the read/write node. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeNum")
    public Integer DBNodeNum;

    /**
     * <p>The list of heterogeneous specification change nodes. Used for specification change scenarios to specify the target specifications for each node.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeDBClusterPriceRequestDBNodes> DBNodes;

    /**
     * <p>The database engine type. Required for the BUY scenario. Valid values: MySQL, PostgreSQL, and Oracle.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The database engine version. Required for the BUY scenario. Valid values for MySQL: 5.6, 5.7, and 8.0. Valid values for PostgreSQL: 11 and 14. Valid values for Oracle: 11 and 14.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>Specifies whether to enable the hot standby cluster. Valid values:</p>
     * <ul>
     * <li>ON: Enable.</li>
     * <li>OFF: Disable.</li>
     * </ul>
     * <p>Valid for the BUY and specification change scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>The specification change direction. Valid values:</p>
     * <ul>
     * <li>ADD: add nodes.</li>
     * <li>DELETE: remove nodes.</li>
     * <li>UPGRADE: upgrade specifications.</li>
     * <li>DOWNGRADE: downgrade specifications.</li>
     * <li>HOT_STANDBY: hot standby change.</li>
     * <li>STORAGE: storage space change.</li>
     * <li>STORAGE_TYPE: storage type change.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>BUY: new purchase.</li>
     * <li>CONVERT: billing method conversion.</li>
     * <li>RENEW: renewal.</li>
     * <li>UPGRADE: upgrade specifications or add nodes.</li>
     * <li>DOWNGRADE: downgrade specifications or remove nodes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The billing method. Required for the BUY and CONVERT scenarios. Valid values:</p>
     * <ul>
     * <li>Prepaid: subscription.</li>
     * <li>Postpaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription cycle. Valid values:</p>
     * <ul>
     * <li>Month: monthly.</li>
     * <li>Year: yearly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The provisioned IOPS. Used for the Standard Edition (SENormal) scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProvisionedIops")
    public String provisionedIops;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The serverless type. Valid values: AgileServerless.</p>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The storage billing type. Valid values:</p>
     * <ul>
     * <li>Prepaid: subscription.</li>
     * <li>Postpaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StorageChargeType")
    public String storageChargeType;

    /**
     * <p>The storage space, in GB. Used for prepaid storage or storage specification change scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public String storageSpace;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>PSL5: high performance.</li>
     * <li>PSL4: standard.</li>
     * <li>ESSDPL0</li>
     * <li>ESSDPL1</li>
     * <li>ESSDPL2</li>
     * <li>ESSDPL3</li>
     * <li>ESSDAUTOPL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PSL5</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription duration. Used together with Period. Valid for the BUY, CONVERT, and RENEW scenarios when the billing method is Prepaid.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The zone ID. We recommend that you specify this parameter for the BUY scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBClusterPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPriceRequest self = new DescribeDBClusterPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPriceRequest setCreationCategory(String creationCategory) {
        this.creationCategory = creationCategory;
        return this;
    }
    public String getCreationCategory() {
        return this.creationCategory;
    }

    public DescribeDBClusterPriceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPriceRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public DescribeDBClusterPriceRequest setDBNodeIds(java.util.List<String> DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public java.util.List<String> getDBNodeIds() {
        return this.DBNodeIds;
    }

    public DescribeDBClusterPriceRequest setDBNodeNum(Integer DBNodeNum) {
        this.DBNodeNum = DBNodeNum;
        return this;
    }
    public Integer getDBNodeNum() {
        return this.DBNodeNum;
    }

    public DescribeDBClusterPriceRequest setDBNodes(java.util.List<DescribeDBClusterPriceRequestDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDBClusterPriceRequestDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDBClusterPriceRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterPriceRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterPriceRequest setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public DescribeDBClusterPriceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public DescribeDBClusterPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeDBClusterPriceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClusterPriceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeDBClusterPriceRequest setProvisionedIops(String provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    public DescribeDBClusterPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterPriceRequest setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeDBClusterPriceRequest setStorageChargeType(String storageChargeType) {
        this.storageChargeType = storageChargeType;
        return this;
    }
    public String getStorageChargeType() {
        return this.storageChargeType;
    }

    public DescribeDBClusterPriceRequest setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public String getStorageSpace() {
        return this.storageSpace;
    }

    public DescribeDBClusterPriceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeDBClusterPriceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public DescribeDBClusterPriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDBClusterPriceRequestDBNodes extends TeaModel {
        /**
         * <p>The target node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-**************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        public static DescribeDBClusterPriceRequestDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPriceRequestDBNodes self = new DescribeDBClusterPriceRequestDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPriceRequestDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterPriceRequestDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

    }

}
