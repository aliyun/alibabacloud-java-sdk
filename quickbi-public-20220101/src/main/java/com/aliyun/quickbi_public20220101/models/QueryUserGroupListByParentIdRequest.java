// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupListByParentIdRequest extends TeaModel {
    /**
     * <p>The ID of the parent user group.</p>
     * <br>
     * <p>*   If you enter the ID of the parent user group, you can obtain the information of the child user group under this ID.</p>
     * <p>*   If you enter -1, you can obtain the sub-user group information under the root directory.</p>
     */
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
