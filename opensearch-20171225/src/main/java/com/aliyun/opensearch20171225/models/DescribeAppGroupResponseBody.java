// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("result")
    public DescribeAppGroupResponseBodyResult result;

    public static DescribeAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupResponseBody self = new DescribeAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppGroupResponseBody setResult(DescribeAppGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppGroupResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing unit (LCU).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications. Valid values:</p>
         * <ul>
         * <li>opensearch.share.junior: basic.</li>
         * <li>opensearch.share.common: shared general-purpose.</li>
         * <li>opensearch.share.compute: shared computing.</li>
         * <li>opensearch.share.storage: shared storage.</li>
         * <li>opensearch.private.common: exclusive general-purpose.</li>
         * <li>opensearch.private.compute: exclusive computing.</li>
         * <li>opensearch.private.storage: exclusive storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static DescribeAppGroupResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupResponseBodyResultQuota self = new DescribeAppGroupResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public DescribeAppGroupResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public DescribeAppGroupResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeAppGroupResponseBodyResultTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value</p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeAppGroupResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupResponseBodyResultTags self = new DescribeAppGroupResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppGroupResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAppGroupResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go.</li>
         * <li>PREPAY: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billable item. Valid values:</p>
         * <ul>
         * <li>1: computing resources.</li>
         * <li>2: queries per second (QPS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("chargingWay")
        public Integer chargingWay;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The timestamp when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1575442875</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the current online version.</p>
         * 
         * <strong>example:</strong>
         * <p>110116134</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The industry of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ecommerce</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3</p>
         */
        @NameInMap("engineType")
        public String engineType;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The ID of the created rough sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The approval state of the quotas. Valid values:</p>
         * <ul>
         * <li>0: The application is in service.</li>
         * <li>1: The quotas are being reviewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>110116134</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock state. Valid values:</p>
         * <ul>
         * <li>Unlock: The instance is unlocked.</li>
         * <li>LockByExpiration: The instance is automatically locked after it expires.</li>
         * <li>ManualLock: The instance is manually locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>Indicates whether the instance is automatically locked after it expires.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>os_function_test_v1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the fine sort expression that is being created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        /**
         * <p>The ID of the order that is not complete.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("processingOrderId")
        public String processingOrderId;

        /**
         * <p>Indicates whether the application is created. Valid values:</p>
         * <ul>
         * <li>0: The application is being created.</li>
         * <li>1: The application is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The name of the A/B test group.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The information about the quotas of the application.</p>
         */
        @NameInMap("quota")
        public DescribeAppGroupResponseBodyResultQuota quota;

        /**
         * <p>The ID of the resource group to which the network instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmoiyerh6nzly</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the created fine sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The state of the application. Valid values:</p>
         * <ul>
         * <li>producing: The application is being created.</li>
         * <li>review_pending: The application is being reviewed.</li>
         * <li>config_pending: The application is to be configured.</li>
         * <li>normal: The application is in service.</li>
         * <li>frozen: The application is frozen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the current online version was published.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The application tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<DescribeAppGroupResponseBodyResultTags> tags;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li>standard: a High-performance Search Edition application.</li>
         * <li>enhanced: an Industry Algorithm Edition application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1578916076</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static DescribeAppGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupResponseBodyResult self = new DescribeAppGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeAppGroupResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public DescribeAppGroupResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeAppGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeAppGroupResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeAppGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppGroupResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeAppGroupResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeAppGroupResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public DescribeAppGroupResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public DescribeAppGroupResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public DescribeAppGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppGroupResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAppGroupResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeAppGroupResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public DescribeAppGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppGroupResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public DescribeAppGroupResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public DescribeAppGroupResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public DescribeAppGroupResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAppGroupResponseBodyResult setQuota(DescribeAppGroupResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAppGroupResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public DescribeAppGroupResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeAppGroupResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public DescribeAppGroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppGroupResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public DescribeAppGroupResponseBodyResult setTags(java.util.List<DescribeAppGroupResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAppGroupResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeAppGroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAppGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
