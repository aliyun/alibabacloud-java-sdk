// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListComponentInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesResponseBody self = new ListComponentInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComponentInstancesResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListComponentInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListComponentInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        @NameInMap("applicationName")
        public String applicationName;

        @NameInMap("bizState")
        public String bizState;

        @NameInMap("commissionState")
        public String commissionState;

        @NameInMap("componentInstanceStatus")
        public String componentInstanceStatus;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("description")
        public String description;

        @NameInMap("desiredState")
        public String desiredState;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("maintenanceState")
        public String maintenanceState;

        @NameInMap("nodeId")
        public String nodeId;

        @NameInMap("nodeName")
        public String nodeName;

        @NameInMap("replica")
        public Integer replica;

        @NameInMap("statusReportTime")
        public Long statusReportTime;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Items setBizState(String bizState) {
            this.bizState = bizState;
            return this;
        }
        public String getBizState() {
            return this.bizState;
        }

        public Items setCommissionState(String commissionState) {
            this.commissionState = commissionState;
            return this;
        }
        public String getCommissionState() {
            return this.commissionState;
        }

        public Items setComponentInstanceStatus(String componentInstanceStatus) {
            this.componentInstanceStatus = componentInstanceStatus;
            return this;
        }
        public String getComponentInstanceStatus() {
            return this.componentInstanceStatus;
        }

        public Items setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Items setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Items setDesiredState(String desiredState) {
            this.desiredState = desiredState;
            return this;
        }
        public String getDesiredState() {
            return this.desiredState;
        }

        public Items setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public Items setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public Items setMaintenanceState(String maintenanceState) {
            this.maintenanceState = maintenanceState;
            return this;
        }
        public String getMaintenanceState() {
            return this.maintenanceState;
        }

        public Items setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public Items setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public Items setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public Items setStatusReportTime(Long statusReportTime) {
            this.statusReportTime = statusReportTime;
            return this;
        }
        public Long getStatusReportTime() {
            return this.statusReportTime;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
