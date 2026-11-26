// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseSourceObjectBindingsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings> objectBindings;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the personal FILE data source to be replaced. The ID is unique within the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static ReplaceKnowledgeBaseSourceObjectBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseSourceObjectBindingsResponseBody self = new ReplaceKnowledgeBaseSourceObjectBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody setObjectBindings(java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public static class ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings extends TeaModel {
        /**
         * <p>The name of the semantic graph to which the bound object belongs. The object ID is unique within this graph. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the bound object.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type to attach, such as customer or project.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings self = new ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings();
            return TeaModel.build(map, self);
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsResponseBodyObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
