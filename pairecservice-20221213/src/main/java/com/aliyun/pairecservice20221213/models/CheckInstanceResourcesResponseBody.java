// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
