// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class DelNameListShrinkRequest extends TeaModel {
    @NameInMap("Applicant")
    public String applicant;

    @NameInMap("BpmsUrl")
    public String bpmsUrl;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DataValue")
    public String dataValue;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Type")
    public String type;

    public static DelNameListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DelNameListShrinkRequest self = new DelNameListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DelNameListShrinkRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public DelNameListShrinkRequest setBpmsUrl(String bpmsUrl) {
        this.bpmsUrl = bpmsUrl;
        return this;
    }
    public String getBpmsUrl() {
        return this.bpmsUrl;
    }

    public DelNameListShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DelNameListShrinkRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public DelNameListShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public DelNameListShrinkRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public DelNameListShrinkRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DelNameListShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DelNameListShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
