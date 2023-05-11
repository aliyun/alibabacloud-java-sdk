// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdRequest extends TeaModel {
    /**
     * <p>The ID of the user. The UserID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryUserInfoByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByUserIdRequest self = new QueryUserInfoByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
