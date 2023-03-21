// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigRequest extends TeaModel {
    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TargetOperations")
    public String targetOperations;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Type")
    public String type;

    public static OperateCommonTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonTargetConfigRequest self = new OperateCommonTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateCommonTargetConfigRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public OperateCommonTargetConfigRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public OperateCommonTargetConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateCommonTargetConfigRequest setTargetOperations(String targetOperations) {
        this.targetOperations = targetOperations;
        return this;
    }
    public String getTargetOperations() {
        return this.targetOperations;
    }

    public OperateCommonTargetConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public OperateCommonTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
