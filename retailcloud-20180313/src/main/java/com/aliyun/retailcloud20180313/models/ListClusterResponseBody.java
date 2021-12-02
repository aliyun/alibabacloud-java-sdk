// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListClusterResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterResponseBody self = new ListClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterResponseBody setData(java.util.List<ListClusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListClusterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListClusterResponseBodyData extends TeaModel {
        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("ClusterTitle")
        public String clusterTitle;

        @NameInMap("CreateStatus")
        public String createStatus;

        @NameInMap("EcsIds")
        public java.util.List<String> ecsIds;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KeyPair")
        public String keyPair;

        @NameInMap("NetPlug")
        public String netPlug;

        @NameInMap("Password")
        public String password;

        @NameInMap("PodCIDR")
        public String podCIDR;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("ServiceCIDR")
        public String serviceCIDR;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        @NameInMap("WorkLoadCpu")
        public String workLoadCpu;

        @NameInMap("WorkLoadMem")
        public String workLoadMem;

        public static ListClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyData self = new ListClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyData setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public ListClusterResponseBodyData setClusterTitle(String clusterTitle) {
            this.clusterTitle = clusterTitle;
            return this;
        }
        public String getClusterTitle() {
            return this.clusterTitle;
        }

        public ListClusterResponseBodyData setCreateStatus(String createStatus) {
            this.createStatus = createStatus;
            return this;
        }
        public String getCreateStatus() {
            return this.createStatus;
        }

        public ListClusterResponseBodyData setEcsIds(java.util.List<String> ecsIds) {
            this.ecsIds = ecsIds;
            return this;
        }
        public java.util.List<String> getEcsIds() {
            return this.ecsIds;
        }

        public ListClusterResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListClusterResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClusterResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListClusterResponseBodyData setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ListClusterResponseBodyData setNetPlug(String netPlug) {
            this.netPlug = netPlug;
            return this;
        }
        public String getNetPlug() {
            return this.netPlug;
        }

        public ListClusterResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListClusterResponseBodyData setPodCIDR(String podCIDR) {
            this.podCIDR = podCIDR;
            return this;
        }
        public String getPodCIDR() {
            return this.podCIDR;
        }

        public ListClusterResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClusterResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListClusterResponseBodyData setServiceCIDR(String serviceCIDR) {
            this.serviceCIDR = serviceCIDR;
            return this;
        }
        public String getServiceCIDR() {
            return this.serviceCIDR;
        }

        public ListClusterResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClusterResponseBodyData setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public ListClusterResponseBodyData setWorkLoadCpu(String workLoadCpu) {
            this.workLoadCpu = workLoadCpu;
            return this;
        }
        public String getWorkLoadCpu() {
            return this.workLoadCpu;
        }

        public ListClusterResponseBodyData setWorkLoadMem(String workLoadMem) {
            this.workLoadMem = workLoadMem;
            return this;
        }
        public String getWorkLoadMem() {
            return this.workLoadMem;
        }

    }

}
