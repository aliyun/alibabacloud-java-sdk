// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdRequest extends TeaModel {
    /**
     * <p>Quick BI the user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryReadableResourcesListByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdRequest self = new QueryReadableResourcesListByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
