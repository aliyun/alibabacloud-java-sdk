// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySmartqPermissionByCubeIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>617277******************ABA47E31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QuerySmartqPermissionByCubeIdResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySmartqPermissionByCubeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmartqPermissionByCubeIdResponseBody self = new QuerySmartqPermissionByCubeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmartqPermissionByCubeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmartqPermissionByCubeIdResponseBody setResult(QuerySmartqPermissionByCubeIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QuerySmartqPermissionByCubeIdResponseBodyResult getResult() {
        return this.result;
    }

    public QuerySmartqPermissionByCubeIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySmartqPermissionByCubeIdResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

        @NameInMap("HasPerssion")
        public Boolean hasPerssion;

        public static QuerySmartqPermissionByCubeIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySmartqPermissionByCubeIdResponseBodyResult self = new QuerySmartqPermissionByCubeIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySmartqPermissionByCubeIdResponseBodyResult setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QuerySmartqPermissionByCubeIdResponseBodyResult setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public QuerySmartqPermissionByCubeIdResponseBodyResult setHasPerssion(Boolean hasPerssion) {
            this.hasPerssion = hasPerssion;
            return this;
        }
        public Boolean getHasPerssion() {
            return this.hasPerssion;
        }

    }

}
