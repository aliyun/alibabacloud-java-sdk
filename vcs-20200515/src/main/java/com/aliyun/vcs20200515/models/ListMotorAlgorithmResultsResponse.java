// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMotorAlgorithmResultsResponse extends TeaModel {
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
    public ListMotorAlgorithmResultsResponseData data;

    public static ListMotorAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMotorAlgorithmResultsResponse self = new ListMotorAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListMotorAlgorithmResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMotorAlgorithmResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMotorAlgorithmResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMotorAlgorithmResultsResponse setData(ListMotorAlgorithmResultsResponseData data) {
        this.data = data;
        return this;
    }
    public ListMotorAlgorithmResultsResponseData getData() {
        return this.data;
    }

    public static class ListMotorAlgorithmResultsResponseDataRecords extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Float leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Float leftTopY;

        @NameInMap("MotorId")
        @Validation(required = true)
        public String motorId;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("PlateNumber")
        @Validation(required = true)
        public String plateNumber;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Float rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Float rightBottomY;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        @NameInMap("MotorStyle")
        @Validation(required = true)
        public String motorStyle;

        @NameInMap("MotorModel")
        @Validation(required = true)
        public String motorModel;

        @NameInMap("MotorColor")
        @Validation(required = true)
        public String motorColor;

        @NameInMap("MotorClass")
        @Validation(required = true)
        public String motorClass;

        @NameInMap("MotorBrand")
        @Validation(required = true)
        public String motorBrand;

        @NameInMap("PlateColor")
        @Validation(required = true)
        public String plateColor;

        @NameInMap("PlateClass")
        @Validation(required = true)
        public String plateClass;

        @NameInMap("SafetyBelt")
        @Validation(required = true)
        public String safetyBelt;

        @NameInMap("Calling")
        @Validation(required = true)
        public String calling;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        public static ListMotorAlgorithmResultsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMotorAlgorithmResultsResponseDataRecords self = new ListMotorAlgorithmResultsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListMotorAlgorithmResultsResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorId(String motorId) {
            this.motorId = motorId;
            return this;
        }
        public String getMotorId() {
            return this.motorId;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorStyle(String motorStyle) {
            this.motorStyle = motorStyle;
            return this;
        }
        public String getMotorStyle() {
            return this.motorStyle;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorModel(String motorModel) {
            this.motorModel = motorModel;
            return this;
        }
        public String getMotorModel() {
            return this.motorModel;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorColor(String motorColor) {
            this.motorColor = motorColor;
            return this;
        }
        public String getMotorColor() {
            return this.motorColor;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorClass(String motorClass) {
            this.motorClass = motorClass;
            return this;
        }
        public String getMotorClass() {
            return this.motorClass;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setMotorBrand(String motorBrand) {
            this.motorBrand = motorBrand;
            return this;
        }
        public String getMotorBrand() {
            return this.motorBrand;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setPlateColor(String plateColor) {
            this.plateColor = plateColor;
            return this;
        }
        public String getPlateColor() {
            return this.plateColor;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setPlateClass(String plateClass) {
            this.plateClass = plateClass;
            return this;
        }
        public String getPlateClass() {
            return this.plateClass;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setSafetyBelt(String safetyBelt) {
            this.safetyBelt = safetyBelt;
            return this;
        }
        public String getSafetyBelt() {
            return this.safetyBelt;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setCalling(String calling) {
            this.calling = calling;
            return this;
        }
        public String getCalling() {
            return this.calling;
        }

        public ListMotorAlgorithmResultsResponseDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class ListMotorAlgorithmResultsResponseData extends TeaModel {
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
        public java.util.List<ListMotorAlgorithmResultsResponseDataRecords> records;

        public static ListMotorAlgorithmResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListMotorAlgorithmResultsResponseData self = new ListMotorAlgorithmResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListMotorAlgorithmResultsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMotorAlgorithmResultsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMotorAlgorithmResultsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMotorAlgorithmResultsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListMotorAlgorithmResultsResponseData setRecords(java.util.List<ListMotorAlgorithmResultsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListMotorAlgorithmResultsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
