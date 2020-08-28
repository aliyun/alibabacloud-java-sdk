// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTagValuesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Values")
    @Validation(required = true)
    public java.util.List<String> values;

    public static ListTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesResponse self = new ListTagValuesResponse();
        return TeaModel.build(map, self);
    }

}
