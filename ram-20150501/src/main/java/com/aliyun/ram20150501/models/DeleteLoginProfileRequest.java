// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteLoginProfileRequest extends TeaModel {
    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DeleteLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginProfileRequest self = new DeleteLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
