// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagInfos")
    public ListTagsResponseBodyTagInfos tagInfos;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListTagsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
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

    public ListTagsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagsResponseBodyTagInfosTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagsResponseBodyTagInfosTagInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagInfosTagInfo self = new ListTagsResponseBodyTagInfosTagInfo();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagInfosTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagsResponseBodyTagInfosTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
