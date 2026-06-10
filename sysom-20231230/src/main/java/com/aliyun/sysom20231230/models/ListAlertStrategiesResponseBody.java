// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertStrategiesResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAlertStrategiesResponseBodyData> data;

    /**
     * <p>Maximum number of returned records</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty;  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Pagination token for the next request.</p>
     * 
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
     * <p>Total number of records</p>
     * 
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
        /**
         * <p>Set of clusters that accept alerts</p>
         */
        @NameInMap("clusters")
        public java.util.List<String> clusters;

        @NameInMap("destinations")
        public java.util.List<Integer> destinations;

        /**
         * <p>List of abnormal items that accept alerts</p>
         */
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

        public ListAlertStrategiesResponseBodyDataStrategy setDestinations(java.util.List<Integer> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<Integer> getDestinations() {
            return this.destinations;
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
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753669116286</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Whether the alert policy is enabled</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("k8sLabel")
        public Boolean k8sLabel;

        /**
         * <p>Policy Name</p>
         * 
         * <strong>example:</strong>
         * <p>strategy1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Details of the alert policy</p>
         */
        @NameInMap("strategy")
        public ListAlertStrategiesResponseBodyDataStrategy strategy;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1880327028143673</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <p>Update Time</p>
         * 
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
