// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDefaultDriveRequest extends TeaModel {
    /**
     * <p>The user ID. If you use an AccessKey pair for authentication, you must specify this parameter. If you use an access token for authentication, this parameter is optional. By default, the user ID associated with the access token is used.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static GetDefaultDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDriveRequest self = new GetDefaultDriveRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultDriveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
