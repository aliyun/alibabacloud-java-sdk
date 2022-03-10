// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupMemberRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static QueryUserGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupMemberRequest self = new QueryUserGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupMemberRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUserGroupMemberRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
