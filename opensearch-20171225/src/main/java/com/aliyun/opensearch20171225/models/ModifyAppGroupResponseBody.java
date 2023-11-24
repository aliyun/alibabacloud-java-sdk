// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("result")
    public ModifyAppGroupResponseBodyResult result;

    public static ModifyAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupResponseBody self = new ModifyAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppGroupResponseBody setResult(ModifyAppGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyAppGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyAppGroupResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing unit (LCU).</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications. Valid values:</p>
         * <br>
         * <p>*   opensearch.share.junior: basic.</p>
         * <p>*   opensearch.share.common: shared general-purpose.</p>
         * <p>*   opensearch.share.compute: shared computing.</p>
         * <p>*   opensearch.share.storage: shared storage.</p>
         * <p>*   opensearch.private.common: exclusive general-purpose.</p>
         * <p>*   opensearch.private.compute: exclusive computing.</p>
         * <p>*   opensearch.private.storage: exclusive storage.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static ModifyAppGroupResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupResponseBodyResultQuota self = new ModifyAppGroupResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ModifyAppGroupResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ModifyAppGroupResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ModifyAppGroupResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go.</p>
         * <p>*   PREPAY: subscription.</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billable item. Valid values:</p>
         * <br>
         * <p>*   1: computing resources.</p>
         * <p>*   2: QPS.</p>
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
         * <p>The type of the industry. Valid values:</p>
         * <br>
         * <p>*   GENERAL: general.</p>
         * <p>*   ECOMMERCE: e-commerce.</p>
         * <p>*   IT_CONTENT: IT content.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The time when the application expired.</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The ID of the rough sort expression.</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The approval status of the quotas. Valid values:</p>
         * <br>
         * <p>*   0: normal.</p>
         * <p>*   1: being approved.</p>
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
         * <p>The lock status. Valid values:</p>
         * <br>
         * <p>*   Unlock: The instance is unlocked.</p>
         * <p>*   LockByExpiration: The instance is automatically locked after it expires.</p>
         * <p>*   ManualLock: The instance is manually locked.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>Indicates whether the instance expires and is automatically locked. Valid values:</p>
         * <br>
         * <p>*   0: no.</p>
         * <p>*   1: yes.</p>
         */
        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the fine sort expression that is being created.</p>
         */
        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        /**
         * <p>The ID of the order that is not complete for the instance.</p>
         */
        @NameInMap("processingOrderId")
        public String processingOrderId;

        /**
         * <p>Indicates whether the order is complete. Valid values:</p>
         * <br>
         * <p>*   0: The order is in progress.</p>
         * <p>*   1: The order is complete.</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The name of the A/B test group.</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The information about the quotas of the application.</p>
         */
        @NameInMap("quota")
        public ModifyAppGroupResponseBodyResultQuota quota;

        /**
         * <p>The ID of the fine sort expression.</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The state of the application. Valid values:</p>
         * <br>
         * <p>*   producing: being produced.</p>
         * <p>*   review_pending: being approved.</p>
         * <p>*   config_pending: to be configured.</p>
         * <p>*   normal: normal.</p>
         * <p>*   frozen: frozen.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the current online version was published.</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   standard: a standard edition application.</p>
         * <p>*   advance: an advanced edition application of an old version. New versions are not supported for this edition.</p>
         * <p>*   enhanced: an advanced edition application of a new version.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last modified.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ModifyAppGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupResponseBodyResult self = new ModifyAppGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyAppGroupResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ModifyAppGroupResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ModifyAppGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifyAppGroupResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ModifyAppGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAppGroupResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyAppGroupResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ModifyAppGroupResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ModifyAppGroupResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ModifyAppGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyAppGroupResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyAppGroupResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ModifyAppGroupResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ModifyAppGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppGroupResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ModifyAppGroupResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ModifyAppGroupResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public ModifyAppGroupResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ModifyAppGroupResponseBodyResult setQuota(ModifyAppGroupResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ModifyAppGroupResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ModifyAppGroupResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ModifyAppGroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppGroupResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ModifyAppGroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyAppGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
