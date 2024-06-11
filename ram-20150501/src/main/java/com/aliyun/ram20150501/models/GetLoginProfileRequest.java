// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetLoginProfileRequest extends TeaModel {
    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileRequest self = new GetLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
