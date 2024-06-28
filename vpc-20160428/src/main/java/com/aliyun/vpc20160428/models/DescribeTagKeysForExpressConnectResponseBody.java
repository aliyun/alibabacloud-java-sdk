// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagKeysForExpressConnectResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
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
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag keys.</p>
     */
    @NameInMap("TagKeys")
    public DescribeTagKeysForExpressConnectResponseBodyTagKeys tagKeys;

    public static DescribeTagKeysForExpressConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysForExpressConnectResponseBody self = new DescribeTagKeysForExpressConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysForExpressConnectResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagKeysForExpressConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagKeysForExpressConnectResponseBody setTagKeys(DescribeTagKeysForExpressConnectResponseBodyTagKeys tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public DescribeTagKeysForExpressConnectResponseBodyTagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static class DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The type of the resource. The value is set to <strong>PHYSICALCONNECTION</strong>, which indicates an Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey self = new DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTagKeysForExpressConnectResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagKey")
        public java.util.List<DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey> tagKey;

        public static DescribeTagKeysForExpressConnectResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeysForExpressConnectResponseBodyTagKeys self = new DescribeTagKeysForExpressConnectResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeysForExpressConnectResponseBodyTagKeys setTagKey(java.util.List<DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public java.util.List<DescribeTagKeysForExpressConnectResponseBodyTagKeysTagKey> getTagKey() {
            return this.tagKey;
        }

    }

}
