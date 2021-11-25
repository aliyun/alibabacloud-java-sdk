// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMotorAlgorithmResultsRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PlateNumber")
    public String plateNumber;

    @NameInMap("StartTime")
    public String startTime;

    public static ListMotorAlgorithmResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMotorAlgorithmResultsRequest self = new ListMotorAlgorithmResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListMotorAlgorithmResultsRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public ListMotorAlgorithmResultsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListMotorAlgorithmResultsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListMotorAlgorithmResultsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMotorAlgorithmResultsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListMotorAlgorithmResultsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListMotorAlgorithmResultsRequest setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }
    public String getPlateNumber() {
        return this.plateNumber;
    }

    public ListMotorAlgorithmResultsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
