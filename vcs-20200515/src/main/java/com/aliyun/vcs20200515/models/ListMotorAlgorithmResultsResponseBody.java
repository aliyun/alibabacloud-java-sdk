// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMotorAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListMotorAlgorithmResultsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListMotorAlgorithmResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMotorAlgorithmResultsResponseBody self = new ListMotorAlgorithmResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMotorAlgorithmResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMotorAlgorithmResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMotorAlgorithmResultsResponseBody setData(ListMotorAlgorithmResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMotorAlgorithmResultsResponseBodyData getData() {
        return this.data;
    }

    public ListMotorAlgorithmResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListMotorAlgorithmResultsResponseBodyDataRecords extends TeaModel {
        @NameInMap("MotorClass")
        public String motorClass;

        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("PlateClass")
        public String plateClass;

        @NameInMap("PlateColor")
        public String plateColor;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("SafetyBelt")
        public String safetyBelt;

        @NameInMap("MotorStyle")
        public String motorStyle;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("MotorColor")
        public String motorColor;

        @NameInMap("PlateNumber")
        public String plateNumber;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("Calling")
        public String calling;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        @NameInMap("MotorBrand")
        public String motorBrand;

        @NameInMap("MotorModel")
        public String motorModel;

        @NameInMap("MotorId")
        public String motorId;

        public static ListMotorAlgorithmResultsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMotorAlgorithmResultsResponseBodyDataRecords self = new ListMotorAlgorithmResultsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorClass(String motorClass) {
            this.motorClass = motorClass;
            return this;
        }
        public String getMotorClass() {
            return this.motorClass;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setPlateClass(String plateClass) {
            this.plateClass = plateClass;
            return this;
        }
        public String getPlateClass() {
            return this.plateClass;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setPlateColor(String plateColor) {
            this.plateColor = plateColor;
            return this;
        }
        public String getPlateColor() {
            return this.plateColor;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setSafetyBelt(String safetyBelt) {
            this.safetyBelt = safetyBelt;
            return this;
        }
        public String getSafetyBelt() {
            return this.safetyBelt;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorStyle(String motorStyle) {
            this.motorStyle = motorStyle;
            return this;
        }
        public String getMotorStyle() {
            return this.motorStyle;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorColor(String motorColor) {
            this.motorColor = motorColor;
            return this;
        }
        public String getMotorColor() {
            return this.motorColor;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setCalling(String calling) {
            this.calling = calling;
            return this;
        }
        public String getCalling() {
            return this.calling;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorBrand(String motorBrand) {
            this.motorBrand = motorBrand;
            return this;
        }
        public String getMotorBrand() {
            return this.motorBrand;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorModel(String motorModel) {
            this.motorModel = motorModel;
            return this;
        }
        public String getMotorModel() {
            return this.motorModel;
        }

        public ListMotorAlgorithmResultsResponseBodyDataRecords setMotorId(String motorId) {
            this.motorId = motorId;
            return this;
        }
        public String getMotorId() {
            return this.motorId;
        }

    }

    public static class ListMotorAlgorithmResultsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ListMotorAlgorithmResultsResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMotorAlgorithmResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMotorAlgorithmResultsResponseBodyData self = new ListMotorAlgorithmResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMotorAlgorithmResultsResponseBodyData setRecords(java.util.List<ListMotorAlgorithmResultsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListMotorAlgorithmResultsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListMotorAlgorithmResultsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListMotorAlgorithmResultsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMotorAlgorithmResultsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMotorAlgorithmResultsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
