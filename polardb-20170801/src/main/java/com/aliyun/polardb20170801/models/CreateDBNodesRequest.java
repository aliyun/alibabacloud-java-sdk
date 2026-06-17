// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li><p>true (Default): An available coupon is automatically used.</p>
     * </li>
     * <li><p>false: A coupon is not automatically used.</p>
     * </li>
     * </ul>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>A unique, client-generated token to ensure the idempotence of the request. This token is case-sensitive and cannot exceed 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud provider of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>ENS</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Details of the nodes to add.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><p>RO</p>
     * </li>
     * <li><p>STANDBY</p>
     * </li>
     * <li><p>DLNode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The ID of the cluster endpoint to which you want to add the new nodes. If you want to add the nodes to multiple cluster endpoints, separate the endpoint IDs with a comma (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the details of cluster endpoints, including their IDs.</p>
     * </li>
     * <li><p>You can specify the IDs of the default cluster endpoint and custom cluster endpoints.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the new nodes are automatically added to all cluster endpoints where the <strong>Auto Add New Nodes</strong> feature is enabled (the <code>AutoAddNewNodes</code> parameter is set to <code>Enable</code>).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pe-<strong><strong><strong><strong><strong><strong><strong><strong>,pe-</strong></strong></strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("EndpointBindList")
    public String endpointBindList;

    /**
     * <p>Specifies whether to enable In-Memory Column Index (IMCI). Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: The feature is enabled.</p>
     * </li>
     * <li><p><strong>OFF</strong> (Default): The feature is disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not supported for PolarDB for PostgreSQL (Oracle Compatible) and PolarDB for PostgreSQL clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("ImciSwitch")
    public String imciSwitch;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest time to start the scheduled task. The time is specified in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and is in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>This time must be at least 30 minutes later than the value of <code>PlannedStartTime</code>.</p>
     * </li>
     * <li><p>If you specify <code>PlannedStartTime</code> but not this parameter, the latest start time defaults to 30 minutes after the <code>PlannedStartTime</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start the scheduled task to add the nodes. The time must be in UTC and in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * <blockquote>
     * <ul>
     * <li><p>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can set this parameter to a value between <code>2021-01-14T09:00:00Z</code> and <code>2021-01-15T09:00:00Z</code>.</p>
     * </li>
     * <li><p>If you omit this parameter, the nodes are added immediately.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The promotion code. If you omit this parameter, an applicable coupon is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesRequest self = new CreateDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBNodesRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public CreateDBNodesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBNodesRequest setDBNode(java.util.List<CreateDBNodesRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<CreateDBNodesRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public CreateDBNodesRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public CreateDBNodesRequest setEndpointBindList(String endpointBindList) {
        this.endpointBindList = endpointBindList;
        return this;
    }
    public String getEndpointBindList() {
        return this.endpointBindList;
    }

    public CreateDBNodesRequest setImciSwitch(String imciSwitch) {
        this.imciSwitch = imciSwitch;
        return this;
    }
    public String getImciSwitch() {
        return this.imciSwitch;
    }

    public CreateDBNodesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBNodesRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public CreateDBNodesRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public CreateDBNodesRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateDBNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CreateDBNodesRequestDBNode extends TeaModel {
        /**
         * <p>The specifications of the new node. The specifications must be the same as those of the existing nodes in the cluster. For more information, see the following topics:</p>
         * <ul>
         * <li><p>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">compute node specifications</a>.</p>
         * </li>
         * <li><p>PolarDB for PostgreSQL (Oracle Compatible): <a href="https://help.aliyun.com/document_detail/207921.html">compute node specifications</a>.</p>
         * </li>
         * <li><p>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">compute node specifications</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You must specify either <code>DBNode.N.ZoneId</code> or <code>DBNode.N.TargetClass</code>. <code>N</code> is an integer that starts from 1. The maximum value of <code>N</code> is 16 minus the number of existing nodes.</p>
         * </li>
         * <li><p>For PolarDB for MySQL clusters, you can add multiple read-only nodes in a single request, up to a total of 15 read-only nodes.</p>
         * </li>
         * <li><p>This parameter is required for PolarDB for PostgreSQL (Oracle Compatible) and PolarDB for PostgreSQL clusters, but optional for PolarDB for MySQL clusters.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The ID of the zone for the new node. This zone must be the same as the zone of the existing nodes. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query zone IDs.</p>
         * <blockquote>
         * <ul>
         * <li><p>You must specify either <code>DBNode.N.ZoneId</code> or <code>DBNode.N.TargetClass</code>. <code>N</code> is an integer that starts from 1. The maximum value of <code>N</code> is 16 minus the number of existing nodes.</p>
         * </li>
         * <li><p>For PolarDB for MySQL clusters, you can add multiple read-only nodes in a single request, up to a total of 15 read-only nodes.</p>
         * </li>
         * <li><p>This parameter is required for PolarDB for PostgreSQL (Oracle Compatible) and PolarDB for PostgreSQL clusters, but optional for PolarDB for MySQL clusters.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao-c</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateDBNodesRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesRequestDBNode self = new CreateDBNodesRequestDBNode();
            return TeaModel.build(map, self);
        }

        public CreateDBNodesRequestDBNode setTargetClass(String targetClass) {
            this.targetClass = targetClass;
            return this;
        }
        public String getTargetClass() {
            return this.targetClass;
        }

        public CreateDBNodesRequestDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
