// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReplaceAppGroupCommodityCodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public ReplaceAppGroupCommodityCodeResponseBodyResult result;

    public static ReplaceAppGroupCommodityCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceAppGroupCommodityCodeResponseBody self = new ReplaceAppGroupCommodityCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceAppGroupCommodityCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceAppGroupCommodityCodeResponseBody setResult(ReplaceAppGroupCommodityCodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReplaceAppGroupCommodityCodeResponseBodyResult getResult() {
        return this.result;
    }

    public static class ReplaceAppGroupCommodityCodeResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The number of computing resources configured.</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity.</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications configured.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static ReplaceAppGroupCommodityCodeResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ReplaceAppGroupCommodityCodeResponseBodyResultQuota self = new ReplaceAppGroupCommodityCodeResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ReplaceAppGroupCommodityCodeResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go.</p>
         * <p>*   PREPAY: subscription.</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billing type. Valid values:</p>
         * <br>
         * <p>*   1: computing resources.</p>
         * <p>*   2: queries per second (QPS).</p>
         */
        @NameInMap("chargingWay")
        public Integer chargingWay;

        /**
         * <p>The code of the commodity.</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The timestamp when the application was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the current online version.</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The ID of the rough sort expression.</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The approval state of the quotas. Valid values:</p>
         * <br>
         * <p>*   0: The approval status is normal.</p>
         * <p>*   1: The quotas are being approved.</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The application ID.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock state. Valid values:</p>
         * <br>
         * <p>*   Unlock: The instance is unlocked.</p>
         * <p>*   LockByExpiration: The instance is automatically locked after it expires.</p>
         * <p>*   ManualLock: The instance is manually locked.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>Indicates whether the instance is automatically locked after it expires. Valid values:</p>
         * <br>
         * <p>*   0: The instance is not automatically locked after it expires.</p>
         * <p>*   1: The instance is automatically locked after it expires.</p>
         */
        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        /**
         * <p>The name of the order.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the fine sort expression that is being created.</p>
         */
        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        /**
         * <p>The ID of the order that is in progress.</p>
         */
        @NameInMap("processingOrderId")
        public String processingOrderId;

        /**
         * <p>Indicates whether the order is produced.</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The name of the A/B test group.</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The configuration information.</p>
         */
        @NameInMap("quota")
        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota quota;

        /**
         * <p>The ID of the fine sort expression.</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The status of the application.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the current online version was published.</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The type of the application.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was updated.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        /**
         * <p>The versions.</p>
         */
        @NameInMap("versions")
        public java.util.List<String> versions;

        public static ReplaceAppGroupCommodityCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReplaceAppGroupCommodityCodeResponseBodyResult self = new ReplaceAppGroupCommodityCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setQuota(ReplaceAppGroupCommodityCodeResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ReplaceAppGroupCommodityCodeResponseBodyResult setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
