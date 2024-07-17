// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>89B968E6-1E41-58DF-BB25-5F98ECC759CE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInstancesResponseBodyResult> result;

    /**
     * <p>The total number of entries returned</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        @NameInMap("allow")
        public String allow;

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("publicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp11ldcf59q2nbwkqgj6z</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9axk41d9vffoc79x0oe</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListInstancesResponseBodyResultNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultNetwork self = new ListInstancesResponseBodyResultNetwork();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultNetwork setAllow(String allow) {
            this.allow = allow;
            return this;
        }
        public String getAllow() {
            return this.allow;
        }

        public ListInstancesResponseBodyResultNetwork setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyResultNetwork setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
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

    public static class ListInstancesResponseBodyResultSpecQrsResource extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("cpu")
        public Integer cpu;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("mem")
        public Integer mem;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        public static ListInstancesResponseBodyResultSpecQrsResource build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultSpecQrsResource self = new ListInstancesResponseBodyResultSpecQrsResource();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultSpecQrsResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListInstancesResponseBodyResultSpecQrsResource setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListInstancesResponseBodyResultSpecQrsResource setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstancesResponseBodyResultSpecQrsResource setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListInstancesResponseBodyResultSpecQrsResource setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class ListInstancesResponseBodyResultSpecSearchResource extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("cpu")
        public Integer cpu;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("mem")
        public Integer mem;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        public static ListInstancesResponseBodyResultSpecSearchResource build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultSpecSearchResource self = new ListInstancesResponseBodyResultSpecSearchResource();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultSpecSearchResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListInstancesResponseBodyResultSpecSearchResource setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListInstancesResponseBodyResultSpecSearchResource setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstancesResponseBodyResultSpecSearchResource setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListInstancesResponseBodyResultSpecSearchResource setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class ListInstancesResponseBodyResultSpec extends TeaModel {
        @NameInMap("qrsResource")
        public ListInstancesResponseBodyResultSpecQrsResource qrsResource;

        @NameInMap("searchResource")
        public ListInstancesResponseBodyResultSpecSearchResource searchResource;

        public static ListInstancesResponseBodyResultSpec build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyResultSpec self = new ListInstancesResponseBodyResultSpec();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyResultSpec setQrsResource(ListInstancesResponseBodyResultSpecQrsResource qrsResource) {
            this.qrsResource = qrsResource;
            return this;
        }
        public ListInstancesResponseBodyResultSpecQrsResource getQrsResource() {
            return this.qrsResource;
        }

        public ListInstancesResponseBodyResultSpec setSearchResource(ListInstancesResponseBodyResultSpecSearchResource searchResource) {
            this.searchResource = searchResource;
            return this;
        }
        public ListInstancesResponseBodyResultSpecSearchResource getSearchResource() {
            return this.searchResource;
        }

    }

    public static class ListInstancesResponseBodyResultTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>oboms-disk</p>
         */
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-04T02:03:21Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Emergency test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("edition")
        public String edition;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1634885083</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether an overdue payment is involved.</p>
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
         * <p>ha-cn-2r42n8oh001</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock state of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The network information of the instance.</p>
         */
        @NameInMap("network")
        public ListInstancesResponseBodyResultNetwork network;

        @NameInMap("noQrs")
        public Boolean noQrs;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzgpiswzbksdi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("spec")
        public ListInstancesResponseBodyResultSpec spec;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListInstancesResponseBodyResultTags> tags;

        /**
         * <p>The time when the instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-06T11:17:49.0</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("userName")
        public String userName;

        @NameInMap("version")
        public String version;

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

        public ListInstancesResponseBodyResult setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
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

        public ListInstancesResponseBodyResult setNoQrs(Boolean noQrs) {
            this.noQrs = noQrs;
            return this;
        }
        public Boolean getNoQrs() {
            return this.noQrs;
        }

        public ListInstancesResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyResult setSpec(ListInstancesResponseBodyResultSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListInstancesResponseBodyResultSpec getSpec() {
            return this.spec;
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

        public ListInstancesResponseBodyResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListInstancesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
