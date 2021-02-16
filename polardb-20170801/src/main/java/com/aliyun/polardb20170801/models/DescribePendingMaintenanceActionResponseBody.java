// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public java.util.List<DescribePendingMaintenanceActionResponseBodyItems> items;

    public static DescribePendingMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionResponseBody self = new DescribePendingMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribePendingMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePendingMaintenanceActionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePendingMaintenanceActionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePendingMaintenanceActionResponseBody setItems(java.util.List<DescribePendingMaintenanceActionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePendingMaintenanceActionResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribePendingMaintenanceActionResponseBodyItems extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("PrepareInterval")
        public String prepareInterval;

        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResultInfo")
        public String resultInfo;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("SwitchTime")
        public String switchTime;

        public static DescribePendingMaintenanceActionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePendingMaintenanceActionResponseBodyItems self = new DescribePendingMaintenanceActionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePendingMaintenanceActionResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribePendingMaintenanceActionResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

    }

}
