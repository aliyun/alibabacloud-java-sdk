// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class DelNameListRequest extends TeaModel {
    @NameInMap("Applicant")
    public String applicant;

    @NameInMap("BpmsUrl")
    public String bpmsUrl;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Type")
    public String type;

    public static DelNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DelNameListRequest self = new DelNameListRequest();
        return TeaModel.build(map, self);
    }

    public DelNameListRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public DelNameListRequest setBpmsUrl(String bpmsUrl) {
        this.bpmsUrl = bpmsUrl;
        return this;
    }
    public String getBpmsUrl() {
        return this.bpmsUrl;
    }

    public DelNameListRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DelNameListRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public DelNameListRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public DelNameListRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public DelNameListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DelNameListRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DelNameListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
