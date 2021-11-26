// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppServicesPageResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListAppServicesPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesPageResponseBody self = new ListAppServicesPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppServicesPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppServicesPageResponseBody setData(java.util.List<ListAppServicesPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppServicesPageResponseBodyData> getData() {
        return this.data;
    }

    public ListAppServicesPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppServicesPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppServicesPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppServicesPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppServicesPageResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAppServicesPageResponseBodyDataResult extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("EdasAppId")
        public String edasAppId;

        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        @NameInMap("Group")
        public String group;

        @NameInMap("InstanceNum")
        public Long instanceNum;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Version")
        public String version;

        public static ListAppServicesPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppServicesPageResponseBodyDataResult self = new ListAppServicesPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListAppServicesPageResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListAppServicesPageResponseBodyDataResult setEdasAppId(String edasAppId) {
            this.edasAppId = edasAppId;
            return this;
        }
        public String getEdasAppId() {
            return this.edasAppId;
        }

        public ListAppServicesPageResponseBodyDataResult setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public ListAppServicesPageResponseBodyDataResult setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public ListAppServicesPageResponseBodyDataResult setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListAppServicesPageResponseBodyDataResult setInstanceNum(Long instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Long getInstanceNum() {
            return this.instanceNum;
        }

        public ListAppServicesPageResponseBodyDataResult setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAppServicesPageResponseBodyDataResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAppServicesPageResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public String currentPage;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Result")
        public java.util.List<ListAppServicesPageResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public String totalSize;

        public static ListAppServicesPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppServicesPageResponseBodyData self = new ListAppServicesPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppServicesPageResponseBodyData setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public String getCurrentPage() {
            return this.currentPage;
        }

        public ListAppServicesPageResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListAppServicesPageResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListAppServicesPageResponseBodyData setResult(java.util.List<ListAppServicesPageResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListAppServicesPageResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListAppServicesPageResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}
