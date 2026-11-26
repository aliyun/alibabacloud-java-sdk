// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplacePersonalSourceObjectBindingsRequest extends TeaModel {
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
    public java.util.List<ReplacePersonalSourceObjectBindingsRequestObjectBindings> objectBindings;

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
     * <p>The ID of the data source. The ID is unique within the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplacePersonalSourceObjectBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplacePersonalSourceObjectBindingsRequest self = new ReplacePersonalSourceObjectBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ReplacePersonalSourceObjectBindingsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplacePersonalSourceObjectBindingsRequest setObjectBindings(java.util.List<ReplacePersonalSourceObjectBindingsRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<ReplacePersonalSourceObjectBindingsRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public ReplacePersonalSourceObjectBindingsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplacePersonalSourceObjectBindingsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplacePersonalSourceObjectBindingsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplacePersonalSourceObjectBindingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class ReplacePersonalSourceObjectBindingsRequestObjectBindings extends TeaModel {
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

        public static ReplacePersonalSourceObjectBindingsRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ReplacePersonalSourceObjectBindingsRequestObjectBindings self = new ReplacePersonalSourceObjectBindingsRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public ReplacePersonalSourceObjectBindingsRequestObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ReplacePersonalSourceObjectBindingsRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ReplacePersonalSourceObjectBindingsRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
