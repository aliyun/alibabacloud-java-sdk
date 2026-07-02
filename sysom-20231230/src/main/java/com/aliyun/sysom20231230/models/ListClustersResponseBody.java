// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failure. Check the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListClustersResponseBodyData> data;

    /**
     * <p>Error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClustersResponseBody setData(java.util.List<ListClustersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClustersResponseBodyData> getData() {
        return this.data;
    }

    public ListClustersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClustersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListClustersResponseBodyData extends TeaModel {
        /**
         * <p>Actual cluster ID.</p>
         * <blockquote>
         * <ul>
         * <li>For <code>ACK</code> type clusters, this cluster ID is the ACK cluster ID.</li>
         * <li>For <code>CUSTOM</code> type clusters, this cluster ID serves as a unique identifier with no additional meaning.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c666d4774f0e2440b979bf917bf100e40</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <ul>
         * <li><code>Running</code>: The cluster is managed normally.</li>
         * <li><code>Installing</code>: The cluster has an installation task in progress.</li>
         * <li><code>Uninstalling</code>: The cluster has an uninstallation task in progress.</li>
         * <li><code>Upgrading</code>: The cluster has an upgrade task in progress.</li>
         * <li><code>Offline</code>: The cluster is offline and management is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("cluster_status")
        public String clusterStatus;

        /**
         * <ul>
         * <li><code>ACK</code>: ACK cluster.</li>
         * <li><code>CUSTOM</code>: Custom cluster (the default cluster belongs to custom clusters).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5389fba5-92a1-4ff4-9b26-773b97828144</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-name-sbvCT</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-25T15:08:19</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        public static ListClustersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyData self = new ListClustersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClustersResponseBodyData setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public ListClustersResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClustersResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListClustersResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListClustersResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
