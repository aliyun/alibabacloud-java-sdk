// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the call was successful.</p>
     * <p>*   **3xx**: indicates that the call was redirected.</p>
     * <p>*   **4xx**: indicates that the call failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of microservices.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppServicesPageResponseBodyData> data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <br>
     * <p>- If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>- If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the microservice list was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The list was obtained.</p>
     * <p>*   **false**: The list failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("EdasAppId")
        public String edasAppId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("EdasAppName")
        public String edasAppName;

        /**
         * <p>The group to which the service belongs. You can create a custom group.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The total number of instances.</p>
         */
        @NameInMap("InstanceNum")
        public Long instanceNum;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The version of the service. You can create a custom version.</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAppServicesPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppServicesPageResponseBodyDataResult self = new ListAppServicesPageResponseBodyDataResult();
            return TeaModel.build(map, self);
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
        /**
         * <p>The page number of the current page.</p>
         */
        @NameInMap("CurrentPage")
        public String currentPage;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries returned per page. Valid values: 0 to 9999.</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListAppServicesPageResponseBodyDataResult> result;

        /**
         * <p>The total number of pages returned.</p>
         */
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
