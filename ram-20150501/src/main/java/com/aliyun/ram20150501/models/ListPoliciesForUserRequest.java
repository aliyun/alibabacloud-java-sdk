// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForUserRequest extends TeaModel {
    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListPoliciesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForUserRequest self = new ListPoliciesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
