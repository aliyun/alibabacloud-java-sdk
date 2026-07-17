// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
         * <p>The computing resources in logical compute units (LCUs).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications. Valid values:</p>
         * <ul>
         * <li><p>opensearch.share.junior: Basic</p>
         * </li>
         * <li><p>opensearch.share.common: Shared General-purpose</p>
         * </li>
         * <li><p>opensearch.share.compute: Shared Compute-optimized</p>
         * </li>
         * <li><p>opensearch.share.storage: Shared Storage-optimized</p>
         * </li>
         * <li><p>opensearch.private.common: Exclusive General-purpose</p>
         * </li>
         * <li><p>opensearch.private.compute: Exclusive Compute-optimized</p>
         * </li>
         * <li><p>opensearch.private.storage: Exclusive Storage-optimized</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
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
         * <ul>
         * <li><p>POSTPAY: pay-as-you-go.</p>
         * </li>
         * <li><p>PREPAY: subscription.</p>
         * </li>
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
         * <li><p>1: computing resources.</p>
         * </li>
         * <li><p>2: QPS.</p>
         * </li>
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
         * <p>The UNIX timestamp when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>159013954</p>
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

        /**
         * <p>The industry. Valid values:</p>
         * <ul>
         * <li><p>GENERAL: general.</p>
         * </li>
         * <li><p>ECOMMERCE: e-commerce.</p>
         * </li>
         * <li><p>IT_CONTENT: IT content.</p>
         * </li>
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
         * <p>1</p>
         */
        @NameInMap("expireOn")
        public String expireOn;

        /**
         * <p>The approval status of the quota. Valid values:</p>
         * <ul>
         * <li><p>0: normal.</p>
         * </li>
         * <li><p>1: being approved.</p>
         * </li>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10030288</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li><p>Unlock: The instance is not locked.</p>
         * </li>
         * <li><p>LockByExpiration: The instance is automatically locked after it expires.</p>
         * </li>
         * <li><p>ManualLock: The instance is manually locked.</p>
         * </li>
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
         * <li><p>0: The application is being created.</p>
         * </li>
         * <li><p>1: The application is created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The name of the A/B test project.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The quota information of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("quota")
        public ModifyAppGroupResponseBodyResultQuota quota;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmoiyerh6nzly</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li><p>producing: The application is being created.</p>
         * </li>
         * <li><p>review_pending: The application is under review.</p>
         * </li>
         * <li><p>config_pending: The application requires configuration.</p>
         * </li>
         * <li><p>normal: The application is running.</p>
         * </li>
         * <li><p>frozen: The application is frozen.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The UNIX timestamp when the current online version was published.</p>
         * 
         * <strong>example:</strong>
         * <p>1590486386</p>
         */
        @NameInMap("switchedTime")
        public Integer switchedTime;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li><p>standard: a Standard Edition application.</p>
         * </li>
         * <li><p>advance: an Advanced Edition application of an old version. New applications do not support this type.</p>
         * </li>
         * <li><p>enhanced: an Enhanced Edition application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The UNIX timestamp when the application was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1590978265</p>
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

        public ModifyAppGroupResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ModifyAppGroupResponseBodyResult setExpireOn(String expireOn) {
            this.expireOn = expireOn;
            return this;
        }
        public String getExpireOn() {
            return this.expireOn;
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

        public ModifyAppGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public ModifyAppGroupResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
