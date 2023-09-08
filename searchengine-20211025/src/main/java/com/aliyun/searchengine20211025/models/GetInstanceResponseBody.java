// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The description of the instance.</p>
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
        @NameInMap("key")
        public String key;

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
         * <p>付费类型</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>商品code</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>WB01240825</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>是否欠费</p>
         */
        @NameInMap("inDebt")
        public Boolean inDebt;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>锁定状态</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>### Sample responses</p>
         * <br>
         * <p>**Sample success responses**</p>
         * <br>
         * <p>    {</p>
         * <p>      "requestId": "90D6B8F5-FE97-4509-9AAB-367836C51818",</p>
         * <p>      "result": </p>
         * <p>      {</p>
         * <p>        "instanceId":"fadsfsafs",</p>
         * <p>        "inDebt":true,</p>
         * <p>        "lockMode":"Unlock",</p>
         * <p>        "expiredTime":"asdfas",</p>
         * <p>        "updateTime":"dfasf",</p>
         * <p>        "createTime":"dfasf",</p>
         * <p>        "resourceGroupId":"resourceGroupID",</p>
         * <p>        "commodityCode":"commodityCode",</p>
         * <p>        "chargeType":"POSYPAY",</p>
         * <p>        "description":"this is description",</p>
         * <p>        "apiVersion": "tisplus/v1",</p>
         * <p>        "network": {</p>
         * <p>          "vSwitchId": "vswitch_id_xxx",</p>
         * <p>          "vpcId": "vpc_id_xxx",	  </p>
         * <p>        },</p>
         * <p>        "userName": "user",</p>
         * <p>        "spec": {</p>
         * <p>          "searchResource": {</p>
         * <p>            "disk": 50,</p>
         * <p>            "mem": 8,</p>
         * <p>            "cpu": 2,</p>
         * <p>            "nodeCount": 2</p>
         * <p>          },</p>
         * <p>          "qrsResource": {</p>
         * <p>            "disk": 50,</p>
         * <p>            "mem": 8,</p>
         * <p>            "cpu": 2,</p>
         * <p>            "nodeCount": 2</p>
         * <p>          }</p>
         * <p>        },</p>
         * <p>       "status": "INIT",</p>
         * <p>      }</p>
         * <p>    }</p>
         * <br>
         * <p>**Sample error responses**</p>
         * <br>
         * <p>    {</p>
         * <p>      "requestId": "BD1EA715-DF6F-06C2-004C-C1FA0D3A9820",</p>
         * <p>      "httpCode": 404,</p>
         * <p>      "code": "App.NotFound",</p>
         * <p>      "message": "App not found"</p>
         * <p>    }</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<GetInstanceResponseBodyResultTags> tags;

        /**
         * <p>更新时间</p>
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
