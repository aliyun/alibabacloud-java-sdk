// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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

    public static class GetInstanceResponseBodyResultNetwork extends TeaModel {
        /**
         * <p>The whitelist for the public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("allow")
        public String allow;

        /**
         * <p>The gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-35t3r****.ha.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-35t3ni****.public.ha.aliyuncs.com</p>
         */
        @NameInMap("publicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The ID of the virtual switch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp11ldcf59q2n****</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9axk41d9vff****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetInstanceResponseBodyResultNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResultNetwork self = new GetInstanceResponseBodyResultNetwork();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResultNetwork setAllow(String allow) {
            this.allow = allow;
            return this;
        }
        public String getAllow() {
            return this.allow;
        }

        public GetInstanceResponseBodyResultNetwork setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetInstanceResponseBodyResultNetwork setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public GetInstanceResponseBodyResultNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyResultNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetInstanceResponseBodyResultSpecQrsResource extends TeaModel {
        /**
         * <p>The type of the instance. The value local_ssd indicates the local SSD type, and the value cloud indicates the disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public Integer cpu;

        /**
         * <p>The storage space of the node in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The memory size in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("mem")
        public Integer mem;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nodeCount")
        public Integer nodeCount;

        public static GetInstanceResponseBodyResultSpecQrsResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResultSpecQrsResource self = new GetInstanceResponseBodyResultSpecQrsResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResultSpecQrsResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetInstanceResponseBodyResultSpecQrsResource setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetInstanceResponseBodyResultSpecQrsResource setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public GetInstanceResponseBodyResultSpecQrsResource setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetInstanceResponseBodyResultSpecQrsResource setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class GetInstanceResponseBodyResultSpecSearchResource extends TeaModel {
        /**
         * <p>The machine type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public Integer cpu;

        /**
         * <p>The storage space of the node in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The memory size in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("mem")
        public Integer mem;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nodeCount")
        public Integer nodeCount;

        public static GetInstanceResponseBodyResultSpecSearchResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResultSpecSearchResource self = new GetInstanceResponseBodyResultSpecSearchResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResultSpecSearchResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetInstanceResponseBodyResultSpecSearchResource setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetInstanceResponseBodyResultSpecSearchResource setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public GetInstanceResponseBodyResultSpecSearchResource setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetInstanceResponseBodyResultSpecSearchResource setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

    }

    public static class GetInstanceResponseBodyResultSpec extends TeaModel {
        /**
         * <p>The specifications of the query node.</p>
         */
        @NameInMap("qrsResource")
        public GetInstanceResponseBodyResultSpecQrsResource qrsResource;

        /**
         * <p>The specifications of the data node.</p>
         */
        @NameInMap("searchResource")
        public GetInstanceResponseBodyResultSpecSearchResource searchResource;

        public static GetInstanceResponseBodyResultSpec build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResultSpec self = new GetInstanceResponseBodyResultSpec();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResultSpec setQrsResource(GetInstanceResponseBodyResultSpecQrsResource qrsResource) {
            this.qrsResource = qrsResource;
            return this;
        }
        public GetInstanceResponseBodyResultSpecQrsResource getQrsResource() {
            return this.qrsResource;
        }

        public GetInstanceResponseBodyResultSpec setSearchResource(GetInstanceResponseBodyResultSpecSearchResource searchResource) {
            this.searchResource = searchResource;
            return this;
        }
        public GetInstanceResponseBodyResultSpecSearchResource getSearchResource() {
            return this.searchResource;
        }

    }

    public static class GetInstanceResponseBodyResultTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch</p>
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
         * <p>The BS version number.</p>
         * 
         * <strong>example:</strong>
         * <p>bs_3.13.2</p>
         */
        @NameInMap("bsVersion")
        public String bsVersion;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSYPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch_ha3post_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-17T02:01:26Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The edition of the instance. Valid values: - vector: Vector Search Edition - engine: Recall Engine Edition</p>
         * 
         * <strong>example:</strong>
         * <p>vector</p>
         */
        @NameInMap("edition")
        public String edition;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>024-05-21 16:49:31.0</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether the payment for the instance is overdue.</p>
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
         * <p>ha-cn-pl32rf0****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock status.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The network information of the search engine instance.</p>
         */
        @NameInMap("network")
        public GetInstanceResponseBodyResultNetwork network;

        /**
         * <p>Indicates whether the new version of the console is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("newMode")
        public Boolean newMode;

        /**
         * <p>Indicates whether the instance is a standalone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("noQrs")
        public Boolean noQrs;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzjvw24****</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The node specifications.</p>
         */
        @NameInMap("spec")
        public GetInstanceResponseBodyResultSpec spec;

        /**
         * <p>The status of the instance.</p>
         * <ul>
         * <li><p>INIT: The instance is being initialized.</p>
         * </li>
         * <li><p>WAIT_CONFIG: The instance is pending configuration.</p>
         * </li>
         * <li><p>CONFIG_UPDATING: The configuration is being applied.</p>
         * </li>
         * <li><p>READY: The instance is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetInstanceResponseBodyResultTags> tags;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>024-05-21 16:49:31.0</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <p>The engine version number.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3_3.10.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The number of zones.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("zoneCount")
        public Integer zoneCount;

        public static GetInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyResult self = new GetInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyResult setBsVersion(String bsVersion) {
            this.bsVersion = bsVersion;
            return this;
        }
        public String getBsVersion() {
            return this.bsVersion;
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

        public GetInstanceResponseBodyResult setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
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

        public GetInstanceResponseBodyResult setNetwork(GetInstanceResponseBodyResultNetwork network) {
            this.network = network;
            return this;
        }
        public GetInstanceResponseBodyResultNetwork getNetwork() {
            return this.network;
        }

        public GetInstanceResponseBodyResult setNewMode(Boolean newMode) {
            this.newMode = newMode;
            return this;
        }
        public Boolean getNewMode() {
            return this.newMode;
        }

        public GetInstanceResponseBodyResult setNoQrs(Boolean noQrs) {
            this.noQrs = noQrs;
            return this;
        }
        public Boolean getNoQrs() {
            return this.noQrs;
        }

        public GetInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyResult setSpec(GetInstanceResponseBodyResultSpec spec) {
            this.spec = spec;
            return this;
        }
        public GetInstanceResponseBodyResultSpec getSpec() {
            return this.spec;
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

        public GetInstanceResponseBodyResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetInstanceResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetInstanceResponseBodyResult setZoneCount(Integer zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Integer getZoneCount() {
            return this.zoneCount;
        }

    }

}
