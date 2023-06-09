// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each application.</p>
     * <br>
     * <p>For more information, see [AppGroup](~~170000~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListAppGroupsResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAppGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsResponseBody self = new ListAppGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupsResponseBody setResult(java.util.List<ListAppGroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAppGroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListAppGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppGroupsResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing units (LCUs).</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

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
        @NameInMap("spec")
        public String spec;

        public static ListAppGroupsResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsResponseBodyResultQuota self = new ListAppGroupsResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ListAppGroupsResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ListAppGroupsResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListAppGroupsResponseBodyResultTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListAppGroupsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsResponseBodyResultTags self = new ListAppGroupsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppGroupsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppGroupsResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method of the application. Valid values:</p>
         * <br>
         * <p>*   POSTPAY: pay-as-you-go</p>
         * <p>*   PREPAY: subscription</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billing model. Valid values:</p>
         * <br>
         * <p>*   1: computing resources</p>
         * <p>*   2: queries per second (QPS)</p>
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
         * <p>domain</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The ID of the created rough sort expression.</p>
         */
        @NameInMap("firstRankAlgoDeploymentId")
        public Integer firstRankAlgoDeploymentId;

        /**
         * <p>The approval status of the quotas. Valid values:</p>
         * <br>
         * <p>*   0: The quotas are approved.</p>
         * <p>*   1: The quotas are being approved.</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   Unlock: The instance is not locked.</p>
         * <p>*   LockByExpiration: The instance is automatically locked after it expires.</p>
         * <p>*   ManualLock: The instance is manually locked.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>Indicates whether the instance is automatically locked after it expires.</p>
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
         * <p>The ID of the order that is not complete for the instance. For example, an order is one that is initiated to create the instance or change the quotas or billing method.</p>
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
         * <br>
         * <p>For more information, see [Quota](https://www.alibabacloud.com/help/doc-detail/170001.htm).</p>
         */
        @NameInMap("quota")
        public ListAppGroupsResponseBodyResultQuota quota;

        /**
         * <p>The ID of the created fine sort expression.</p>
         */
        @NameInMap("secondRankAlgoDeploymentId")
        public Integer secondRankAlgoDeploymentId;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   producing</p>
         * <p>*   review_pending</p>
         * <p>*   config_pending</p>
         * <p>*   normal</p>
         * <p>*   frozen</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The timestamp when the current online version was published.</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        @NameInMap("tags")
        public java.util.List<ListAppGroupsResponseBodyResultTags> tags;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   standard: a standard application.</p>
         * <p>*   advance: an advanced application which is of an old application type. New applications cannot be of this type.</p>
         * <p>*   enhanced: an advanced application which is of a new application type.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last updated.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListAppGroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsResponseBodyResult self = new ListAppGroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListAppGroupsResponseBodyResult setChargingWay(Integer chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }
        public Integer getChargingWay() {
            return this.chargingWay;
        }

        public ListAppGroupsResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
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

        public ListAppGroupsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppGroupsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListAppGroupsResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
        }

        public ListAppGroupsResponseBodyResult setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
            this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
            return this;
        }
        public Integer getFirstRankAlgoDeploymentId() {
            return this.firstRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
            this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
            return this;
        }
        public Integer getHasPendingQuotaReviewTask() {
            return this.hasPendingQuotaReviewTask;
        }

        public ListAppGroupsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppGroupsResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAppGroupsResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListAppGroupsResponseBodyResult setLockedByExpiration(Integer lockedByExpiration) {
            this.lockedByExpiration = lockedByExpiration;
            return this;
        }
        public Integer getLockedByExpiration() {
            return this.lockedByExpiration;
        }

        public ListAppGroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppGroupsResponseBodyResult setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
            this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
            return this;
        }
        public Integer getPendingSecondRankAlgoDeploymentId() {
            return this.pendingSecondRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setProcessingOrderId(String processingOrderId) {
            this.processingOrderId = processingOrderId;
            return this;
        }
        public String getProcessingOrderId() {
            return this.processingOrderId;
        }

        public ListAppGroupsResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public ListAppGroupsResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListAppGroupsResponseBodyResult setQuota(ListAppGroupsResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ListAppGroupsResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ListAppGroupsResponseBodyResult setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
            this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
            return this;
        }
        public Integer getSecondRankAlgoDeploymentId() {
            return this.secondRankAlgoDeploymentId;
        }

        public ListAppGroupsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppGroupsResponseBodyResult setSwitchedTime(Integer switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public Integer getSwitchedTime() {
            return this.switchedTime;
        }

        public ListAppGroupsResponseBodyResult setTags(java.util.List<ListAppGroupsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAppGroupsResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListAppGroupsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppGroupsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
