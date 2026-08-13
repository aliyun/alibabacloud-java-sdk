// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsRequest extends TeaModel {
    /**
     * <p>新的对象绑定列表（全量替换；传空列表表示清空所有绑定）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<ReplaceObjectBindingsRequestObjectBindings> objectBindings;

    /**
     * <p>数据源 ID（租户内唯一）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
         * <p>绑定对象归属的语义图谱名（object_id 在该 graph 下唯一，必填）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>绑定对象 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>绑定对象类型（如 customer / project）</p>
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
