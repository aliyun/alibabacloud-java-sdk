// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySharesToUserListRequest extends TeaModel {
    /**
     * <p>The ID of the user. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
