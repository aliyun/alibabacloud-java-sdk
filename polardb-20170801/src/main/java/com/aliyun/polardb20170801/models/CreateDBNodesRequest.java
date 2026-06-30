// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): Use coupons.</li>
     * <li>false: Do not use coupons.</li>
     * </ul>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and can contain only ASCII characters. The token can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud service provider to which the node belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ENS</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information about the new node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li>RO</li>
     * <li>STANDBY</li>
     * <li>DLNode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The ID of the cluster endpoint to which you want to add the new node. If you want to add the node to multiple endpoints, separate the endpoint IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the details of cluster endpoints, including endpoint IDs.</li>
     * <li>You can specify the IDs of the default cluster endpoint and custom cluster endpoints.</li>
     * <li>If you leave this parameter empty, the new node is added to all cluster endpoints that have the <strong>Automatically Associate New Nodes</strong> feature enabled (the value of <code>AutoAddNewNodes</code> is <code>Enable</code>).</li>
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
     * <li><p><strong>ON</strong>: enabled.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disabled. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</p>
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
     * <p>The latest time to start running the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If you specify <code>PlannedStartTime</code> but leave this parameter empty, the latest time defaults to <code>start time + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start running the scheduled task for adding nodes. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a start time within the range of <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the task for adding nodes is immediately run.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The resource group ID.</p>
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
         * <p>The specification of the new node. The specification must be the same as that of the existing nodes. For more information, see the following topics:</p>
         * <ul>
         * <li>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>. </li>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a>.</li>
         * <li>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a>.<blockquote>
         * <ul>
         * <li>You must specify at least one of DBNode.N.ZoneId and DBNode.N.TargetClass. N is an integer that starts from 1. Maximum value of N = 16 - current number of nodes.</li>
         * <li>Only PolarDB for MySQL clusters support adding multiple read-only nodes at a time. You can add up to 15 read-only nodes.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The zone of the new node. The zone must be the same as that of the existing nodes. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query zone IDs.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of DBNode.N.ZoneId and DBNode.N.TargetClass. N is an integer that starts from 1. Maximum value of N = 16 - current number of nodes. </li>
         * <li>Only PolarDB for MySQL clusters support adding multiple read-only nodes at a time. You can add up to 15 read-only nodes.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
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
