// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("Status")
    public String status;

    public static UpdateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyRequest self = new UpdateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

}
