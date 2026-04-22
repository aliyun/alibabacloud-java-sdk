// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListRealtimeInstanceStatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRealtimeInstanceStatsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRealtimeInstanceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeInstanceStatsResponseBody self = new ListRealtimeInstanceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeInstanceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRealtimeInstanceStatsResponseBody setData(ListRealtimeInstanceStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRealtimeInstanceStatsResponseBodyData getData() {
        return this.data;
    }

    public ListRealtimeInstanceStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRealtimeInstanceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRealtimeInstanceStatsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListRealtimeInstanceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRealtimeInstanceStatsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Long configuredConcurrency;

        /**
         * <strong>example:</strong>
         * <p>88b64330a8d34e63b60c9d272f8b3950</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1776837256000</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Long usedConcurrency;

        public static ListRealtimeInstanceStatsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeInstanceStatsResponseBodyDataList self = new ListRealtimeInstanceStatsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRealtimeInstanceStatsResponseBodyDataList setConfiguredConcurrency(Long configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public ListRealtimeInstanceStatsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRealtimeInstanceStatsResponseBodyDataList setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public ListRealtimeInstanceStatsResponseBodyDataList setUsedConcurrency(Long usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

    public static class ListRealtimeInstanceStatsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListRealtimeInstanceStatsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRealtimeInstanceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeInstanceStatsResponseBodyData self = new ListRealtimeInstanceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRealtimeInstanceStatsResponseBodyData setList(java.util.List<ListRealtimeInstanceStatsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRealtimeInstanceStatsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListRealtimeInstanceStatsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRealtimeInstanceStatsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRealtimeInstanceStatsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
