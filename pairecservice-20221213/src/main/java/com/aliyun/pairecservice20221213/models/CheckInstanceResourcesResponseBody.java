// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CheckInstanceResourcesResponseBodyResources> resources;

    public static CheckInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceResourcesResponseBody self = new CheckInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckInstanceResourcesResponseBody setResources(java.util.List<CheckInstanceResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CheckInstanceResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class CheckInstanceResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The access status. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Hologres</li>
         * <li>EAS</li>
         * <li>BE</li>
         * <li>Rec</li>
         * <li>Platform</li>
         * <li>SLS</li>
         * <li>DataHub</li>
         * <li>Kafka</li>
         * <li>Flinkvvp</li>
         * <li>ACR</li>
         * <li>OSS</li>
         * <li>DataWorks</li>
         * <li>PAI</li>
         * <li>MaxCompute</li>
         * <li>GraphCompute</li>
         * <li>Redis</li>
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

        public static CheckInstanceResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            CheckInstanceResourcesResponseBodyResources self = new CheckInstanceResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public CheckInstanceResourcesResponseBodyResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckInstanceResourcesResponseBodyResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CheckInstanceResourcesResponseBodyResources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
