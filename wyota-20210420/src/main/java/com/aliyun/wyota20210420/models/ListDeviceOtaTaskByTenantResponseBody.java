// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceOtaTaskByTenantResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDeviceOtaTaskByTenantResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeviceOtaTaskByTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceOtaTaskByTenantResponseBody self = new ListDeviceOtaTaskByTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceOtaTaskByTenantResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceOtaTaskByTenantResponseBody setData(ListDeviceOtaTaskByTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceOtaTaskByTenantResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceOtaTaskByTenantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceOtaTaskByTenantResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeviceOtaTaskByTenantResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeviceOtaTaskByTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceOtaTaskByTenantResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("OperationStatus")
        public Integer operationStatus;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("UpgradeCount")
        public Long upgradeCount;

        @NameInMap("Version")
        public String version;

        public static ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks self = new ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks();
            return TeaModel.build(map, self);
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setOperationStatus(Integer operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public Integer getOperationStatus() {
            return this.operationStatus;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setUpgradeCount(Long upgradeCount) {
            this.upgradeCount = upgradeCount;
            return this;
        }
        public Long getUpgradeCount() {
            return this.upgradeCount;
        }

        public ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListDeviceOtaTaskByTenantResponseBodyData extends TeaModel {
        @NameInMap("TenantDeviceOtaTasks")
        public java.util.List<ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks> tenantDeviceOtaTasks;

        public static ListDeviceOtaTaskByTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceOtaTaskByTenantResponseBodyData self = new ListDeviceOtaTaskByTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceOtaTaskByTenantResponseBodyData setTenantDeviceOtaTasks(java.util.List<ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks> tenantDeviceOtaTasks) {
            this.tenantDeviceOtaTasks = tenantDeviceOtaTasks;
            return this;
        }
        public java.util.List<ListDeviceOtaTaskByTenantResponseBodyDataTenantDeviceOtaTasks> getTenantDeviceOtaTasks() {
            return this.tenantDeviceOtaTasks;
        }

    }

}
