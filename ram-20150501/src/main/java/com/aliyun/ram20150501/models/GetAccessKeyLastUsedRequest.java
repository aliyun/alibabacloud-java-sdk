// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    public static GetAccessKeyLastUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedRequest self = new GetAccessKeyLastUsedRequest();
        return TeaModel.build(map, self);
    }

}
