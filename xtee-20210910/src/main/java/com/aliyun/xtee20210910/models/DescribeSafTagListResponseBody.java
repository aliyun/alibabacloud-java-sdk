// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafTagListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeSafTagListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSafTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafTagListResponseBody self = new DescribeSafTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafTagListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSafTagListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSafTagListResponseBody setResultObject(java.util.List<DescribeSafTagListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSafTagListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSafTagListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSafTagListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSafTagListResponseBodyResultObject extends TeaModel {
        @NameInMap("tagDesc")
        public String tagDesc;

        @NameInMap("tagMean")
        public String tagMean;

        @NameInMap("tagName")
        public String tagName;

        @NameInMap("tagState")
        public String tagState;

        @NameInMap("tagType")
        public String tagType;

        @NameInMap("tagUid")
        public String tagUid;

        @NameInMap("updateTime")
        public String updateTime;

        public static DescribeSafTagListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafTagListResponseBodyResultObject self = new DescribeSafTagListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafTagListResponseBodyResultObject setTagDesc(String tagDesc) {
            this.tagDesc = tagDesc;
            return this;
        }
        public String getTagDesc() {
            return this.tagDesc;
        }

        public DescribeSafTagListResponseBodyResultObject setTagMean(String tagMean) {
            this.tagMean = tagMean;
            return this;
        }
        public String getTagMean() {
            return this.tagMean;
        }

        public DescribeSafTagListResponseBodyResultObject setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public DescribeSafTagListResponseBodyResultObject setTagState(String tagState) {
            this.tagState = tagState;
            return this;
        }
        public String getTagState() {
            return this.tagState;
        }

        public DescribeSafTagListResponseBodyResultObject setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

        public DescribeSafTagListResponseBodyResultObject setTagUid(String tagUid) {
            this.tagUid = tagUid;
            return this;
        }
        public String getTagUid() {
            return this.tagUid;
        }

        public DescribeSafTagListResponseBodyResultObject setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
