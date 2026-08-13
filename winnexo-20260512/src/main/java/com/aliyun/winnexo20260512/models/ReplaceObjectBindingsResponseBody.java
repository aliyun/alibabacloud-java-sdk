// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("objectBindings")
    public java.util.List<ReplaceObjectBindingsResponseBodyObjectBindings> objectBindings;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>数据源 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static ReplaceObjectBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceObjectBindingsResponseBody self = new ReplaceObjectBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceObjectBindingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceObjectBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceObjectBindingsResponseBody setObjectBindings(java.util.List<ReplaceObjectBindingsResponseBodyObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<ReplaceObjectBindingsResponseBodyObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public ReplaceObjectBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceObjectBindingsResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public static class ReplaceObjectBindingsResponseBodyObjectBindings extends TeaModel {
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

        public static ReplaceObjectBindingsResponseBodyObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ReplaceObjectBindingsResponseBodyObjectBindings self = new ReplaceObjectBindingsResponseBodyObjectBindings();
            return TeaModel.build(map, self);
        }

        public ReplaceObjectBindingsResponseBodyObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ReplaceObjectBindingsResponseBodyObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ReplaceObjectBindingsResponseBodyObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
