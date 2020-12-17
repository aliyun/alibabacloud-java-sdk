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

    public ListTagValuesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagValuesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagValuesResponse setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
