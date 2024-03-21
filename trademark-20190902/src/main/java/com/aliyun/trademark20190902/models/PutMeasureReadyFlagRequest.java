// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class PutMeasureReadyFlagRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ReadyFlag")
    public String readyFlag;

    @NameInMap("StartTime")
    public String startTime;

    public static PutMeasureReadyFlagRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureReadyFlagRequest self = new PutMeasureReadyFlagRequest();
        return TeaModel.build(map, self);
    }

    public PutMeasureReadyFlagRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PutMeasureReadyFlagRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutMeasureReadyFlagRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PutMeasureReadyFlagRequest setReadyFlag(String readyFlag) {
        this.readyFlag = readyFlag;
        return this;
    }
    public String getReadyFlag() {
        return this.readyFlag;
    }

    public PutMeasureReadyFlagRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
