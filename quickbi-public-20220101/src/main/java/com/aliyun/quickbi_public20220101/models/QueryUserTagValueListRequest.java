// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagValueListRequest extends TeaModel {
    /**
     * <p>This UserID refers to the Quick BI UserID, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
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
