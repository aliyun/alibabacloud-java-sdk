// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListTagKeysResponseBodyTags> tags;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagKeysResponseBody setTags(java.util.List<ListTagKeysResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagKeysResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagKeysResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        public static ListTagKeysResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyTags self = new ListTagKeysResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
