// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D0DE9C33-992A-580B-89C4-B609A292748D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetClusterResponseBody setData(GetClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterResponseBodyData getData() {
        return this.data;
    }

    public GetClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetClusterResponseBodyDataVSwitches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-8vbf1n216nshvfjdyff8a</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetClusterResponseBodyDataVSwitches build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyDataVSwitches self = new GetClusterResponseBodyDataVSwitches();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyDataVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetClusterResponseBodyDataVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>xxljob-e0d018c6df8</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>xxl-job-test-1730427575152</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>scx.small.x2</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InternetDomain")
        public String internetDomain;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxljob-xxxxxx.schedulerx.mse.aliyuncs.com">http://xxljob-xxxxxx.schedulerx.mse.aliyuncs.com</a></p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("JobNum")
        public Integer jobNum;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;vSwitchIdList&quot;: [
         *     &quot;xxx&quot;,
         *     &quot;xxx&quot;
         *   ],
         *   &quot;cpu&quot;: xxx,
         *   &quot;cpuUnit&quot;: &quot;xxx&quot;,
         *   &quot;diskCapacity&quot;: xxx,
         *   &quot;memoryCapacity&quot;: xxx,
         *   &quot;zoneIds&quot;: [
         *     &quot;xxx&quot;,
         *     &quot;xxx&quot;
         *   ],
         *   &quot;securityGroupList&quot;: [
         *     &quot;xxx&quot;
         *   ],
         *   &quot;eniCrossZone&quot;: &quot;xxx&quot;,
         *   &quot;regionId&quot;: &quot;xxx&quot;,
         *   &quot;instanceCount&quot;: xxx,
         *   &quot;vpcId&quot;: &quot;xxx&quot;,
         *   &quot;memoryUnit&quot;: &quot;xxx&quot;,
         *   &quot;diskType&quot;: &quot;xxx&quot;,
         *   &quot;appClusterId&quot;: &quot;xxx&quot;
         * }</p>
         */
        @NameInMap("KubeConfig")
        public String kubeConfig;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobNum")
        public Integer maxJobNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxWorkflowNum")
        public Integer maxWorkflowNum;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProductType")
        public Integer productType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Spm")
        public Integer spm;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("VSwitches")
        public java.util.List<GetClusterResponseBodyDataVSwitches> vSwitches;

        @NameInMap("VersionLifecycle")
        public String versionLifecycle;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fiz967u39lt8yuxcs0</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WorkflowNum")
        public Integer workflowNum;

        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static GetClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyData self = new GetClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetClusterResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetClusterResponseBodyData setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public GetClusterResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetClusterResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetClusterResponseBodyData setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetClusterResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetClusterResponseBodyData setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public GetClusterResponseBodyData setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public GetClusterResponseBodyData setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public GetClusterResponseBodyData setJobNum(Integer jobNum) {
            this.jobNum = jobNum;
            return this;
        }
        public Integer getJobNum() {
            return this.jobNum;
        }

        public GetClusterResponseBodyData setKubeConfig(String kubeConfig) {
            this.kubeConfig = kubeConfig;
            return this;
        }
        public String getKubeConfig() {
            return this.kubeConfig;
        }

        public GetClusterResponseBodyData setMaxJobNum(Integer maxJobNum) {
            this.maxJobNum = maxJobNum;
            return this;
        }
        public Integer getMaxJobNum() {
            return this.maxJobNum;
        }

        public GetClusterResponseBodyData setMaxWorkflowNum(Integer maxWorkflowNum) {
            this.maxWorkflowNum = maxWorkflowNum;
            return this;
        }
        public Integer getMaxWorkflowNum() {
            return this.maxWorkflowNum;
        }

        public GetClusterResponseBodyData setProductType(Integer productType) {
            this.productType = productType;
            return this;
        }
        public Integer getProductType() {
            return this.productType;
        }

        public GetClusterResponseBodyData setSpm(Integer spm) {
            this.spm = spm;
            return this;
        }
        public Integer getSpm() {
            return this.spm;
        }

        public GetClusterResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetClusterResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetClusterResponseBodyData setVSwitches(java.util.List<GetClusterResponseBodyDataVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<GetClusterResponseBodyDataVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public GetClusterResponseBodyData setVersionLifecycle(String versionLifecycle) {
            this.versionLifecycle = versionLifecycle;
            return this;
        }
        public String getVersionLifecycle() {
            return this.versionLifecycle;
        }

        public GetClusterResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetClusterResponseBodyData setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

        public GetClusterResponseBodyData setWorkflowNum(Integer workflowNum) {
            this.workflowNum = workflowNum;
            return this;
        }
        public Integer getWorkflowNum() {
            return this.workflowNum;
        }

        public GetClusterResponseBodyData setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
