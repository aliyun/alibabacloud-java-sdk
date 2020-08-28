// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTagKeysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Keys")
    @Validation(required = true)
    public java.util.List<String> keys;

    public static ListTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponse self = new ListTagKeysResponse();
        return TeaModel.build(map, self);
    }

}
