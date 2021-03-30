// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class QuerySharesToUserListRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static QuerySharesToUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySharesToUserListRequest self = new QuerySharesToUserListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySharesToUserListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
