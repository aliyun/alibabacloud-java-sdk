// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrRepoTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TagList")
    public ListAKSAcrRepoTagResponseBodyTagList tagList;

    public static ListAKSAcrRepoTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrRepoTagResponseBody self = new ListAKSAcrRepoTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrRepoTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSAcrRepoTagResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSAcrRepoTagResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSAcrRepoTagResponseBody setTagList(ListAKSAcrRepoTagResponseBodyTagList tagList) {
        this.tagList = tagList;
        return this;
    }
    public ListAKSAcrRepoTagResponseBodyTagList getTagList() {
        return this.tagList;
    }

    public static class ListAKSAcrRepoTagResponseBodyTagListTags extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("ImageCreate")
        public Long imageCreate;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public Long imageSize;

        @NameInMap("ImageUpdate")
        public Long imageUpdate;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

        public static ListAKSAcrRepoTagResponseBodyTagListTags build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrRepoTagResponseBodyTagListTags self = new ListAKSAcrRepoTagResponseBodyTagListTags();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setImageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public Long getImageCreate() {
            return this.imageCreate;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setImageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Long getImageSize() {
            return this.imageSize;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setImageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public Long getImageUpdate() {
            return this.imageUpdate;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAKSAcrRepoTagResponseBodyTagListTags setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListAKSAcrRepoTagResponseBodyTagList extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Tags")
        public java.util.List<ListAKSAcrRepoTagResponseBodyTagListTags> tags;

        public static ListAKSAcrRepoTagResponseBodyTagList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrRepoTagResponseBodyTagList self = new ListAKSAcrRepoTagResponseBodyTagList();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrRepoTagResponseBodyTagList setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAKSAcrRepoTagResponseBodyTagList setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAKSAcrRepoTagResponseBodyTagList setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListAKSAcrRepoTagResponseBodyTagList setTags(java.util.List<ListAKSAcrRepoTagResponseBodyTagListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAKSAcrRepoTagResponseBodyTagListTags> getTags() {
            return this.tags;
        }

    }

}
