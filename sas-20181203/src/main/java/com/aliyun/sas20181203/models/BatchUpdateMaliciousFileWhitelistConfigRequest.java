// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchUpdateMaliciousFileWhitelistConfigRequest extends TeaModel {
    /**
     * <p>The list of whitelist rules for sensitive file alerts in agentless detection.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<BatchUpdateMaliciousFileWhitelistConfigRequestConfigList> configList;

    public static BatchUpdateMaliciousFileWhitelistConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateMaliciousFileWhitelistConfigRequest self = new BatchUpdateMaliciousFileWhitelistConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateMaliciousFileWhitelistConfigRequest setConfigList(java.util.List<BatchUpdateMaliciousFileWhitelistConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<BatchUpdateMaliciousFileWhitelistConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public static class BatchUpdateMaliciousFileWhitelistConfigRequestConfigList extends TeaModel {
        /**
         * <p>The ID of the whitelist rule for sensitive file alerts in agentless detection. This parameter is optional. If you do not specify this parameter, a new rule is created. You can call the <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> operation to obtain the ID of the whitelist rule for sensitive files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The alerting name. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: all Alarm Metrics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The field used to determine the whitelist for sensitive file alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>fileMd5</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The expected field value to be whitelisted.</p>
         * 
         * <strong>example:</strong>
         * <p>b2cf9747ee49d8d9b105cf16e078cc16</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The operator used to evaluate the rule. Valid values:</p>
         * <ul>
         * <li>strEqual: equal to.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>strEqual</p>
         */
        @NameInMap("Operator")
        public String operator;

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
         * <p>The type of the target to which the rule applies. Valid values:</p>
         * <ul>
         * <li>ALL: all assets.</li>
         * <li>SELECTION_KEY: assets selected by using the asset selection component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The scope of the target to which the rule applies. Valid values:</p>
         * <ul>
         * <li>ALL: all assets.</li>
         * <li>Other values: the key of the asset scope selected by using the asset selection component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        public static BatchUpdateMaliciousFileWhitelistConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateMaliciousFileWhitelistConfigRequestConfigList self = new BatchUpdateMaliciousFileWhitelistConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public BatchUpdateMaliciousFileWhitelistConfigRequestConfigList setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

}
