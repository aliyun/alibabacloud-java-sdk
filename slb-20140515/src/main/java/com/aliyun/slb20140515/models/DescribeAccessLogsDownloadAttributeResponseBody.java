// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessLogsDownloadAttributeResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("LogsDownloadAttributes")
    public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes logsDownloadAttributes;

    /**
     * <p>The type of access log. Set the value to **layer7**, which specifies Layer 7 access logs.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of access log. Only **layer7** is returned, which indicates Layer 7 access logs.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessLogsDownloadAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessLogsDownloadAttributeResponseBody self = new DescribeAccessLogsDownloadAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessLogsDownloadAttributeResponseBody setLogsDownloadAttributes(DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes logsDownloadAttributes) {
        this.logsDownloadAttributes = logsDownloadAttributes;
        return this;
    }
    public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes getLogsDownloadAttributes() {
        return this.logsDownloadAttributes;
    }

    public DescribeAccessLogsDownloadAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessLogsDownloadAttributeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessLogsDownloadAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessLogsDownloadAttributeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the project of Log Service.</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("Region")
        public String region;

        public static DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute self = new DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes extends TeaModel {
        @NameInMap("LogsDownloadAttribute")
        public java.util.List<DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute> logsDownloadAttribute;

        public static DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes self = new DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes setLogsDownloadAttribute(java.util.List<DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute> logsDownloadAttribute) {
            this.logsDownloadAttribute = logsDownloadAttribute;
            return this;
        }
        public java.util.List<DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributesLogsDownloadAttribute> getLogsDownloadAttribute() {
            return this.logsDownloadAttribute;
        }

    }

}
