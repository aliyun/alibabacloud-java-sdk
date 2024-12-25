// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessLogsDownloadAttributeResponseBody extends TeaModel {
    /**
     * <p>The configuration of the access log.</p>
     */
    @NameInMap("LogsDownloadAttributes")
    public DescribeAccessLogsDownloadAttributeResponseBodyLogsDownloadAttributes logsDownloadAttributes;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B9DB03B-ED39-5DB8-9C9F-1ED5F548D61E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
        /**
         * <p>The CLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa08ex*****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-log-project</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-log-store</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The type of access log. Only <strong>layer7</strong> is returned, which indicates Layer 7 access logs.</p>
         * 
         * <strong>example:</strong>
         * <p>layer7</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The region ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
