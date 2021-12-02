// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAvailableClusterNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAvailableClusterNodeResponseBodyData> data;

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

    public static ListAvailableClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableClusterNodeResponseBody self = new ListAvailableClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableClusterNodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAvailableClusterNodeResponseBody setData(java.util.List<ListAvailableClusterNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableClusterNodeResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableClusterNodeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListAvailableClusterNodeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableClusterNodeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAvailableClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableClusterNodeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAvailableClusterNodeResponseBodyData extends TeaModel {
        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("EcsConfiguration")
        public String ecsConfiguration;

        @NameInMap("EcsCpu")
        public String ecsCpu;

        @NameInMap("EcsEip")
        public String ecsEip;

        @NameInMap("EcsExpiredTime")
        public String ecsExpiredTime;

        @NameInMap("EcsLocalStorageCapacity")
        public String ecsLocalStorageCapacity;

        @NameInMap("EcsMemory")
        public String ecsMemory;

        @NameInMap("EcsOsType")
        public String ecsOsType;

        @NameInMap("EcsPrivateIp")
        public String ecsPrivateIp;

        @NameInMap("EcsPublicIp")
        public String ecsPublicIp;

        @NameInMap("EcsZone")
        public String ecsZone;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetMaxBandwidthIn")
        public String internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public String internetMaxBandwidthOut;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListAvailableClusterNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableClusterNodeResponseBodyData self = new ListAvailableClusterNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableClusterNodeResponseBodyData setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsConfiguration(String ecsConfiguration) {
            this.ecsConfiguration = ecsConfiguration;
            return this;
        }
        public String getEcsConfiguration() {
            return this.ecsConfiguration;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsCpu(String ecsCpu) {
            this.ecsCpu = ecsCpu;
            return this;
        }
        public String getEcsCpu() {
            return this.ecsCpu;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsEip(String ecsEip) {
            this.ecsEip = ecsEip;
            return this;
        }
        public String getEcsEip() {
            return this.ecsEip;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsExpiredTime(String ecsExpiredTime) {
            this.ecsExpiredTime = ecsExpiredTime;
            return this;
        }
        public String getEcsExpiredTime() {
            return this.ecsExpiredTime;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsLocalStorageCapacity(String ecsLocalStorageCapacity) {
            this.ecsLocalStorageCapacity = ecsLocalStorageCapacity;
            return this;
        }
        public String getEcsLocalStorageCapacity() {
            return this.ecsLocalStorageCapacity;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsMemory(String ecsMemory) {
            this.ecsMemory = ecsMemory;
            return this;
        }
        public String getEcsMemory() {
            return this.ecsMemory;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsOsType(String ecsOsType) {
            this.ecsOsType = ecsOsType;
            return this;
        }
        public String getEcsOsType() {
            return this.ecsOsType;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsPrivateIp(String ecsPrivateIp) {
            this.ecsPrivateIp = ecsPrivateIp;
            return this;
        }
        public String getEcsPrivateIp() {
            return this.ecsPrivateIp;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsPublicIp(String ecsPublicIp) {
            this.ecsPublicIp = ecsPublicIp;
            return this;
        }
        public String getEcsPublicIp() {
            return this.ecsPublicIp;
        }

        public ListAvailableClusterNodeResponseBodyData setEcsZone(String ecsZone) {
            this.ecsZone = ecsZone;
            return this;
        }
        public String getEcsZone() {
            return this.ecsZone;
        }

        public ListAvailableClusterNodeResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAvailableClusterNodeResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAvailableClusterNodeResponseBodyData setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public ListAvailableClusterNodeResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAvailableClusterNodeResponseBodyData setInternetMaxBandwidthIn(String internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public String getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public ListAvailableClusterNodeResponseBodyData setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public String getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public ListAvailableClusterNodeResponseBodyData setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListAvailableClusterNodeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAvailableClusterNodeResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
