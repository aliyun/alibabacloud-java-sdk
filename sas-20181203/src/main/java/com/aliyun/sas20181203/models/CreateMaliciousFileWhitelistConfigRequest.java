// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The name of the alert.</p>
     * <ul>
     * <li>Set the value to ALL, which indicates all alert types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The field that you want to use in the whitelist rule.</p>
     * 
     * <strong>example:</strong>
     * <p>fileMd5</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The value of the field that you want to use in the whitelist rule.</p>
     * 
     * <strong>example:</strong>
     * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The logical operator that you want to use in the whitelist rule.</p>
     * <ul>
     * <li>Set the value to strEqual, which indicates the equality operator (=).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>strEqual</p>
     */
    @NameInMap("Operator")
    public String operator;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The feature to which this operation belongs.</p>
     * <ul>
     * <li>Set the value to agentless, which indicates the agentless detection feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the assets on which you want the whitelist rule to take effect. Valid values:</p>
     * <ul>
     * <li>ALL: all assets</li>
     * <li>SELECTION_KEY: selected assets</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The assets on which you want the whitelist rule to take effect. Valid values:</p>
     * <ul>
     * <li>ALL: all assets</li>
     * <li>Others: selected assets</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
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

    public CreateMaliciousFileWhitelistConfigRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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
