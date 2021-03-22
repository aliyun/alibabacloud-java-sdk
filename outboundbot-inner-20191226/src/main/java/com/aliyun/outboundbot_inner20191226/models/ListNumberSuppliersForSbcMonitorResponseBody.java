// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class ListNumberSuppliersForSbcMonitorResponseBody extends TeaModel {
    @NameInMap("NumberSupplierForSbcMonitors")
    public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors numberSupplierForSbcMonitors;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListNumberSuppliersForSbcMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNumberSuppliersForSbcMonitorResponseBody self = new ListNumberSuppliersForSbcMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setNumberSupplierForSbcMonitors(ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors numberSupplierForSbcMonitors) {
        this.numberSupplierForSbcMonitors = numberSupplierForSbcMonitors;
        return this;
    }
    public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors getNumberSupplierForSbcMonitors() {
        return this.numberSupplierForSbcMonitors;
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNumberSuppliersForSbcMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor extends TeaModel {
        @NameInMap("SupplierId")
        public String supplierId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Numbers")
        public String numbers;

        @NameInMap("ThrottlingPolicy")
        public String throttlingPolicy;

        @NameInMap("Concurrency")
        public Long concurrency;

        public static ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor build(java.util.Map<String, ?> map) throws Exception {
            ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor self = new ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor();
            return TeaModel.build(map, self);
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }
        public String getSupplierId() {
            return this.supplierId;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setNumbers(String numbers) {
            this.numbers = numbers;
            return this;
        }
        public String getNumbers() {
            return this.numbers;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setThrottlingPolicy(String throttlingPolicy) {
            this.throttlingPolicy = throttlingPolicy;
            return this;
        }
        public String getThrottlingPolicy() {
            return this.throttlingPolicy;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

    }

    public static class ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList extends TeaModel {
        @NameInMap("NumberSupplierForSbcMonitor")
        public java.util.List<ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor> numberSupplierForSbcMonitor;

        public static ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList build(java.util.Map<String, ?> map) throws Exception {
            ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList self = new ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList();
            return TeaModel.build(map, self);
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList setNumberSupplierForSbcMonitor(java.util.List<ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor> numberSupplierForSbcMonitor) {
            this.numberSupplierForSbcMonitor = numberSupplierForSbcMonitor;
            return this;
        }
        public java.util.List<ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsListNumberSupplierForSbcMonitor> getNumberSupplierForSbcMonitor() {
            return this.numberSupplierForSbcMonitor;
        }

    }

    public static class ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors extends TeaModel {
        @NameInMap("List")
        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors self = new ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors();
            return TeaModel.build(map, self);
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors setList(ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList list) {
            this.list = list;
            return this;
        }
        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitorsList getList() {
            return this.list;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNumberSuppliersForSbcMonitorResponseBodyNumberSupplierForSbcMonitors setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
