// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySmartqPermissionByCubeIdResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>617277******************ABA47E31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Basic information of the dataset.</p>
     */
    @NameInMap("Result")
    public QuerySmartqPermissionByCubeIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
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
         * <p>Dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>Dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

        /**
         * <p>Whether the current user has permission for the smart question. Note: \&quot;HasPerssion\&quot; seems to be a typo, it should probably be \&quot;HasPermission\&quot;.</p>
         */
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
