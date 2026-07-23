// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of resource objects.</p>
     */
    @NameInMap("Resources")
    public java.util.List<ListInstanceResourcesResponseBodyResources> resources;

    /**
     * <p>The total number of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourcesResponseBody self = new ListInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResourcesResponseBody setResources(java.util.List<ListInstanceResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListInstanceResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public ListInstanceResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The category of the resource. Valid values:</p>
         * <ul>
         * <li><p>DataManagement</p>
         * </li>
         * <li><p>Engine</p>
         * </li>
         * <li><p>Monitor</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataManagement</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The configuration of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13 17:34:52</p>
         */
        @NameInMap("GmtCreateAt")
        public String gmtCreateAt;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13 17:34:52</p>
         */
        @NameInMap("GmtModifiedAt")
        public String gmtModifiedAt;

        /**
         * <p>The group of the resource.</p>
         * <p>If <code>Category</code> is <code>DataManagement</code>, valid values are:</p>
         * <ul>
         * <li><p>storage</p>
         * </li>
         * <li><p>modelpipeline</p>
         * </li>
         * <li><p>datastorage</p>
         * </li>
         * <li><p>modeltrain</p>
         * </li>
         * </ul>
         * <p>If <code>Category</code> is <code>Engine</code>, valid values are:</p>
         * <ul>
         * <li><p>feature</p>
         * </li>
         * <li><p>predict</p>
         * </li>
         * <li><p>recall</p>
         * </li>
         * <li><p>recengine</p>
         * </li>
         * </ul>
         * <p>If <code>Category</code> is <code>Monitor</code>, valid values are:</p>
         * <ul>
         * <li><p>logs</p>
         * </li>
         * <li><p>logsback</p>
         * </li>
         * <li><p>coldstart</p>
         * </li>
         * <li><p>deploy</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>reso-2s416t***</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * <ul>
         * <li><p>Hologres</p>
         * </li>
         * <li><p>EAS</p>
         * </li>
         * <li><p>BE</p>
         * </li>
         * <li><p>Rec</p>
         * </li>
         * <li><p>Platform</p>
         * </li>
         * <li><p>SLS</p>
         * </li>
         * <li><p>DataHub</p>
         * </li>
         * <li><p>ApsaraMQ for Kafka</p>
         * </li>
         * <li><p>Realtime Compute for Apache Flink</p>
         * </li>
         * <li><p>ACR</p>
         * </li>
         * <li><p>OSS</p>
         * </li>
         * <li><p>DataWorks</p>
         * </li>
         * <li><p>PAI</p>
         * </li>
         * <li><p>MaxCompute</p>
         * </li>
         * <li><p>Graph Compute Service</p>
         * </li>
         * <li><p>ApsaraDB for Redis</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The resource URI.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-test-123</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListInstanceResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResourcesResponseBodyResources self = new ListInstanceResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListInstanceResourcesResponseBodyResources setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListInstanceResourcesResponseBodyResources setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListInstanceResourcesResponseBodyResources setGmtCreateAt(String gmtCreateAt) {
            this.gmtCreateAt = gmtCreateAt;
            return this;
        }
        public String getGmtCreateAt() {
            return this.gmtCreateAt;
        }

        public ListInstanceResourcesResponseBodyResources setGmtModifiedAt(String gmtModifiedAt) {
            this.gmtModifiedAt = gmtModifiedAt;
            return this;
        }
        public String getGmtModifiedAt() {
            return this.gmtModifiedAt;
        }

        public ListInstanceResourcesResponseBodyResources setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListInstanceResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListInstanceResourcesResponseBodyResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstanceResourcesResponseBodyResources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
