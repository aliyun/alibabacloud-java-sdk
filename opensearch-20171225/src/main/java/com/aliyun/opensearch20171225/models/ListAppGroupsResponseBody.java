// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsResponseBody extends TeaModel {
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/170000.html">AppGroup</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<ListAppGroupsResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
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
         * <p>&quot;xxx&quot;</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The industry of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
         * <p>The time when the application expired.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;xxx&quot;</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

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
         * <p>&quot;xxx&quot;</p>
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
         * <p>&quot;xxx&quot;</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The information about the quotas of the application. For more information, see <a href="https://help.aliyun.com/document_detail/170001.html">Quota</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("quota")
        public ListAppGroupsResponseBodyResultQuota quota;

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
        public java.util.List<ListAppGroupsResponseBodyResultTags> tags;

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

        public ListAppGroupsResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListAppGroupsResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
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
