// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupListByParentIdRequest extends TeaModel {
    @NameInMap("ParentUserGroupId")
    public String parentUserGroupId;

    public static QueryUserGroupListByParentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupListByParentIdRequest self = new QueryUserGroupListByParentIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupListByParentIdRequest setParentUserGroupId(String parentUserGroupId) {
        this.parentUserGroupId = parentUserGroupId;
        return this;
    }
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

}
