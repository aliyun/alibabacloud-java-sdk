// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeUserClusterHostInstanceResponseBody extends TeaModel {
    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("InstancesItems")
    public DescribeUserClusterHostInstanceResponseBodyInstancesItems instancesItems;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    @NameInMap("ItemNumbers")
    public Integer itemNumbers;

    public static DescribeUserClusterHostInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserClusterHostInstanceResponseBody self = new DescribeUserClusterHostInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserClusterHostInstanceResponseBody setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeUserClusterHostInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserClusterHostInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserClusterHostInstanceResponseBody setInstancesItems(DescribeUserClusterHostInstanceResponseBodyInstancesItems instancesItems) {
        this.instancesItems = instancesItems;
        return this;
    }
    public DescribeUserClusterHostInstanceResponseBodyInstancesItems getInstancesItems() {
        return this.instancesItems;
    }

    public DescribeUserClusterHostInstanceResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeUserClusterHostInstanceResponseBody setItemNumbers(Integer itemNumbers) {
        this.itemNumbers = itemNumbers;
        return this;
    }
    public Integer getItemNumbers() {
        return this.itemNumbers;
    }

    public static class DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo extends TeaModel {
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo self = new DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeUserClusterHostInstanceResponseBodyInstancesItems extends TeaModel {
        @NameInMap("InstanceInfo")
        public java.util.List<DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo> instanceInfo;

        public static DescribeUserClusterHostInstanceResponseBodyInstancesItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserClusterHostInstanceResponseBodyInstancesItems self = new DescribeUserClusterHostInstanceResponseBodyInstancesItems();
            return TeaModel.build(map, self);
        }

        public DescribeUserClusterHostInstanceResponseBodyInstancesItems setInstanceInfo(java.util.List<DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public java.util.List<DescribeUserClusterHostInstanceResponseBodyInstancesItemsInstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

    }

}
