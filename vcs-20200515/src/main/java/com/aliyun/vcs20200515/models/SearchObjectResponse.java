// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectResponse extends TeaModel {
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
    public SearchObjectResponseData data;

    public static SearchObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectResponse self = new SearchObjectResponse();
        return TeaModel.build(map, self);
    }

    public SearchObjectResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchObjectResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchObjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchObjectResponse setData(SearchObjectResponseData data) {
        this.data = data;
        return this;
    }
    public SearchObjectResponseData getData() {
        return this.data;
    }

    public static class SearchObjectResponseDataRecords extends TeaModel {
        @NameInMap("CompareResult")
        @Validation(required = true)
        public String compareResult;

        @NameInMap("DeviceID")
        @Validation(required = true)
        public String deviceID;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public Long shotTime;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBtmX")
        @Validation(required = true)
        public Integer rightBtmX;

        @NameInMap("RightBtmY")
        @Validation(required = true)
        public Integer rightBtmY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("SourceID")
        @Validation(required = true)
        public String sourceID;

        @NameInMap("SourceImagePath")
        @Validation(required = true)
        public String sourceImagePath;

        @NameInMap("SourceImageUrl")
        @Validation(required = true)
        public String sourceImageUrl;

        @NameInMap("TargetImagePath")
        @Validation(required = true)
        public String targetImagePath;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchObjectResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseDataRecords self = new SearchObjectResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseDataRecords setCompareResult(String compareResult) {
            this.compareResult = compareResult;
            return this;
        }
        public String getCompareResult() {
            return this.compareResult;
        }

        public SearchObjectResponseDataRecords setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseDataRecords setShotTime(Long shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public Long getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseDataRecords setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseDataRecords setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseDataRecords setRightBtmX(Integer rightBtmX) {
            this.rightBtmX = rightBtmX;
            return this;
        }
        public Integer getRightBtmX() {
            return this.rightBtmX;
        }

        public SearchObjectResponseDataRecords setRightBtmY(Integer rightBtmY) {
            this.rightBtmY = rightBtmY;
            return this;
        }
        public Integer getRightBtmY() {
            return this.rightBtmY;
        }

        public SearchObjectResponseDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchObjectResponseDataRecords setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public SearchObjectResponseDataRecords setSourceImagePath(String sourceImagePath) {
            this.sourceImagePath = sourceImagePath;
            return this;
        }
        public String getSourceImagePath() {
            return this.sourceImagePath;
        }

        public SearchObjectResponseDataRecords setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseDataRecords setTargetImagePath(String targetImagePath) {
            this.targetImagePath = targetImagePath;
            return this;
        }
        public String getTargetImagePath() {
            return this.targetImagePath;
        }

        public SearchObjectResponseDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchObjectResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

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
        public java.util.List<SearchObjectResponseDataRecords> records;

        public static SearchObjectResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseData self = new SearchObjectResponseData();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchObjectResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchObjectResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchObjectResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public SearchObjectResponseData setRecords(java.util.List<SearchObjectResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchObjectResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
