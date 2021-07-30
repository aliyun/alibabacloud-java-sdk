// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagInfos")
    public ListTagsResponseBodyTagInfos tagInfos;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setTagInfos(ListTagsResponseBodyTagInfos tagInfos) {
        this.tagInfos = tagInfos;
        return this;
    }
    public ListTagsResponseBodyTagInfos getTagInfos() {
        return this.tagInfos;
    }

    public static class ListTagsResponseBodyTagInfosTagInfo extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        public static ListTagsResponseBodyTagInfosTagInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagInfosTagInfo self = new ListTagsResponseBodyTagInfosTagInfo();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagInfosTagInfo setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListTagsResponseBodyTagInfos extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<ListTagsResponseBodyTagInfosTagInfo> tagInfo;

        public static ListTagsResponseBodyTagInfos build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagInfos self = new ListTagsResponseBodyTagInfos();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagInfos setTagInfo(java.util.List<ListTagsResponseBodyTagInfosTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<ListTagsResponseBodyTagInfosTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

}
