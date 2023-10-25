// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class SearchTracesResponseBody extends TeaModel {
    /**
     * <p>The information about the returned page.</p>
     */
    @NameInMap("PageBean")
    public SearchTracesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesResponseBody self = new SearchTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesResponseBody setPageBean(SearchTracesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchTracesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchTracesResponseBodyPageBeanTraceInfosTraceInfo extends TeaModel {
        /**
         * <p>The time used to call the trace. Unit: milliseconds.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The name of the span.</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The IP address of the server where the span resides.</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The map of tags.</p>
         */
        @NameInMap("TagMap")
        public java.util.Map<String, ?> tagMap;

        /**
         * <p>The time when the span was generated. Unit: microseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The ID of the trace.</p>
         */
        @NameInMap("TraceID")
        public String traceID;

        public static SearchTracesResponseBodyPageBeanTraceInfosTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyPageBeanTraceInfosTraceInfo self = new SearchTracesResponseBodyPageBeanTraceInfosTraceInfo();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setTagMap(java.util.Map<String, ?> tagMap) {
            this.tagMap = tagMap;
            return this;
        }
        public java.util.Map<String, ?> getTagMap() {
            return this.tagMap;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchTracesResponseBodyPageBeanTraceInfosTraceInfo setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class SearchTracesResponseBodyPageBeanTraceInfos extends TeaModel {
        @NameInMap("TraceInfo")
        public java.util.List<SearchTracesResponseBodyPageBeanTraceInfosTraceInfo> traceInfo;

        public static SearchTracesResponseBodyPageBeanTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyPageBeanTraceInfos self = new SearchTracesResponseBodyPageBeanTraceInfos();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyPageBeanTraceInfos setTraceInfo(java.util.List<SearchTracesResponseBodyPageBeanTraceInfosTraceInfo> traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public java.util.List<SearchTracesResponseBodyPageBeanTraceInfosTraceInfo> getTraceInfo() {
            return this.traceInfo;
        }

    }

    public static class SearchTracesResponseBodyPageBean extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The information about the trace.</p>
         */
        @NameInMap("TraceInfos")
        public SearchTracesResponseBodyPageBeanTraceInfos traceInfos;

        public static SearchTracesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyPageBean self = new SearchTracesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchTracesResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchTracesResponseBodyPageBean setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SearchTracesResponseBodyPageBean setTraceInfos(SearchTracesResponseBodyPageBeanTraceInfos traceInfos) {
            this.traceInfos = traceInfos;
            return this;
        }
        public SearchTracesResponseBodyPageBeanTraceInfos getTraceInfos() {
            return this.traceInfos;
        }

    }

}
