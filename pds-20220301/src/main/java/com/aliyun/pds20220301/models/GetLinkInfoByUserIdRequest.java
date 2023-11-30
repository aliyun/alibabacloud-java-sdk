// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoByUserIdRequest extends TeaModel {
    /**
     * <p>The user ID.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static GetLinkInfoByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoByUserIdRequest self = new GetLinkInfoByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
