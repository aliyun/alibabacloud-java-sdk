// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAccountRequest extends TeaModel {
    /**
     * <p>The username.</p>
     * <p>If you do not specify this parameter, the system returns details of the default account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("username")
    public String username;

    public static GetInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAccountRequest self = new GetInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceAccountRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
