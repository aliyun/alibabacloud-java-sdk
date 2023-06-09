// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the application was created.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the created rough sort expression.</p>
     */
    @NameInMap("result")
    public CreateAppGroupResponseBodyResult result;

    public static CreateAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponseBody self = new CreateAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppGroupResponseBody setResult(CreateAppGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppGroupResponseBodyResultQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The ID of the order that is not complete for the instance. For example, an order is one that is initiated to create the instance or change the quotas or billing method.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static CreateAppGroupResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupResponseBodyResultQuota self = new CreateAppGroupResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateAppGroupResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateAppGroupResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateAppGroupResponseBodyResult extends TeaModel {
        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The ID of the created fine sort expression.</p>
         */
        @NameInMap("chargingWay")
        public Integer chargingWay;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   standard: a standard application.</p>
         * <p>*   advance: an advanced application which is of an old application type. New applications cannot be of this type.</p>
         * <p>*   enhanced: an advanced application which is of a new application type.</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The ID of the current online version.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public String domain;

        /**
         * <p>The ID of the fine sort expression that is being created.</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The timestamp when the current online version was published.</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The billing method of the application. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go</p>
         * <p>*   PREPAY: subscription</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The billing model. Valid values:</p>
         * <br>
         * <p>*   1: computing resources</p>
         * <p>*   2: queries per second (QPS)</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The code of the commodity.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The approval status of the quotas. Valid values:</p>
         * <br>
         * <p>*   0: The quotas are approved.</p>
         * <p>*   1: The quotas are being approved.</p>
         */
        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   Unlock: The instance is not locked.</p>
         * <p>*   LockByExpiration: The instance is automatically locked after it expires.</p>
         * <p>*   ManualLock: The instance is manually locked.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   producing</p>
         * <p>*   review_pending</p>
         * <p>*   config_pending</p>
         * <p>*   normal</p>
         * <p>*   frozen</p>
         */
        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("processingOrderId")
        public String processingOrderId;

        /**
         * <p>The computing resources. Unit: logical computing units (LCUs).</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>N/A</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>Indicates whether the order is complete. Valid values:</p>
         * <br>
         * <p>*   0: The order is in progress.</p>
         * <p>*   1: The order is complete.</p>
         */
        @NameInMap("quota")
        public CreateAppGroupResponseBodyResultQuota quota;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The specifications of the application. Valid values:</p>
         * <br>
         * <p>*   opensearch.share.junior: basic</p>
         * <p>*   opensearch.share.common: shared general-purpose</p>
         * <p>*   opensearch.share.compute: shared computing</p>
         * <p>*   opensearch.share.storage: shared storage</p>
         * <p>*   opensearch.private.common: exclusive general-purpose</p>
         * <p>*   opensearch.private.compute: exclusive computing</p>
         * <p>*   opensearch.private.storage: exclusive storage</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the application was last updated.</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The information about the quotas of the application.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Indicates whether the instance is automatically locked after it expires.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static CreateAppGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupResponseBodyResult self = new CreateAppGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateAppGroupResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public CreateAppGroupResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateAppGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateAppGroupResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public CreateAppGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppGroupResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAppGroupResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public CreateAppGroupResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public CreateAppGroupResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public CreateAppGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAppGroupResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAppGroupResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public CreateAppGroupResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public CreateAppGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppGroupResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public CreateAppGroupResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public CreateAppGroupResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public CreateAppGroupResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateAppGroupResponseBodyResult setQuota(CreateAppGroupResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateAppGroupResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public CreateAppGroupResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public CreateAppGroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAppGroupResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public CreateAppGroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAppGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
