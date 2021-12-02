// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeClusterDetailResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeClusterDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterDetailResponseBody setResult(DescribeClusterDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeClusterDetailResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeClusterDetailResponseBodyResultBasicInfo extends TeaModel {
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

        public static DescribeClusterDetailResponseBodyResultBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultBasicInfo self = new DescribeClusterDetailResponseBodyResultBasicInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setClusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Long getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setClusterInstanceId(String clusterInstanceId) {
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }
        public String getClusterInstanceId() {
            return this.clusterInstanceId;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setEcsIds(java.util.List<String> ecsIds) {
            this.ecsIds = ecsIds;
            return this;
        }
        public java.util.List<String> getEcsIds() {
            return this.ecsIds;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setHasInstallArmsPilot(Boolean hasInstallArmsPilot) {
            this.hasInstallArmsPilot = hasInstallArmsPilot;
            return this;
        }
        public Boolean getHasInstallArmsPilot() {
            return this.hasInstallArmsPilot;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setHasInstallLogController(Boolean hasInstallLogController) {
            this.hasInstallLogController = hasInstallLogController;
            return this;
        }
        public Boolean getHasInstallLogController() {
            return this.hasInstallLogController;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setInstallArmsInProcess(Boolean installArmsInProcess) {
            this.installArmsInProcess = installArmsInProcess;
            return this;
        }
        public Boolean getInstallArmsInProcess() {
            return this.installArmsInProcess;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setInstallLogInProcess(Boolean installLogInProcess) {
            this.installLogInProcess = installLogInProcess;
            return this;
        }
        public Boolean getInstallLogInProcess() {
            return this.installLogInProcess;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setMainUserId(String mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public String getMainUserId() {
            return this.mainUserId;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterDetailResponseBodyResultBasicInfo setVswitchs(java.util.List<String> vswitchs) {
            this.vswitchs = vswitchs;
            return this;
        }
        public java.util.List<String> getVswitchs() {
            return this.vswitchs;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CupRequest")
        public String cupRequest;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("MemRequest")
        public String memRequest;

        @NameInMap("PodCount")
        public Integer podCount;

        public static DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList self = new DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setCupRequest(String cupRequest) {
            this.cupRequest = cupRequest;
            return this;
        }
        public String getCupRequest() {
            return this.cupRequest;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setMemRequest(String memRequest) {
            this.memRequest = memRequest;
            return this;
        }
        public String getMemRequest() {
            return this.memRequest;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList extends TeaModel {
        @NameInMap("AvailablePodCount")
        public Integer availablePodCount;

        @NameInMap("CupRequest")
        public String cupRequest;

        @NameInMap("MemRequest")
        public String memRequest;

        public static DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList self = new DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList setAvailablePodCount(Integer availablePodCount) {
            this.availablePodCount = availablePodCount;
            return this;
        }
        public Integer getAvailablePodCount() {
            return this.availablePodCount;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList setCupRequest(String cupRequest) {
            this.cupRequest = cupRequest;
            return this;
        }
        public String getCupRequest() {
            return this.cupRequest;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList setMemRequest(String memRequest) {
            this.memRequest = memRequest;
            return this;
        }
        public String getMemRequest() {
            return this.memRequest;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultInstanceInfo extends TeaModel {
        @NameInMap("AllocatePodCount")
        public Integer allocatePodCount;

        @NameInMap("AllocatedPodInfoList")
        public java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList> allocatedPodInfoList;

        @NameInMap("AppCount")
        public Integer appCount;

        @NameInMap("AvailablePodInfoList")
        public java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList> availablePodInfoList;

        public static DescribeClusterDetailResponseBodyResultInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultInstanceInfo self = new DescribeClusterDetailResponseBodyResultInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfo setAllocatePodCount(Integer allocatePodCount) {
            this.allocatePodCount = allocatePodCount;
            return this;
        }
        public Integer getAllocatePodCount() {
            return this.allocatePodCount;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfo setAllocatedPodInfoList(java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList> allocatedPodInfoList) {
            this.allocatedPodInfoList = allocatedPodInfoList;
            return this;
        }
        public java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAllocatedPodInfoList> getAllocatedPodInfoList() {
            return this.allocatedPodInfoList;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfo setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public DescribeClusterDetailResponseBodyResultInstanceInfo setAvailablePodInfoList(java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList> availablePodInfoList) {
            this.availablePodInfoList = availablePodInfoList;
            return this;
        }
        public java.util.List<DescribeClusterDetailResponseBodyResultInstanceInfoAvailablePodInfoList> getAvailablePodInfoList() {
            return this.availablePodInfoList;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultNetInfo extends TeaModel {
        @NameInMap("NetPlugType")
        public String netPlugType;

        @NameInMap("ProdCIDR")
        public String prodCIDR;

        @NameInMap("ServiceCIDR")
        public String serviceCIDR;

        public static DescribeClusterDetailResponseBodyResultNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultNetInfo self = new DescribeClusterDetailResponseBodyResultNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultNetInfo setNetPlugType(String netPlugType) {
            this.netPlugType = netPlugType;
            return this;
        }
        public String getNetPlugType() {
            return this.netPlugType;
        }

        public DescribeClusterDetailResponseBodyResultNetInfo setProdCIDR(String prodCIDR) {
            this.prodCIDR = prodCIDR;
            return this;
        }
        public String getProdCIDR() {
            return this.prodCIDR;
        }

        public DescribeClusterDetailResponseBodyResultNetInfo setServiceCIDR(String serviceCIDR) {
            this.serviceCIDR = serviceCIDR;
            return this;
        }
        public String getServiceCIDR() {
            return this.serviceCIDR;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultNodeWorkLoadList extends TeaModel {
        @NameInMap("AppPodCount")
        public Integer appPodCount;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("CpuTotal")
        public String cpuTotal;

        @NameInMap("CpuUse")
        public String cpuUse;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MemRequest")
        public String memRequest;

        @NameInMap("MemTotal")
        public String memTotal;

        @NameInMap("MemUse")
        public String memUse;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("PodCount")
        public Integer podCount;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("Unschedulable")
        public Boolean unschedulable;

        public static DescribeClusterDetailResponseBodyResultNodeWorkLoadList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultNodeWorkLoadList self = new DescribeClusterDetailResponseBodyResultNodeWorkLoadList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setAppPodCount(Integer appPodCount) {
            this.appPodCount = appPodCount;
            return this;
        }
        public Integer getAppPodCount() {
            return this.appPodCount;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setCpuTotal(String cpuTotal) {
            this.cpuTotal = cpuTotal;
            return this;
        }
        public String getCpuTotal() {
            return this.cpuTotal;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setCpuUse(String cpuUse) {
            this.cpuUse = cpuUse;
            return this;
        }
        public String getCpuUse() {
            return this.cpuUse;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setMemRequest(String memRequest) {
            this.memRequest = memRequest;
            return this;
        }
        public String getMemRequest() {
            return this.memRequest;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setMemTotal(String memTotal) {
            this.memTotal = memTotal;
            return this;
        }
        public String getMemTotal() {
            return this.memTotal;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setMemUse(String memUse) {
            this.memUse = memUse;
            return this;
        }
        public String getMemUse() {
            return this.memUse;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeClusterDetailResponseBodyResultNodeWorkLoadList setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

    }

    public static class DescribeClusterDetailResponseBodyResultWorkLoad extends TeaModel {
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

        public static DescribeClusterDetailResponseBodyResultWorkLoad build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResultWorkLoad self = new DescribeClusterDetailResponseBodyResultWorkLoad();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setAllNodeCount(Integer allNodeCount) {
            this.allNodeCount = allNodeCount;
            return this;
        }
        public Integer getAllNodeCount() {
            return this.allNodeCount;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setAllocateAllPodCount(Integer allocateAllPodCount) {
            this.allocateAllPodCount = allocateAllPodCount;
            return this;
        }
        public Integer getAllocateAllPodCount() {
            return this.allocateAllPodCount;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setAllocateAppPodCount(Integer allocateAppPodCount) {
            this.allocateAppPodCount = allocateAppPodCount;
            return this;
        }
        public Integer getAllocateAppPodCount() {
            return this.allocateAppPodCount;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuCapacityTotal(String cpuCapacityTotal) {
            this.cpuCapacityTotal = cpuCapacityTotal;
            return this;
        }
        public String getCpuCapacityTotal() {
            return this.cpuCapacityTotal;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuLevel(String cpuLevel) {
            this.cpuLevel = cpuLevel;
            return this;
        }
        public String getCpuLevel() {
            return this.cpuLevel;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuRequestPercent(String cpuRequestPercent) {
            this.cpuRequestPercent = cpuRequestPercent;
            return this;
        }
        public String getCpuRequestPercent() {
            return this.cpuRequestPercent;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuTotal(String cpuTotal) {
            this.cpuTotal = cpuTotal;
            return this;
        }
        public String getCpuTotal() {
            return this.cpuTotal;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuUse(String cpuUse) {
            this.cpuUse = cpuUse;
            return this;
        }
        public String getCpuUse() {
            return this.cpuUse;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setCpuUsePercent(String cpuUsePercent) {
            this.cpuUsePercent = cpuUsePercent;
            return this;
        }
        public String getCpuUsePercent() {
            return this.cpuUsePercent;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemCapacityTotal(String memCapacityTotal) {
            this.memCapacityTotal = memCapacityTotal;
            return this;
        }
        public String getMemCapacityTotal() {
            return this.memCapacityTotal;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemLevel(String memLevel) {
            this.memLevel = memLevel;
            return this;
        }
        public String getMemLevel() {
            return this.memLevel;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemRequest(String memRequest) {
            this.memRequest = memRequest;
            return this;
        }
        public String getMemRequest() {
            return this.memRequest;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemRequestPercent(String memRequestPercent) {
            this.memRequestPercent = memRequestPercent;
            return this;
        }
        public String getMemRequestPercent() {
            return this.memRequestPercent;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemTotal(String memTotal) {
            this.memTotal = memTotal;
            return this;
        }
        public String getMemTotal() {
            return this.memTotal;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemUse(String memUse) {
            this.memUse = memUse;
            return this;
        }
        public String getMemUse() {
            return this.memUse;
        }

        public DescribeClusterDetailResponseBodyResultWorkLoad setMemUsePercent(String memUsePercent) {
            this.memUsePercent = memUsePercent;
            return this;
        }
        public String getMemUsePercent() {
            return this.memUsePercent;
        }

    }

    public static class DescribeClusterDetailResponseBodyResult extends TeaModel {
        @NameInMap("BasicInfo")
        public DescribeClusterDetailResponseBodyResultBasicInfo basicInfo;

        @NameInMap("InstanceInfo")
        public DescribeClusterDetailResponseBodyResultInstanceInfo instanceInfo;

        @NameInMap("NetInfo")
        public DescribeClusterDetailResponseBodyResultNetInfo netInfo;

        @NameInMap("NodeWorkLoadList")
        public java.util.List<DescribeClusterDetailResponseBodyResultNodeWorkLoadList> nodeWorkLoadList;

        @NameInMap("WorkLoad")
        public DescribeClusterDetailResponseBodyResultWorkLoad workLoad;

        public static DescribeClusterDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyResult self = new DescribeClusterDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyResult setBasicInfo(DescribeClusterDetailResponseBodyResultBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public DescribeClusterDetailResponseBodyResultBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public DescribeClusterDetailResponseBodyResult setInstanceInfo(DescribeClusterDetailResponseBodyResultInstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public DescribeClusterDetailResponseBodyResultInstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        public DescribeClusterDetailResponseBodyResult setNetInfo(DescribeClusterDetailResponseBodyResultNetInfo netInfo) {
            this.netInfo = netInfo;
            return this;
        }
        public DescribeClusterDetailResponseBodyResultNetInfo getNetInfo() {
            return this.netInfo;
        }

        public DescribeClusterDetailResponseBodyResult setNodeWorkLoadList(java.util.List<DescribeClusterDetailResponseBodyResultNodeWorkLoadList> nodeWorkLoadList) {
            this.nodeWorkLoadList = nodeWorkLoadList;
            return this;
        }
        public java.util.List<DescribeClusterDetailResponseBodyResultNodeWorkLoadList> getNodeWorkLoadList() {
            return this.nodeWorkLoadList;
        }

        public DescribeClusterDetailResponseBodyResult setWorkLoad(DescribeClusterDetailResponseBodyResultWorkLoad workLoad) {
            this.workLoad = workLoad;
            return this;
        }
        public DescribeClusterDetailResponseBodyResultWorkLoad getWorkLoad() {
            return this.workLoad;
        }

    }

}
