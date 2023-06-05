// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchTargetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchTargetResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTargetResponseBody self = new SearchTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTargetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchTargetResponseBody setData(SearchTargetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchTargetResponseBodyData getData() {
        return this.data;
    }

    public SearchTargetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTargetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTargetResponseBodyDataRecords extends TeaModel {
        @NameInMap("DataDetail")
        public String dataDetail;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("LeftTopX")
        public Long leftTopX;

        @NameInMap("LeftTopY")
        public Long leftTopY;

        @NameInMap("RightBottomX")
        public Long rightBottomX;

        @NameInMap("RightBottomY")
        public Long rightBottomY;

        @NameInMap("SourceImageFullUrl")
        public String sourceImageFullUrl;

        @NameInMap("SourceImageUrl")
        public String sourceImageUrl;

        @NameInMap("TargetAttributes")
        public String targetAttributes;

        @NameInMap("TargetImageFullUrl")
        public String targetImageFullUrl;

        @NameInMap("TargetImageSimilarity")
        public Double targetImageSimilarity;

        @NameInMap("TargetImageUrl")
        public String targetImageUrl;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Timestamp")
        public String timestamp;

        public static SearchTargetResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchTargetResponseBodyDataRecords self = new SearchTargetResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchTargetResponseBodyDataRecords setDataDetail(String dataDetail) {
            this.dataDetail = dataDetail;
            return this;
        }
        public String getDataDetail() {
            return this.dataDetail;
        }

        public SearchTargetResponseBodyDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public SearchTargetResponseBodyDataRecords setLeftTopX(Long leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Long getLeftTopX() {
            return this.leftTopX;
        }

        public SearchTargetResponseBodyDataRecords setLeftTopY(Long leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Long getLeftTopY() {
            return this.leftTopY;
        }

        public SearchTargetResponseBodyDataRecords setRightBottomX(Long rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Long getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchTargetResponseBodyDataRecords setRightBottomY(Long rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Long getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchTargetResponseBodyDataRecords setSourceImageFullUrl(String sourceImageFullUrl) {
            this.sourceImageFullUrl = sourceImageFullUrl;
            return this;
        }
        public String getSourceImageFullUrl() {
            return this.sourceImageFullUrl;
        }

        public SearchTargetResponseBodyDataRecords setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchTargetResponseBodyDataRecords setTargetAttributes(String targetAttributes) {
            this.targetAttributes = targetAttributes;
            return this;
        }
        public String getTargetAttributes() {
            return this.targetAttributes;
        }

        public SearchTargetResponseBodyDataRecords setTargetImageFullUrl(String targetImageFullUrl) {
            this.targetImageFullUrl = targetImageFullUrl;
            return this;
        }
        public String getTargetImageFullUrl() {
            return this.targetImageFullUrl;
        }

        public SearchTargetResponseBodyDataRecords setTargetImageSimilarity(Double targetImageSimilarity) {
            this.targetImageSimilarity = targetImageSimilarity;
            return this;
        }
        public Double getTargetImageSimilarity() {
            return this.targetImageSimilarity;
        }

        public SearchTargetResponseBodyDataRecords setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public SearchTargetResponseBodyDataRecords setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public SearchTargetResponseBodyDataRecords setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SearchTargetResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<SearchTargetResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTargetResponseBodyData self = new SearchTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTargetResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public SearchTargetResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SearchTargetResponseBodyData setRecords(java.util.List<SearchTargetResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchTargetResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SearchTargetResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
