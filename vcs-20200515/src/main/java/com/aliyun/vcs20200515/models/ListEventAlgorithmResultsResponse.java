// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmResultsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExtendValue")
    @Validation(required = true)
    public String extendValue;

    @NameInMap("Data")
    @Validation(required = true)
    public ListEventAlgorithmResultsResponseData data;

    public static ListEventAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmResultsResponse self = new ListEventAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventAlgorithmResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventAlgorithmResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventAlgorithmResultsResponse setExtendValue(String extendValue) {
        this.extendValue = extendValue;
        return this;
    }
    public String getExtendValue() {
        return this.extendValue;
    }

    public ListEventAlgorithmResultsResponse setData(ListEventAlgorithmResultsResponseData data) {
        this.data = data;
        return this;
    }
    public ListEventAlgorithmResultsResponseData getData() {
        return this.data;
    }

    public static class ListEventAlgorithmResultsResponseDataRecords extends TeaModel {
        @NameInMap("CapStyle")
        @Validation(required = true)
        public String capStyle;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("FaceCount")
        @Validation(required = true)
        public String faceCount;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("ExtendValue")
        @Validation(required = true)
        public String extendValue;

        @NameInMap("ExtendValueTwo")
        @Validation(required = true)
        public String extendValueTwo;

        @NameInMap("ExtendValueThree")
        @Validation(required = true)
        public String extendValueThree;

        public static ListEventAlgorithmResultsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmResultsResponseDataRecords self = new ListEventAlgorithmResultsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmResultsResponseDataRecords setCapStyle(String capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public String getCapStyle() {
            return this.capStyle;
        }

        public ListEventAlgorithmResultsResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListEventAlgorithmResultsResponseDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListEventAlgorithmResultsResponseDataRecords setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventAlgorithmResultsResponseDataRecords setFaceCount(String faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public String getFaceCount() {
            return this.faceCount;
        }

        public ListEventAlgorithmResultsResponseDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListEventAlgorithmResultsResponseDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListEventAlgorithmResultsResponseDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListEventAlgorithmResultsResponseDataRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListEventAlgorithmResultsResponseDataRecords setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public ListEventAlgorithmResultsResponseDataRecords setExtendValueTwo(String extendValueTwo) {
            this.extendValueTwo = extendValueTwo;
            return this;
        }
        public String getExtendValueTwo() {
            return this.extendValueTwo;
        }

        public ListEventAlgorithmResultsResponseDataRecords setExtendValueThree(String extendValueThree) {
            this.extendValueThree = extendValueThree;
            return this;
        }
        public String getExtendValueThree() {
            return this.extendValueThree;
        }

    }

    public static class ListEventAlgorithmResultsResponseData extends TeaModel {
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
        public java.util.List<ListEventAlgorithmResultsResponseDataRecords> records;

        public static ListEventAlgorithmResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmResultsResponseData self = new ListEventAlgorithmResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmResultsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEventAlgorithmResultsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEventAlgorithmResultsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListEventAlgorithmResultsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListEventAlgorithmResultsResponseData setRecords(java.util.List<ListEventAlgorithmResultsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListEventAlgorithmResultsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
