// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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

        @NameInMap("domain")
        public String domain;

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
        public CreateAppGroupResponseBodyResultQuota quota;

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
