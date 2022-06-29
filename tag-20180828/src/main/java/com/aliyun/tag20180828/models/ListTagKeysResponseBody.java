// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    @NameInMap("Keys")
    public ListTagKeysResponseBodyKeys keys;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setKeys(ListTagKeysResponseBodyKeys keys) {
        this.keys = keys;
        return this;
    }
    public ListTagKeysResponseBodyKeys getKeys() {
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

    public static class ListTagKeysResponseBodyKeysKey extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("Key")
        public String key;

        public static ListTagKeysResponseBodyKeysKey build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyKeysKey self = new ListTagKeysResponseBodyKeysKey();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyKeysKey setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTagKeysResponseBodyKeysKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTagKeysResponseBodyKeysKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListTagKeysResponseBodyKeys extends TeaModel {
        @NameInMap("Key")
        public java.util.List<ListTagKeysResponseBodyKeysKey> key;

        public static ListTagKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyKeys self = new ListTagKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyKeys setKey(java.util.List<ListTagKeysResponseBodyKeysKey> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ListTagKeysResponseBodyKeysKey> getKey() {
            return this.key;
        }

    }

}
