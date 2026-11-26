// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseSourceObjectBindingsRequest extends TeaModel {
    /**
     * <p>token</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The object bindings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings> objectBindings;

    /**
     * <p>The code of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The ID of the data source to be re-parsed. The ID is unique within the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceKnowledgeBaseSourceObjectBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseSourceObjectBindingsRequest self = new ReplaceKnowledgeBaseSourceObjectBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setObjectBindings(java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings extends TeaModel {
        /**
         * <p>The name of the semantic graph to which the bound object belongs. The object ID is unique within this graph. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the bound object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type to attach, such as customer or project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings self = new ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ReplaceKnowledgeBaseSourceObjectBindingsRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
