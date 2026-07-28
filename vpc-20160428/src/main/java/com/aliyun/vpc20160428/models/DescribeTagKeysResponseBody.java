// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponseBody extends TeaModel {
    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE65F6B7-7566-4802-9007-96F2494AC512</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("TagKey")
        public String tagKey;

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
