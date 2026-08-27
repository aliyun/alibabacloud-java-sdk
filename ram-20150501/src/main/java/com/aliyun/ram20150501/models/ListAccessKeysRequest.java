// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysRequest extends TeaModel {
    /**
     * <p>The username. If a Resource Access Management (RAM) user calls this operation without specifying this parameter, the AccessKey pairs of the RAM user are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangq****</p>
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
