// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagValueListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryUserTagValueListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagValueListRequest self = new QueryUserTagValueListRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserTagValueListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
