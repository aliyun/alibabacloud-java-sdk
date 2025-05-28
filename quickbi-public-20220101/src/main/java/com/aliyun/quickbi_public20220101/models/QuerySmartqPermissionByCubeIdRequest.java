// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySmartqPermissionByCubeIdRequest extends TeaModel {
    /**
     * <p>Dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>User ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95c4d**************3852e202</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QuerySmartqPermissionByCubeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmartqPermissionByCubeIdRequest self = new QuerySmartqPermissionByCubeIdRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmartqPermissionByCubeIdRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public QuerySmartqPermissionByCubeIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
