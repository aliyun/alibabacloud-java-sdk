// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListAppGroupsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAppGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsResponseBody self = new ListAppGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsResponseBody setResult(java.util.List<ListAppGroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAppGroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListAppGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppGroupsResponseBodyResultQuota extends TeaModel {
        @NameInMap("spec")
        public String spec;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("computeResource")
        public Integer computeResource;

        public static ListAppGroupsResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsResponseBodyResultQuota self = new ListAppGroupsResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListAppGroupsResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ListAppGroupsResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

    }

    public static class ListAppGroupsResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("currentVersion")
        public String currentVersion;

        @NameInMap("pendingSecondRankAlgoDeploymentId")
        public Integer pendingSecondRankAlgoDeploymentId;

        @NameInMap("lockMode")
        public String lockMode;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("id")
        public String id;

        @NameInMap("chargeType")
        public String chargeType;

        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        @NameInMap("quota")
        public ListAppGroupsResponseBodyResultQuota quota;

        @NameInMap("name")
        public String name;

        @NameInMap("processingOrderId")
        public String processingOrderId;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("type")
        public String type;

        @NameInMap("chargingWay")
        public Integer chargingWay;

        @NameInMap("status")
        public String status;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("switchedTime")
        public Integer switchedTime;

        @NameInMap("expireOn")
        public String expireOn;

        @NameInMap("description")
        public String description;

        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        @NameInMap("lockedByExpiration")
        public Integer lockedByExpiration;

        @NameInMap("produced")
        public Integer produced;

        public static ListAppGroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsResponseBodyResult self = new ListAppGroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListAppGroupsResponseBodyResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListAppGroupsResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListAppGroupsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListAppGroupsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppGroupsResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListAppGroupsResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ListAppGroupsResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setQuota(ListAppGroupsResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ListAppGroupsResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ListAppGroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppGroupsResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ListAppGroupsResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAppGroupsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppGroupsResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ListAppGroupsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppGroupsResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListAppGroupsResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListAppGroupsResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ListAppGroupsResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ListAppGroupsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppGroupsResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ListAppGroupsResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

    }

}
