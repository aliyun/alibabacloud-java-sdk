// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTagValuesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the next query is required.</p>
     * <ul>
     * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
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

    /**
     * <p>The information of the tag values.</p>
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
