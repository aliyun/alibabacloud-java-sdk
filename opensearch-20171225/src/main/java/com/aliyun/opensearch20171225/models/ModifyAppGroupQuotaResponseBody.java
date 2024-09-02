// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the application.</p>
     */
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
         * <p>The specifications of the application. Valid values:</p>
         * <ul>
         * <li>opensearch.share.junior: basic</li>
         * <li>opensearch.share.common: shared general-purpose</li>
         * <li>opensearch.share.compute: shared computing</li>
         * <li>opensearch.share.storage: shared storage</li>
         * <li>opensearch.private.common: exclusive general-purpose</li>
         * <li>opensearch.private.compute: exclusive computing</li>
         * <li>opensearch.private.storage: exclusive storage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
         */
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
        /**
         * <p>The billing method of the application. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go</li>
         * <li>PREPAY: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The billing model. Valid values:</p>
         * <ul>
         * <li>1: computing resources</li>
         * <li>2: queries per second (QPS)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("chargingWay")
        public Integer chargingWay;

        /**
         * <p>The code of the commodity.</p>
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
         * <p>1</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("engineType")
        public String engineType;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The approval status of the quotas. Valid values:</p>
         * <ul>
         * <li>0: The quotas are approved.</li>
         * <li>1: The quotas are being approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("hasPendingQuotaReviewTask")
        public Integer hasPendingQuotaReviewTask;

        /**
         * <p>The ID of the application.</p>
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
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li>Unlock: The instance is not locked.</li>
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
         * <p>Indicates whether the order is complete. Valid values:</p>
         * <ul>
         * <li>0: The order is in progress.</li>
         * <li>1: The order is complete.</li>
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
         * <p>1000</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The information about the quotas of the application.</p>
         */
        @NameInMap("quota")
        public ModifyAppGroupQuotaResponseBodyResultQuota quota;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>producing</li>
         * <li>review_pending</li>
         * <li>config_pending</li>
         * <li>normal</li>
         * <li>frozen</li>
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
         * <li>standard: a standard application.</li>
         * <li>advance: an advanced application which is of an old application type. New applications cannot be of this type.</li>
         * <li>enhanced: an advanced application which is of a new application type.</li>
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
         * <p>1590978265</p>
         */
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

        public ModifyAppGroupQuotaResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ModifyAppGroupQuotaResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
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

        public ModifyAppGroupQuotaResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public ModifyAppGroupQuotaResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
