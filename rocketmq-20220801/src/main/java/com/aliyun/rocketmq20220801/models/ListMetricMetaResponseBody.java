// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMetricMetaResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return result</p>
     */
    @NameInMap("data")
    public ListMetricMetaResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8B459455-4A35-5796-BA9D-98EF1AB9A931</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMetricMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricMetaResponseBody self = new ListMetricMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMetricMetaResponseBody setData(ListMetricMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetricMetaResponseBodyData getData() {
        return this.data;
    }

    public ListMetricMetaResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMetricMetaResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMetricMetaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMetricMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMetricMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetricMetaResponseBodyDataList extends TeaModel {
        /**
         * <p>Monitoring item tag</p>
         * 
         * <strong>example:</strong>
         * <p>Bug</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Monitoring item description</p>
         * 
         * <strong>example:</strong>
         * <p>Using Serverless Devs to deploy the infrastructure of project:get-userinfo-v1-infrastructure-as-template-project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Monitoring item name</p>
         * 
         * <strong>example:</strong>
         * <p>SendMessageCountPerInstance</p>
         */
        @NameInMap("metricName")
        public String metricName;

        public static ListMetricMetaResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMetricMetaResponseBodyDataList self = new ListMetricMetaResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListMetricMetaResponseBodyDataList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMetricMetaResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMetricMetaResponseBodyDataList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

    }

    public static class ListMetricMetaResponseBodyData extends TeaModel {
        /**
         * <p>Paged data</p>
         */
        @NameInMap("list")
        public java.util.List<ListMetricMetaResponseBodyDataList> list;

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Total record count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListMetricMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetricMetaResponseBodyData self = new ListMetricMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetricMetaResponseBodyData setList(java.util.List<ListMetricMetaResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMetricMetaResponseBodyDataList> getList() {
            return this.list;
        }

        public ListMetricMetaResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListMetricMetaResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMetricMetaResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
