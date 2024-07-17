// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>90D6B8F5-FE97-4509-9AAB-367836C51818</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     */
    @NameInMap("result")
    public UpdateInstanceResponseBodyResult result;

    public static UpdateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponseBody self = new UpdateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceResponseBody setResult(UpdateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The commodity code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3-code</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-06T11:17:49.0</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The time when the instance expires</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-06T16:00:00.0</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether an overdue payment is involved</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("inDebt")
        public Boolean inDebt;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2s170b03</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock status</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aeky6hthboewpuy</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the instance was last updated</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-06T11:17:49.0</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static UpdateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyResult self = new UpdateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public UpdateInstanceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public UpdateInstanceResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public UpdateInstanceResponseBodyResult setInDebt(Boolean inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Boolean getInDebt() {
            return this.inDebt;
        }

        public UpdateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public UpdateInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateInstanceResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
