// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMigrationWorkerInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMigrationWorkerInstancesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeMigrationWorkerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationWorkerInstancesResponseBody self = new DescribeMigrationWorkerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationWorkerInstancesResponseBody setData(java.util.List<DescribeMigrationWorkerInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMigrationWorkerInstancesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMigrationWorkerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationWorkerInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMigrationWorkerInstancesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaintenanceWindow")
        public String maintenanceWindow;

        @NameInMap("ProjectCount")
        public Integer projectCount;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TopicCount")
        public Integer topicCount;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeMigrationWorkerInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationWorkerInstancesResponseBodyData self = new DescribeMigrationWorkerInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setMaintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public String getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setProjectCount(Integer projectCount) {
            this.projectCount = projectCount;
            return this;
        }
        public Integer getProjectCount() {
            return this.projectCount;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Integer getTopicCount() {
            return this.topicCount;
        }

        public DescribeMigrationWorkerInstancesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
