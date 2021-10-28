// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class UpdateNameListRequest extends TeaModel {
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

    public static UpdateNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNameListRequest self = new UpdateNameListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNameListRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public UpdateNameListRequest setBpmsUrl(String bpmsUrl) {
        this.bpmsUrl = bpmsUrl;
        return this;
    }
    public String getBpmsUrl() {
        return this.bpmsUrl;
    }

    public UpdateNameListRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UpdateNameListRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public UpdateNameListRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public UpdateNameListRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public UpdateNameListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateNameListRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateNameListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
