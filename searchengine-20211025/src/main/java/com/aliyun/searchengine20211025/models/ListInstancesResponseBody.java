// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result returned</p>
     */
    @NameInMap("result")
    public java.util.List<ListInstancesResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setResult(java.util.List<ListInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyResultNetwork extends TeaModel {
        /**
         * <p>353490</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>### Sample responses</p>
         * <br>
         * <p>**Sample success responses**</p>
         * <br>
         * <p>    {</p>
         * <p>        "requestId": "90D6B8F5-FE97-4509-9AAB-367836C51818",</p>
         * <p>        "result": [</p>
         * <p>            {</p>
         * <p>                "instanceId": "igraph-cn-xxxxxx1",</p>
         * <p>                "spec": {</p>
         * <p>                    "password": "passwd",</p>
         * <p>                    "searchResource": {</p>
         * <p>                        "disk": 50,</p>
         * <p>                        "mem": 8,</p>
         * <p>                        "cpu": 2,</p>
         * <p>                        "nodeCount": 2</p>
         * <p>                    },</p>
         * <p>                    "instanceName": "testInstance",</p>
         * <p>                    "vSwitchId": "vswitch_id_xxx",</p>
         * <p>                    "vpcId": "vpc_id_xxx",</p>
         * <p>                    "qrsResource": {</p>
         * <p>                        "disk": 50,</p>
         * <p>                        "mem": 8,</p>
         * <p>                        "cpu": 2,</p>
         * <p>                        "nodeCount": 2</p>
         * <p>                    },</p>
         * <p>                    "region": "cn-hangzhou",</p>
         * <p>                    "userName": "user"</p>
         * <p>                },</p>
         * <p>                "status": {</p>
         * <p>                    "phase": "PENDING",</p>
         * <p>                    "instancePhase": "INIT",</p>
         * <p>                    "createSuccess": false</p>
         * <p>                }</p>
         * <p>            },</p>
         * <p>            {</p>
         * <p>                "instanceId": "igraph-cn-xxxxxx2",</p>
         * <p>                "spec": {</p>
         * <p>                    "password": "passwd",</p>
         * <p>                    "searchResource": {</p>
         * <p>                        "disk": 50,</p>
         * <p>                        "mem": 8,</p>
         * <p>                        "cpu": 2,</p>
         * <p>                        "nodeCount": 2</p>
         * <p>                    },</p>
         * <p>                    "instanceName": "testInstance",</p>
         * <p>                    "vSwitchId": "vswitch_id_xxx",</p>
         * <p>                    "vpcId": "vpc_id_xxx",</p>
         * <p>                    "qrsResource": {</p>
         * <p>                        "disk": 50,</p>
         * <p>                        "mem": 8,</p>
         * <p>                        "cpu": 2,</p>
         * <p>                        "nodeCount": 2</p>
         * <p>                    },</p>
         * <p>                    "region": "cn-hangzhou",</p>
         * <p>                    "userName": "user"</p>
         * <p>                },</p>
         * <p>                "status": {</p>
         * <p>                    "phase": "PENDING",</p>
         * <p>                    "instancePhase": "INIT",</p>
         * <p>                    "createSuccess": false</p>
         * <p>                }</p>
         * <p>            }</p>
         * <p>        ],</p>
         * <p>        "totalCount": 20</p>
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
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>Queries instances.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListInstancesResponseBodyResultNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultNetwork self = new ListInstancesResponseBodyResultNetwork();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultNetwork setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyResultNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListInstancesResponseBodyResultNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListInstancesResponseBodyResultTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListInstancesResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultTags self = new ListInstancesResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The total number of entries returned</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>Havenask instance</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the virtual switch</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the Virtual Private Cloud (VPC) network</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the request</p>
         */
        @NameInMap("inDebt")
        public Boolean inDebt;

        /**
         * <p>The access point of the gateway</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Emergency test</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The lock status</p>
         */
        @NameInMap("network")
        public ListInstancesResponseBodyResultNetwork network;

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The expiration time</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListInstancesResponseBodyResultTags> tags;

        /**
         * <p>The time when the instance was last updated</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResult self = new ListInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListInstancesResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstancesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListInstancesResponseBodyResult setInDebt(Boolean inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Boolean getInDebt() {
            return this.inDebt;
        }

        public ListInstancesResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListInstancesResponseBodyResult setNetwork(ListInstancesResponseBodyResultNetwork network) {
            this.network = network;
            return this;
        }
        public ListInstancesResponseBodyResultNetwork getNetwork() {
            return this.network;
        }

        public ListInstancesResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyResult setTags(java.util.List<ListInstancesResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
