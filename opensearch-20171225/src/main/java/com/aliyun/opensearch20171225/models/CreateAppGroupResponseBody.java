// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>766CF6DB-CA02-3E12-7CBA-6AC21FC978FD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>None</p>
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
        /**
         * <p>The computing resources. Unit: logical computing units (LCUs).</p>
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
         * <p>The type of billing. Valid values:</p>
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
         * <p>1590139542</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the current online version.</p>
         * 
         * <strong>example:</strong>
         * <p>100302903</p>
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
         * <p>The type of the industry. Valid values:</p>
         * <ul>
         * <li>GENERAL</li>
         * <li>ECOMMERCE</li>
         * <li>IT_CONTENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
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
         * <p>100302881</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>lsh_test_1</p>
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
        public CreateAppGroupResponseBodyResultQuota quota;

        /**
         * <p>The status of the application. Valid values:</p>
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
         * <p>1590486386</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li>standard: a standard edition application.</li>
         * <li>advance: an advanced edition which is of an old version. New version is not supported for this edition.</li>
         * <li>enhanced: an advanced edition application of a new version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1590978265</p>
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

        public CreateAppGroupResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public CreateAppGroupResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
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

        public CreateAppGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
