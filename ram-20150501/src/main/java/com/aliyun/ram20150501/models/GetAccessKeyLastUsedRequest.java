// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LTAI4GFTgcR8m8cZQDTH****</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetAccessKeyLastUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedRequest self = new GetAccessKeyLastUsedRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetAccessKeyLastUsedRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
