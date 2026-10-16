// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a next query token is available. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, that is, <code>&quot;NextToken&quot;: &quot;&quot;</code>, no additional results exist.</li>
     * <li>If NextToken has a value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC09A6AA-2713-4E10-A2E9-E6C5C43A8842</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag key information.</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
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
