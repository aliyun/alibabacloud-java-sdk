// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ModifyAppGroupQuotaResponseBodyResult result;

    public static ModifyAppGroupQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupQuotaResponseBody self = new ModifyAppGroupQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppGroupQuotaResponseBody setResult(ModifyAppGroupQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyAppGroupQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyAppGroupQuotaResponseBodyResultQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("spec")
        public String spec;

        public static ModifyAppGroupQuotaResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupQuotaResponseBodyResultQuota self = new ModifyAppGroupQuotaResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ModifyAppGroupQuotaResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ModifyAppGroupQuotaResponseBodyResult extends TeaModel {
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

        @NameInMap("quota")
        public ModifyAppGroupQuotaResponseBodyResultQuota quota;

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

        public static ModifyAppGroupQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppGroupQuotaResponseBodyResult self = new ModifyAppGroupQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyAppGroupQuotaResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyAppGroupQuotaResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ModifyAppGroupQuotaResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ModifyAppGroupQuotaResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAppGroupQuotaResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ModifyAppGroupQuotaResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ModifyAppGroupQuotaResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyAppGroupQuotaResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ModifyAppGroupQuotaResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ModifyAppGroupQuotaResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppGroupQuotaResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public ModifyAppGroupQuotaResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setQuota(ModifyAppGroupQuotaResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ModifyAppGroupQuotaResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ModifyAppGroupQuotaResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ModifyAppGroupQuotaResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppGroupQuotaResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ModifyAppGroupQuotaResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyAppGroupQuotaResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
