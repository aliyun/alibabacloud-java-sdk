// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist rule. If you do not specify this parameter, a whitelist rule is created.</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The name of the alert.</p>
     * <br>
     * <p>*   Set the value to ALL, which indicates all alert types.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The field that you want to use in the whitelist rule.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The value of the field that you want to use in the whitelist rule.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The logical operator that you want to use in the whitelist rule.</p>
     * <br>
     * <p>*   Set the value to strEqual, which indicates the equality operator (=).</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The feature to which this operation belongs.</p>
     * <br>
     * <p>*   Set the value to agentless, which indicates the agentless detection feature.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the assets on which you want the whitelist rule to take effect. Valid values:</p>
     * <br>
     * <p>*   ALL: all assets</p>
     * <p>*   SELECTION_KEY: selected assets</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The assets on which you want the whitelist rule to take effect. Valid values:</p>
     * <br>
     * <p>*   ALL: all assets</p>
     * <p>*   Others: selected assets</p>
     */
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
