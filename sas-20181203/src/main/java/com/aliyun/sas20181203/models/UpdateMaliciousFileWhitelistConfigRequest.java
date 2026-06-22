// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The rule ID. This parameter is optional. If you do not specify this parameter, a whitelist rule is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The alerting name. Valid values:</p>
     * <ul>
     * <li>ALL: all Alarm Metric.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The field to be whitelisted.</p>
     * 
     * <strong>example:</strong>
     * <p>fileMd5</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The value of the field to be whitelisted.</p>
     * 
     * <strong>example:</strong>
     * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The operator used for rule matching. Valid values:</p>
     * <ul>
     * <li>strEqual: string equals.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>strEqual</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The business source. Valid values:</p>
     * <ul>
     * <li>agentless: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the target scope. Valid values:</p>
     * <ul>
     * <li>ALL: all assets</li>
     * <li>SELECTION_KEY: assets selected by using the asset selection component.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The target scope. Valid values:</p>
     * <ul>
     * <li>ALL: all assets</li>
     * <li>Other values: the key of the asset scope selected by using the asset selection component.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
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

    public UpdateMaliciousFileWhitelistConfigRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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
