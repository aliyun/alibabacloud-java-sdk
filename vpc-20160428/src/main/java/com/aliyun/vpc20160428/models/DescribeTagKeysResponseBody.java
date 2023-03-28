// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tag keys.</p>
     */
    @NameInMap("TagKeys")
    public DescribeTagKeysResponseBodyTagKeys tagKeys;

    public static DescribeTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysResponseBody self = new DescribeTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagKeysResponseBody setTagKeys(DescribeTagKeysResponseBodyTagKeys tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public DescribeTagKeysResponseBodyTagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static class DescribeTagKeysResponseBodyTagKeysTagKey extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The type of the tag key. Valid values:</p>
         * <br>
         * <p>*   **Custom**: custom</p>
         * <p>*   **System**: system</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeTagKeysResponseBodyTagKeysTagKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeysResponseBodyTagKeysTagKey self = new DescribeTagKeysResponseBodyTagKeysTagKey();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeysResponseBodyTagKeysTagKey setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagKeysResponseBodyTagKeysTagKey setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTagKeysResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagKey")
        public java.util.List<DescribeTagKeysResponseBodyTagKeysTagKey> tagKey;

        public static DescribeTagKeysResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeysResponseBodyTagKeys self = new DescribeTagKeysResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeysResponseBodyTagKeys setTagKey(java.util.List<DescribeTagKeysResponseBodyTagKeysTagKey> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public java.util.List<DescribeTagKeysResponseBodyTagKeysTagKey> getTagKey() {
            return this.tagKey;
        }

    }

}
