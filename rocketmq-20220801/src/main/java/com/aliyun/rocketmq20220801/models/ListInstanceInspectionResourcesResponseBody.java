// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ListInstanceInspectionResourcesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListInstanceInspectionResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionResourcesResponseBody self = new ListInstanceInspectionResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionResourcesResponseBody setData(java.util.List<ListInstanceInspectionResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceInspectionResourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceInspectionResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceInspectionResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceInspectionResourcesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstanceInspectionResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>orders-g1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>订单实例</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>消费延迟超过阈值</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>ConsumerGroup</p>
         */
        @NameInMap("type")
        public String type;

        public static ListInstanceInspectionResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionResourcesResponseBodyData self = new ListInstanceInspectionResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionResourcesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstanceInspectionResourcesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceInspectionResourcesResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListInstanceInspectionResourcesResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListInstanceInspectionResourcesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
