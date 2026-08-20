// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsRequest extends TeaModel {
    /**
     * <p>The new list of object bindings (full replacement. Pass an empty list to clear all bindings).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<ReplaceObjectBindingsRequestObjectBindings> objectBindings;

    /**
     * <p>The ID of the personal FILE data source to be replaced (unique within the tenant).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly through winnexo-cli using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceObjectBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceObjectBindingsRequest self = new ReplaceObjectBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceObjectBindingsRequest setObjectBindings(java.util.List<ReplaceObjectBindingsRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<ReplaceObjectBindingsRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public ReplaceObjectBindingsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceObjectBindingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class ReplaceObjectBindingsRequestObjectBindings extends TeaModel {
        /**
         * <p>The semantic graph name to which the binding object belongs (object_id is unique within this graph. Required).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The binding object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The binding object type (such as customer or project).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static ReplaceObjectBindingsRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ReplaceObjectBindingsRequestObjectBindings self = new ReplaceObjectBindingsRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public ReplaceObjectBindingsRequestObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ReplaceObjectBindingsRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ReplaceObjectBindingsRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
