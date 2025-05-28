// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetUserGroupInfoRequest extends TeaModel {
    /**
     * <p>Keyword of the user group name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    public static GetUserGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupInfoRequest self = new GetUserGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGroupInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
