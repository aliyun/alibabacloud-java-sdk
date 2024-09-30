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
     * <ul>
     * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC09A6AA-2713-4E10-A2E9-E6C5C43A8842</p>
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
         * <ul>
         * <li>custom</li>
         * <li>system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Business team</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
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
