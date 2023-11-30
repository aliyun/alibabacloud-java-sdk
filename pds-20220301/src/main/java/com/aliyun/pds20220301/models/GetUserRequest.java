// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The user ID. If you use an AccessKey pair to access Drive and Photo Service, you must specify this parameter. If you use an access token to access Drive and Photo Service, you do not need to specify this parameter, and Drive and Photo Service automatically finds the user ID contained in the access token.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
