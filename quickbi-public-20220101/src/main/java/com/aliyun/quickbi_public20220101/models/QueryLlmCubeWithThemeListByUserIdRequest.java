// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLlmCubeWithThemeListByUserIdRequest extends TeaModel {
    /**
     * <p>User ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adsdasd-***********-123wdasd</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryLlmCubeWithThemeListByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLlmCubeWithThemeListByUserIdRequest self = new QueryLlmCubeWithThemeListByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryLlmCubeWithThemeListByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
