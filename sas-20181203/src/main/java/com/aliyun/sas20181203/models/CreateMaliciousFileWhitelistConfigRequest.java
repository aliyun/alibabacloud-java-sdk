// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>Alert name:</p>
     * <ul>
     * <li>ALL: All alerts</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>Field used for whitelist in sensitive file alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>fileMd5</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>Expected value of the field to be whitelisted.</p>
     * 
     * <strong>example:</strong>
     * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>Rule judgment operator:</p>
     * <ul>
     * <li>strEqual: String equals</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>strEqual</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Business source:</p>
     * <ul>
     * <li>agentless: Agentless detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Effective target type:</p>
     * <ul>
     * <li>ALL: All assets</li>
     * <li>SELECTION_KEY: Assets selected via the asset selection component</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>Target effective scope:</p>
     * <ul>
     * <li>ALL: All assets</li>
     * <li>Other: Key of the asset range selected by the asset selection component</li>
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
