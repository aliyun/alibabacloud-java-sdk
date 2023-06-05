// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyDataItemsAlgorithms extends TeaModel {
        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("AlgorithmName")
        public String algorithmName;

        public static ListInstancesResponseBodyDataItemsAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataItemsAlgorithms self = new ListInstancesResponseBodyDataItemsAlgorithms();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataItemsAlgorithms setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListInstancesResponseBodyDataItemsAlgorithms setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

    }

    public static class ListInstancesResponseBodyDataItems extends TeaModel {
        @NameInMap("AcuUsed")
        public Integer acuUsed;

        @NameInMap("Algorithms")
        public java.util.List<ListInstancesResponseBodyDataItemsAlgorithms> algorithms;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeviceNumber")
        public Integer deviceNumber;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataItems self = new ListInstancesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataItems setAcuUsed(Integer acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Integer getAcuUsed() {
            return this.acuUsed;
        }

        public ListInstancesResponseBodyDataItems setAlgorithms(java.util.List<ListInstancesResponseBodyDataItemsAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataItemsAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public ListInstancesResponseBodyDataItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataItems setDeviceNumber(Integer deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public Integer getDeviceNumber() {
            return this.deviceNumber;
        }

        public ListInstancesResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Items")
        public java.util.List<ListInstancesResponseBodyDataItems> items;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInstancesResponseBodyData setItems(java.util.List<ListInstancesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
