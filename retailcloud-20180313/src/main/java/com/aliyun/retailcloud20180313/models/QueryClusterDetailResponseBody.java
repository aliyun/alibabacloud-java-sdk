// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class QueryClusterDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryClusterDetailResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailResponseBody self = new QueryClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryClusterDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public QueryClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterDetailResponseBody setResult(QueryClusterDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryClusterDetailResponseBodyResult getResult() {
        return this.result;
    }

    public QueryClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterDetailResponseBodyResultBasicInfo extends TeaModel {
        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("ClusterId")
        public Long clusterId;

        @NameInMap("ClusterInstanceId")
        public String clusterInstanceId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("EcsIds")
        public java.util.List<String> ecsIds;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("HasInstallArmsPilot")
        public Boolean hasInstallArmsPilot;

        @NameInMap("HasInstallLogController")
        public Boolean hasInstallLogController;

        @NameInMap("InstallArmsInProcess")
        public Boolean installArmsInProcess;

        @NameInMap("InstallLogInProcess")
        public Boolean installLogInProcess;

        @NameInMap("MainUserId")
        public String mainUserId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("UserNick")
        public String userNick;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Vswitchs")
        public java.util.List<String> vswitchs;

        public static QueryClusterDetailResponseBodyResultBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyResultBasicInfo self = new QueryClusterDetailResponseBodyResultBasicInfo();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setClusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Long getClusterId() {
            return this.clusterId;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setClusterInstanceId(String clusterInstanceId) {
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }
        public String getClusterInstanceId() {
            return this.clusterInstanceId;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setEcsIds(java.util.List<String> ecsIds) {
            this.ecsIds = ecsIds;
            return this;
        }
        public java.util.List<String> getEcsIds() {
            return this.ecsIds;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setHasInstallArmsPilot(Boolean hasInstallArmsPilot) {
            this.hasInstallArmsPilot = hasInstallArmsPilot;
            return this;
        }
        public Boolean getHasInstallArmsPilot() {
            return this.hasInstallArmsPilot;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setHasInstallLogController(Boolean hasInstallLogController) {
            this.hasInstallLogController = hasInstallLogController;
            return this;
        }
        public Boolean getHasInstallLogController() {
            return this.hasInstallLogController;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setInstallArmsInProcess(Boolean installArmsInProcess) {
            this.installArmsInProcess = installArmsInProcess;
            return this;
        }
        public Boolean getInstallArmsInProcess() {
            return this.installArmsInProcess;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setInstallLogInProcess(Boolean installLogInProcess) {
            this.installLogInProcess = installLogInProcess;
            return this;
        }
        public Boolean getInstallLogInProcess() {
            return this.installLogInProcess;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setMainUserId(String mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public String getMainUserId() {
            return this.mainUserId;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryClusterDetailResponseBodyResultBasicInfo setVswitchs(java.util.List<String> vswitchs) {
            this.vswitchs = vswitchs;
            return this;
        }
        public java.util.List<String> getVswitchs() {
            return this.vswitchs;
        }

    }

    public static class QueryClusterDetailResponseBodyResultInstanceInfo extends TeaModel {
        @NameInMap("AllocatePodCount")
        public Integer allocatePodCount;

        @NameInMap("AllocatedPodInfoList")
        public java.util.List<String> allocatedPodInfoList;

        @NameInMap("AppCount")
        public Integer appCount;

        @NameInMap("AvailablePodInfoList")
        public java.util.List<String> availablePodInfoList;

        public static QueryClusterDetailResponseBodyResultInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyResultInstanceInfo self = new QueryClusterDetailResponseBodyResultInstanceInfo();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyResultInstanceInfo setAllocatePodCount(Integer allocatePodCount) {
            this.allocatePodCount = allocatePodCount;
            return this;
        }
        public Integer getAllocatePodCount() {
            return this.allocatePodCount;
        }

        public QueryClusterDetailResponseBodyResultInstanceInfo setAllocatedPodInfoList(java.util.List<String> allocatedPodInfoList) {
            this.allocatedPodInfoList = allocatedPodInfoList;
            return this;
        }
        public java.util.List<String> getAllocatedPodInfoList() {
            return this.allocatedPodInfoList;
        }

        public QueryClusterDetailResponseBodyResultInstanceInfo setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public QueryClusterDetailResponseBodyResultInstanceInfo setAvailablePodInfoList(java.util.List<String> availablePodInfoList) {
            this.availablePodInfoList = availablePodInfoList;
            return this;
        }
        public java.util.List<String> getAvailablePodInfoList() {
            return this.availablePodInfoList;
        }

    }

    public static class QueryClusterDetailResponseBodyResultNetInfo extends TeaModel {
        @NameInMap("NetPlugType")
        public String netPlugType;

        @NameInMap("ProdCIDR")
        public String prodCIDR;

        @NameInMap("ServiceCIDR")
        public String serviceCIDR;

        public static QueryClusterDetailResponseBodyResultNetInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyResultNetInfo self = new QueryClusterDetailResponseBodyResultNetInfo();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyResultNetInfo setNetPlugType(String netPlugType) {
            this.netPlugType = netPlugType;
            return this;
        }
        public String getNetPlugType() {
            return this.netPlugType;
        }

        public QueryClusterDetailResponseBodyResultNetInfo setProdCIDR(String prodCIDR) {
            this.prodCIDR = prodCIDR;
            return this;
        }
        public String getProdCIDR() {
            return this.prodCIDR;
        }

        public QueryClusterDetailResponseBodyResultNetInfo setServiceCIDR(String serviceCIDR) {
            this.serviceCIDR = serviceCIDR;
            return this;
        }
        public String getServiceCIDR() {
            return this.serviceCIDR;
        }

    }

    public static class QueryClusterDetailResponseBodyResultWorkLoad extends TeaModel {
        @NameInMap("AllNodeCount")
        public Integer allNodeCount;

        @NameInMap("AllocateAllPodCount")
        public Integer allocateAllPodCount;

        @NameInMap("AllocateAppPodCount")
        public Integer allocateAppPodCount;

        @NameInMap("CpuCapacityTotal")
        public String cpuCapacityTotal;

        @NameInMap("CpuLevel")
        public String cpuLevel;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("CpuRequestPercent")
        public String cpuRequestPercent;

        @NameInMap("CpuTotal")
        public String cpuTotal;

        @NameInMap("CpuUse")
        public String cpuUse;

        @NameInMap("CpuUsePercent")
        public String cpuUsePercent;

        @NameInMap("MemCapacityTotal")
        public String memCapacityTotal;

        @NameInMap("MemLevel")
        public String memLevel;

        @NameInMap("MemRequest")
        public String memRequest;

        @NameInMap("MemRequestPercent")
        public String memRequestPercent;

        @NameInMap("MemTotal")
        public String memTotal;

        @NameInMap("MemUse")
        public String memUse;

        @NameInMap("MemUsePercent")
        public String memUsePercent;

        public static QueryClusterDetailResponseBodyResultWorkLoad build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyResultWorkLoad self = new QueryClusterDetailResponseBodyResultWorkLoad();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setAllNodeCount(Integer allNodeCount) {
            this.allNodeCount = allNodeCount;
            return this;
        }
        public Integer getAllNodeCount() {
            return this.allNodeCount;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setAllocateAllPodCount(Integer allocateAllPodCount) {
            this.allocateAllPodCount = allocateAllPodCount;
            return this;
        }
        public Integer getAllocateAllPodCount() {
            return this.allocateAllPodCount;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setAllocateAppPodCount(Integer allocateAppPodCount) {
            this.allocateAppPodCount = allocateAppPodCount;
            return this;
        }
        public Integer getAllocateAppPodCount() {
            return this.allocateAppPodCount;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuCapacityTotal(String cpuCapacityTotal) {
            this.cpuCapacityTotal = cpuCapacityTotal;
            return this;
        }
        public String getCpuCapacityTotal() {
            return this.cpuCapacityTotal;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuLevel(String cpuLevel) {
            this.cpuLevel = cpuLevel;
            return this;
        }
        public String getCpuLevel() {
            return this.cpuLevel;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuRequestPercent(String cpuRequestPercent) {
            this.cpuRequestPercent = cpuRequestPercent;
            return this;
        }
        public String getCpuRequestPercent() {
            return this.cpuRequestPercent;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuTotal(String cpuTotal) {
            this.cpuTotal = cpuTotal;
            return this;
        }
        public String getCpuTotal() {
            return this.cpuTotal;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuUse(String cpuUse) {
            this.cpuUse = cpuUse;
            return this;
        }
        public String getCpuUse() {
            return this.cpuUse;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setCpuUsePercent(String cpuUsePercent) {
            this.cpuUsePercent = cpuUsePercent;
            return this;
        }
        public String getCpuUsePercent() {
            return this.cpuUsePercent;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemCapacityTotal(String memCapacityTotal) {
            this.memCapacityTotal = memCapacityTotal;
            return this;
        }
        public String getMemCapacityTotal() {
            return this.memCapacityTotal;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemLevel(String memLevel) {
            this.memLevel = memLevel;
            return this;
        }
        public String getMemLevel() {
            return this.memLevel;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemRequest(String memRequest) {
            this.memRequest = memRequest;
            return this;
        }
        public String getMemRequest() {
            return this.memRequest;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemRequestPercent(String memRequestPercent) {
            this.memRequestPercent = memRequestPercent;
            return this;
        }
        public String getMemRequestPercent() {
            return this.memRequestPercent;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemTotal(String memTotal) {
            this.memTotal = memTotal;
            return this;
        }
        public String getMemTotal() {
            return this.memTotal;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemUse(String memUse) {
            this.memUse = memUse;
            return this;
        }
        public String getMemUse() {
            return this.memUse;
        }

        public QueryClusterDetailResponseBodyResultWorkLoad setMemUsePercent(String memUsePercent) {
            this.memUsePercent = memUsePercent;
            return this;
        }
        public String getMemUsePercent() {
            return this.memUsePercent;
        }

    }

    public static class QueryClusterDetailResponseBodyResult extends TeaModel {
        @NameInMap("BasicInfo")
        public QueryClusterDetailResponseBodyResultBasicInfo basicInfo;

        @NameInMap("InstanceInfo")
        public QueryClusterDetailResponseBodyResultInstanceInfo instanceInfo;

        @NameInMap("NetInfo")
        public QueryClusterDetailResponseBodyResultNetInfo netInfo;

        @NameInMap("NodeWorkLoadList")
        public java.util.List<String> nodeWorkLoadList;

        @NameInMap("WorkLoad")
        public QueryClusterDetailResponseBodyResultWorkLoad workLoad;

        public static QueryClusterDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterDetailResponseBodyResult self = new QueryClusterDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryClusterDetailResponseBodyResult setBasicInfo(QueryClusterDetailResponseBodyResultBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public QueryClusterDetailResponseBodyResultBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public QueryClusterDetailResponseBodyResult setInstanceInfo(QueryClusterDetailResponseBodyResultInstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public QueryClusterDetailResponseBodyResultInstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        public QueryClusterDetailResponseBodyResult setNetInfo(QueryClusterDetailResponseBodyResultNetInfo netInfo) {
            this.netInfo = netInfo;
            return this;
        }
        public QueryClusterDetailResponseBodyResultNetInfo getNetInfo() {
            return this.netInfo;
        }

        public QueryClusterDetailResponseBodyResult setNodeWorkLoadList(java.util.List<String> nodeWorkLoadList) {
            this.nodeWorkLoadList = nodeWorkLoadList;
            return this;
        }
        public java.util.List<String> getNodeWorkLoadList() {
            return this.nodeWorkLoadList;
        }

        public QueryClusterDetailResponseBodyResult setWorkLoad(QueryClusterDetailResponseBodyResultWorkLoad workLoad) {
            this.workLoad = workLoad;
            return this;
        }
        public QueryClusterDetailResponseBodyResultWorkLoad getWorkLoad() {
            return this.workLoad;
        }

    }

}
