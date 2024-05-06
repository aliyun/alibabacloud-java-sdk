// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result returned.</p>
     */
    @NameInMap("result")
    public GetInstanceResponseBodyResult result;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setResult(GetInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetInstanceResponseBodyResultTags extends TeaModel {
        /**
         * <p>标签键</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>标签值</p>
         */
        @NameInMap("value")
        public String value;

        public static GetInstanceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResultTags self = new GetInstanceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method.</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The product code.</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether an overdue payment is involved.</p>
         */
        @NameInMap("inDebt")
        public Boolean inDebt;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock status.</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   INIT: being initialized</p>
         * <p>*   WAIT_CONFIG: to be configured</p>
         * <p>*   CONFIG_UPDATING: configuration taking effect</p>
         * <p>*   READY: normal</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>标签。</p>
         */
        @NameInMap("tags")
        public java.util.List<GetInstanceResponseBodyResultTags> tags;

        /**
         * <p>The time when the instance was last updated.</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResult self = new GetInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetInstanceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetInstanceResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetInstanceResponseBodyResult setInDebt(Boolean inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Boolean getInDebt() {
            return this.inDebt;
        }

        public GetInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public GetInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyResult setTags(java.util.List<GetInstanceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public GetInstanceResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
