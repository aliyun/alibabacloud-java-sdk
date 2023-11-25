// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousFileWhitelistConfigRequest extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("Field")
    public String field;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Source")
    public String source;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetValue")
    public String targetValue;

    public static CreateMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaliciousFileWhitelistConfigRequest self = new CreateMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaliciousFileWhitelistConfigRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateMaliciousFileWhitelistConfigRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public CreateMaliciousFileWhitelistConfigRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public CreateMaliciousFileWhitelistConfigRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateMaliciousFileWhitelistConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateMaliciousFileWhitelistConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateMaliciousFileWhitelistConfigRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
