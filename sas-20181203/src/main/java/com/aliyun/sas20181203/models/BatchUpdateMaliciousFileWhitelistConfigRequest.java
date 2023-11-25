// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchUpdateMaliciousFileWhitelistConfigRequest extends TeaModel {
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
