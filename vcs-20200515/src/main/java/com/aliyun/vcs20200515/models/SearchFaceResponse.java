// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchFaceResponseData data;

    public static SearchFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponse self = new SearchFaceResponse();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchFaceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFaceResponse setData(SearchFaceResponseData data) {
        this.data = data;
        return this;
    }
    public SearchFaceResponseData getData() {
        return this.data;
    }

    public static class SearchFaceResponseDataRecords extends TeaModel {
        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Float leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Float leftTopY;

        @NameInMap("MatchSuggestion")
        @Validation(required = true)
        public String matchSuggestion;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Float rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        public static SearchFaceResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseDataRecords self = new SearchFaceResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public SearchFaceResponseDataRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public SearchFaceResponseDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public SearchFaceResponseDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public SearchFaceResponseDataRecords setMatchSuggestion(String matchSuggestion) {
            this.matchSuggestion = matchSuggestion;
            return this;
        }
        public String getMatchSuggestion() {
            return this.matchSuggestion;
        }

        public SearchFaceResponseDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchFaceResponseDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchFaceResponseDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchFaceResponseDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public SearchFaceResponseDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class SearchFaceResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<SearchFaceResponseDataRecords> records;

        public static SearchFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseData self = new SearchFaceResponseData();
            return TeaModel.build(map, self);
        }

        public SearchFaceResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public SearchFaceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchFaceResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchFaceResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public SearchFaceResponseData setRecords(java.util.List<SearchFaceResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchFaceResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
