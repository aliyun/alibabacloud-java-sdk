// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagValuesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the next query is required. The value of this parameter may be empty.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the tag values.</p>
     */
    @NameInMap("Values")
    public ListTagValuesResponseBodyValues values;

    public static ListTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesResponseBody self = new ListTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagValuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagValuesResponseBody setValues(ListTagValuesResponseBodyValues values) {
        this.values = values;
        return this;
    }
    public ListTagValuesResponseBodyValues getValues() {
        return this.values;
    }

    public static class ListTagValuesResponseBodyValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListTagValuesResponseBodyValues build(java.util.Map<String, ?> map) throws Exception {
            ListTagValuesResponseBodyValues self = new ListTagValuesResponseBodyValues();
            return TeaModel.build(map, self);
        }

        public ListTagValuesResponseBodyValues setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
