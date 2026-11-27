// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTagValuesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a token for the next query is available based on the NextToken value. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, such as <code>&quot;NextToken&quot;: &quot;&quot;</code>, no next token is available.</li>
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
     * <p>The tag value information.</p>
     */
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
        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
