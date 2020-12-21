// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchBodyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchBodyResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static SearchBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyResponseBody self = new SearchBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchBodyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchBodyResponseBody setData(SearchBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchBodyResponseBodyData getData() {
        return this.data;
    }

    public SearchBodyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class SearchBodyResponseBodyDataRecords extends TeaModel {
        @NameInMap("GbId")
        public String gbId;

        @NameInMap("TargetImageUrl")
        public String targetImageUrl;

        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("Score")
        public Float score;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        public static SearchBodyResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyResponseBodyDataRecords self = new SearchBodyResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchBodyResponseBodyDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public SearchBodyResponseBodyDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public SearchBodyResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchBodyResponseBodyDataRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public SearchBodyResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public SearchBodyResponseBodyDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchBodyResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public SearchBodyResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

    }

    public static class SearchBodyResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<SearchBodyResponseBodyDataRecords> records;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyResponseBodyData self = new SearchBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchBodyResponseBodyData setRecords(java.util.List<SearchBodyResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchBodyResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SearchBodyResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public SearchBodyResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public SearchBodyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchBodyResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
