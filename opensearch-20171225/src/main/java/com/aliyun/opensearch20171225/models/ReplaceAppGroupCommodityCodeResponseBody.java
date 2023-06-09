// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReplaceAppGroupCommodityCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result that was returned.</p>
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
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

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
        @NameInMap("chargeType")
        public String chargeType;

        @NameInMap("chargingWay")
        public Integer chargingWay;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("created")
        public Integer created;

        @NameInMap("currentVersion")
        public String currentVersion;

        @NameInMap("description")
        public String description;

        @NameInMap("expireOn")
        public String expireOn;

        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("lockMode")
        public String lockMode;

        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        @NameInMap("name")
        public String name;

        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        @NameInMap("processingOrderId")
        public String processingOrderId;

        @NameInMap("produced")
        public Integer produced;

        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The quota information.</p>
         */
        @NameInMap("quota")
        public ReplaceAppGroupCommodityCodeResponseBodyResultQuota quota;

        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        @NameInMap("status")
        public String status;

        @NameInMap("switchedTime")
        public Integer switchedTime;

        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public Integer updated;

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
