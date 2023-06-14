// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    /**
     * <p>The information of the tag keys.</p>
     */
    @NameInMap("Keys")
    public ListTagKeysResponseBodyKeys keys;

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
        /**
         * <p>The type of the resource tag. Valid values:</p>
         * <br>
         * <p>*   custom</p>
         * <p>*   system</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the tag key.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         */
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
