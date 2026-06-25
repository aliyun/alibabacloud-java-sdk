// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirect.</p>
     * </li>
     * <li><p><strong>4xx</strong>: client error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The service list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppServicesPageResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>A message that describes the outcome of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2583E089-99C2-562E-8B7E-73512136****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0c816394483660457498e****</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hc4fs1****@98314c8790b****</p>
         */
        @NameInMap("EdasAppId")
        public String edasAppId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-micro-service-******</p>
         */
        @NameInMap("EdasAppName")
        public String edasAppName;

        /**
         * <p>The service group. This value is user-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceNum")
        public Long instanceNum;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.service.provider</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The service version. This value is user-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public String currentPage;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page. The value must be in the range of 0 to 9999.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListAppServicesPageResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
