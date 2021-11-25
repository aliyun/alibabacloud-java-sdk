// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchFaceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponseBody self = new SearchFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchFaceResponseBody setData(SearchFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseBodyData getData() {
        return this.data;
    }

    public SearchFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchFaceResponseBodyDataRecords extends TeaModel {
        @NameInMap("GbId")
        public String gbId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("MatchSuggestion")
        public String matchSuggestion;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("Score")
        public Float score;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("TargetImageUrl")
        public String targetImageUrl;

        public static SearchFaceResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyDataRecords self = new SearchFaceResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public SearchFaceResponseBodyDataRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public SearchFaceResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public SearchFaceResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public SearchFaceResponseBodyDataRecords setMatchSuggestion(String matchSuggestion) {
            this.matchSuggestion = matchSuggestion;
            return this;
        }
        public String getMatchSuggestion() {
            return this.matchSuggestion;
        }

        public SearchFaceResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchFaceResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchFaceResponseBodyDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchFaceResponseBodyDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public SearchFaceResponseBodyDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchFaceResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<SearchFaceResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static SearchFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseBodyData self = new SearchFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public SearchFaceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchFaceResponseBodyData setRecords(java.util.List<SearchFaceResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchFaceResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SearchFaceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchFaceResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
