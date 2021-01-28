// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeUserClusterHostResponseBody extends TeaModel {
    @NameInMap("MaxRecordsPerPage")
    public String maxRecordsPerPage;

    @NameInMap("HostItems")
    public java.util.List<DescribeUserClusterHostResponseBodyHostItems> hostItems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    @NameInMap("ItemNumbers")
    public Integer itemNumbers;

    public static DescribeUserClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserClusterHostResponseBody self = new DescribeUserClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserClusterHostResponseBody setMaxRecordsPerPage(String maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public String getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeUserClusterHostResponseBody setHostItems(java.util.List<DescribeUserClusterHostResponseBodyHostItems> hostItems) {
        this.hostItems = hostItems;
        return this;
    }
    public java.util.List<DescribeUserClusterHostResponseBodyHostItems> getHostItems() {
        return this.hostItems;
    }

    public DescribeUserClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserClusterHostResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserClusterHostResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeUserClusterHostResponseBody setItemNumbers(Integer itemNumbers) {
        this.itemNumbers = itemNumbers;
        return this;
    }
    public Integer getItemNumbers() {
        return this.itemNumbers;
    }

    public static class DescribeUserClusterHostResponseBodyHostItems extends TeaModel {
        @NameInMap("HostIP")
        public String hostIP;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("HostStatus")
        public String hostStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostStorage")
        public String hostStorage;

        @NameInMap("InstanceNumber")
        public String instanceNumber;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostClass")
        public String hostClass;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("HostCpu")
        public String hostCpu;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("HostMem")
        public String hostMem;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeUserClusterHostResponseBodyHostItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserClusterHostResponseBodyHostItems self = new DescribeUserClusterHostResponseBodyHostItems();
            return TeaModel.build(map, self);
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostIP(String hostIP) {
            this.hostIP = hostIP;
            return this;
        }
        public String getHostIP() {
            return this.hostIP;
        }

        public DescribeUserClusterHostResponseBodyHostItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeUserClusterHostResponseBodyHostItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeUserClusterHostResponseBodyHostItems setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostStorage(String hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }
        public String getHostStorage() {
            return this.hostStorage;
        }

        public DescribeUserClusterHostResponseBodyHostItems setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public String getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostClass(String hostClass) {
            this.hostClass = hostClass;
            return this;
        }
        public String getHostClass() {
            return this.hostClass;
        }

        public DescribeUserClusterHostResponseBodyHostItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeUserClusterHostResponseBodyHostItems setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeUserClusterHostResponseBodyHostItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostCpu(String hostCpu) {
            this.hostCpu = hostCpu;
            return this;
        }
        public String getHostCpu() {
            return this.hostCpu;
        }

        public DescribeUserClusterHostResponseBodyHostItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeUserClusterHostResponseBodyHostItems setHostMem(String hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public String getHostMem() {
            return this.hostMem;
        }

        public DescribeUserClusterHostResponseBodyHostItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeUserClusterHostResponseBodyHostItems setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
