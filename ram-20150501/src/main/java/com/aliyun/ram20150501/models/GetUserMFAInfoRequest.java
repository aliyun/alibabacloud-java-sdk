// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoRequest extends TeaModel {
    /**
     * <p>The username of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetUserMFAInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoRequest self = new GetUserMFAInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
