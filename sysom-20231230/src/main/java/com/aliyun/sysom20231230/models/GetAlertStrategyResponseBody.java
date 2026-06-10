// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertStrategyResponseBody extends TeaModel {
    /**
     * <p>Status code:  </p>
     * <ul>
     * <li><code>code == Success</code> indicates successful authorization;  </li>
     * <li>Other status codes indicate failed authorization. When authorization fails, view the <code>message</code> field to obtain detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("data")
    public GetAlertStrategyResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAlertStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertStrategyResponseBody self = new GetAlertStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlertStrategyResponseBody setData(GetAlertStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlertStrategyResponseBodyData getData() {
        return this.data;
    }

    public GetAlertStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertStrategyResponseBodyDataStrategy extends TeaModel {
        /**
         * <p>Set of clusters that accept alerts</p>
         */
        @NameInMap("clusters")
        public java.util.List<String> clusters;

        @NameInMap("destinations")
        public Object destinations;

        /**
         * <p>List of abnormal items that accept alerts</p>
         * 
         * <strong>example:</strong>
         * <p>节点CPU使用率检测</p>
         */
        @NameInMap("items")
        public Object items;

        public static GetAlertStrategyResponseBodyDataStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetAlertStrategyResponseBodyDataStrategy self = new GetAlertStrategyResponseBodyDataStrategy();
            return TeaModel.build(map, self);
        }

        public GetAlertStrategyResponseBodyDataStrategy setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public GetAlertStrategyResponseBodyDataStrategy setDestinations(Object destinations) {
            this.destinations = destinations;
            return this;
        }
        public Object getDestinations() {
            return this.destinations;
        }

        public GetAlertStrategyResponseBodyDataStrategy setItems(Object items) {
            this.items = items;
            return this;
        }
        public Object getItems() {
            return this.items;
        }

    }

    public static class GetAlertStrategyResponseBodyData extends TeaModel {
        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1751520976660</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>Indicates whether the alert policy is enabled</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Alert policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>k8s label</p>
         */
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
        public GetAlertStrategyResponseBodyDataStrategy strategy;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1222933234714935</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <p>Update Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1751254826285</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static GetAlertStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlertStrategyResponseBodyData self = new GetAlertStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlertStrategyResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetAlertStrategyResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAlertStrategyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlertStrategyResponseBodyData setK8sLabel(Boolean k8sLabel) {
            this.k8sLabel = k8sLabel;
            return this;
        }
        public Boolean getK8sLabel() {
            return this.k8sLabel;
        }

        public GetAlertStrategyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertStrategyResponseBodyData setStrategy(GetAlertStrategyResponseBodyDataStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetAlertStrategyResponseBodyDataStrategy getStrategy() {
            return this.strategy;
        }

        public GetAlertStrategyResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetAlertStrategyResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
