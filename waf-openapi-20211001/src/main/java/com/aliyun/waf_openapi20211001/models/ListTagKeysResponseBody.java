// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    /**
     * <p>The keys and types of the tags.</p>
     */
    @NameInMap("Keys")
    public java.util.List<ListTagKeysResponseBodyKeys> keys;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setKeys(java.util.List<ListTagKeysResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<ListTagKeysResponseBodyKeys> getKeys() {
        return this.keys;
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

    public static class ListTagKeysResponseBodyKeys extends TeaModel {
        /**
         * <p>The type of the tag. Valid values:</p>
         * <br>
         * <p>*   custom</p>
         * <p>*   system</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        public static ListTagKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyKeys self = new ListTagKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyKeys setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTagKeysResponseBodyKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
