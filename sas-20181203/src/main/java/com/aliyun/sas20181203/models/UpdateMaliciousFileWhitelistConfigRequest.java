// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMaliciousFileWhitelistConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

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

    public static UpdateMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaliciousFileWhitelistConfigRequest self = new UpdateMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaliciousFileWhitelistConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateMaliciousFileWhitelistConfigRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
