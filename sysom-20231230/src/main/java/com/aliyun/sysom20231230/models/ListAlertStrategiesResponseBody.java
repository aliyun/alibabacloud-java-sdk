// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertStrategiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAlertStrategiesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>c2f78a783f49457caba6bace6f6f79e4</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAlertStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertStrategiesResponseBody self = new ListAlertStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertStrategiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertStrategiesResponseBody setData(java.util.List<ListAlertStrategiesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlertStrategiesResponseBodyData> getData() {
        return this.data;
    }

    public ListAlertStrategiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertStrategiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertStrategiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertStrategiesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAlertStrategiesResponseBodyDataStrategy extends TeaModel {
        @NameInMap("clusters")
        public java.util.List<String> clusters;

        @NameInMap("items")
        public java.util.List<String> items;

        public static ListAlertStrategiesResponseBodyDataStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListAlertStrategiesResponseBodyDataStrategy self = new ListAlertStrategiesResponseBodyDataStrategy();
            return TeaModel.build(map, self);
        }

        public ListAlertStrategiesResponseBodyDataStrategy setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public ListAlertStrategiesResponseBodyDataStrategy setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class ListAlertStrategiesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1753669116286</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("k8sLabel")
        public Boolean k8sLabel;

        /**
         * <strong>example:</strong>
         * <p>strategy1</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("strategy")
        public ListAlertStrategiesResponseBodyDataStrategy strategy;

        /**
         * <strong>example:</strong>
         * <p>1880327028143673</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>1753237017710</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static ListAlertStrategiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertStrategiesResponseBodyData self = new ListAlertStrategiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlertStrategiesResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAlertStrategiesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAlertStrategiesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAlertStrategiesResponseBodyData setK8sLabel(Boolean k8sLabel) {
            this.k8sLabel = k8sLabel;
            return this;
        }
        public Boolean getK8sLabel() {
            return this.k8sLabel;
        }

        public ListAlertStrategiesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertStrategiesResponseBodyData setStrategy(ListAlertStrategiesResponseBodyDataStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListAlertStrategiesResponseBodyDataStrategy getStrategy() {
            return this.strategy;
        }

        public ListAlertStrategiesResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAlertStrategiesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
