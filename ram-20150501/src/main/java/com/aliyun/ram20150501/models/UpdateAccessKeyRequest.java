// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyRequest extends TeaModel {
    /**
     * <p>The status of the AccessKey pair. Valid values: `Active` and `Inactive`.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The AccessKey ID in the AccessKey pair whose status you want to change.</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyRequest self = new UpdateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAccessKeyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public UpdateAccessKeyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
