// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTagValuesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListTagValuesResponseBodyTags> tags;

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

    public ListTagValuesResponseBody setTags(java.util.List<ListTagValuesResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagValuesResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagValuesResponseBodyTags extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static ListTagValuesResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagValuesResponseBodyTags self = new ListTagValuesResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagValuesResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
