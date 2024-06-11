// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysRequest extends TeaModel {
    /**
     * <p>The name of the RAM user. If a RAM user calls this operation and does not specify this parameter, the AccessKey pairs of the RAM user are returned.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListAccessKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysRequest self = new ListAccessKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
