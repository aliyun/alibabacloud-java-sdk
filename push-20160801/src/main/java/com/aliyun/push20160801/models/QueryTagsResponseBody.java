// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D68AE5C6-8AAF-46C9-B627-3FDACD1A4168</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagInfos")
    public QueryTagsResponseBodyTagInfos tagInfos;

    public static QueryTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagsResponseBody self = new QueryTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagsResponseBody setTagInfos(QueryTagsResponseBodyTagInfos tagInfos) {
        this.tagInfos = tagInfos;
        return this;
    }
    public QueryTagsResponseBodyTagInfos getTagInfos() {
        return this.tagInfos;
    }

    public static class QueryTagsResponseBodyTagInfosTagInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_tag2</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static QueryTagsResponseBodyTagInfosTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTagsResponseBodyTagInfosTagInfo self = new QueryTagsResponseBodyTagInfosTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryTagsResponseBodyTagInfosTagInfo setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class QueryTagsResponseBodyTagInfos extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<QueryTagsResponseBodyTagInfosTagInfo> tagInfo;

        public static QueryTagsResponseBodyTagInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryTagsResponseBodyTagInfos self = new QueryTagsResponseBodyTagInfos();
            return TeaModel.build(map, self);
        }

        public QueryTagsResponseBodyTagInfos setTagInfo(java.util.List<QueryTagsResponseBodyTagInfosTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<QueryTagsResponseBodyTagInfosTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

}
