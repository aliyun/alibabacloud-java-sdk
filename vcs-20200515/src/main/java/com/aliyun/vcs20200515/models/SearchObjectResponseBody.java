// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchObjectResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static SearchObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectResponseBody self = new SearchObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchObjectResponseBody setData(SearchObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchObjectResponseBodyData getData() {
        return this.data;
    }

    public SearchObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class SearchObjectResponseBodyDataRecords extends TeaModel {
        @NameInMap("DeviceID")
        public String deviceID;

        @NameInMap("CompareResult")
        public String compareResult;

        @NameInMap("RightBtmX")
        public Integer rightBtmX;

        @NameInMap("Score")
        public Float score;

        @NameInMap("SourceImageUrl")
        public String sourceImageUrl;

        @NameInMap("SourceID")
        public String sourceID;

        @NameInMap("RightBtmY")
        public Integer rightBtmY;

        @NameInMap("TargetImageUrl")
        public String targetImageUrl;

        @NameInMap("LeftTopY")
        public Integer leftTopY;

        @NameInMap("TargetImagePath")
        public String targetImagePath;

        @NameInMap("ShotTime")
        public Long shotTime;

        @NameInMap("LeftTopX")
        public Integer leftTopX;

        @NameInMap("SourceImagePath")
        public String sourceImagePath;

        public static SearchObjectResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseBodyDataRecords self = new SearchObjectResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseBodyDataRecords setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseBodyDataRecords setCompareResult(String compareResult) {
            this.compareResult = compareResult;
            return this;
        }
        public String getCompareResult() {
            return this.compareResult;
        }

        public SearchObjectResponseBodyDataRecords setRightBtmX(Integer rightBtmX) {
            this.rightBtmX = rightBtmX;
            return this;
        }
        public Integer getRightBtmX() {
            return this.rightBtmX;
        }

        public SearchObjectResponseBodyDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchObjectResponseBodyDataRecords setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseBodyDataRecords setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public SearchObjectResponseBodyDataRecords setRightBtmY(Integer rightBtmY) {
            this.rightBtmY = rightBtmY;
            return this;
        }
        public Integer getRightBtmY() {
            return this.rightBtmY;
        }

        public SearchObjectResponseBodyDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public SearchObjectResponseBodyDataRecords setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseBodyDataRecords setTargetImagePath(String targetImagePath) {
            this.targetImagePath = targetImagePath;
            return this;
        }
        public String getTargetImagePath() {
            return this.targetImagePath;
        }

        public SearchObjectResponseBodyDataRecords setShotTime(Long shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public Long getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseBodyDataRecords setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseBodyDataRecords setSourceImagePath(String sourceImagePath) {
            this.sourceImagePath = sourceImagePath;
            return this;
        }
        public String getSourceImagePath() {
            return this.sourceImagePath;
        }

    }

    public static class SearchObjectResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<SearchObjectResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseBodyData self = new SearchObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseBodyData setRecords(java.util.List<SearchObjectResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchObjectResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SearchObjectResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public SearchObjectResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchObjectResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchObjectResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
