// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqQueryAbilityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A************2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SmartqQueryAbilityResponseBodyResult result;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SmartqQueryAbilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmartqQueryAbilityResponseBody self = new SmartqQueryAbilityResponseBody();
        return TeaModel.build(map, self);
    }

    public SmartqQueryAbilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmartqQueryAbilityResponseBody setResult(SmartqQueryAbilityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SmartqQueryAbilityResponseBodyResult getResult() {
        return this.result;
    }

    public SmartqQueryAbilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SmartqQueryAbilityResponseBodyResultMetaType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Polar***STPS</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Value")
        public String value;

        public static SmartqQueryAbilityResponseBodyResultMetaType build(java.util.Map<String, ?> map) throws Exception {
            SmartqQueryAbilityResponseBodyResultMetaType self = new SmartqQueryAbilityResponseBodyResultMetaType();
            return TeaModel.build(map, self);
        }

        public SmartqQueryAbilityResponseBodyResultMetaType setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SmartqQueryAbilityResponseBodyResultMetaType setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SmartqQueryAbilityResponseBodyResultValues extends TeaModel {
        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Row")
        public java.util.List<String> row;

        public static SmartqQueryAbilityResponseBodyResultValues build(java.util.Map<String, ?> map) throws Exception {
            SmartqQueryAbilityResponseBodyResultValues self = new SmartqQueryAbilityResponseBodyResultValues();
            return TeaModel.build(map, self);
        }

        public SmartqQueryAbilityResponseBodyResultValues setRow(java.util.List<String> row) {
            this.row = row;
            return this;
        }
        public java.util.List<String> getRow() {
            return this.row;
        }

    }

    public static class SmartqQueryAbilityResponseBodyResult extends TeaModel {
        @NameInMap("ChartType")
        public String chartType;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ConclusionText")
        public String conclusionText;

        @NameInMap("LogicSql")
        public String logicSql;

        @NameInMap("MetaType")
        public java.util.List<SmartqQueryAbilityResponseBodyResultMetaType> metaType;

        @NameInMap("Values")
        public java.util.List<SmartqQueryAbilityResponseBodyResultValues> values;

        public static SmartqQueryAbilityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SmartqQueryAbilityResponseBodyResult self = new SmartqQueryAbilityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SmartqQueryAbilityResponseBodyResult setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }
        public String getChartType() {
            return this.chartType;
        }

        public SmartqQueryAbilityResponseBodyResult setConclusionText(String conclusionText) {
            this.conclusionText = conclusionText;
            return this;
        }
        public String getConclusionText() {
            return this.conclusionText;
        }

        public SmartqQueryAbilityResponseBodyResult setLogicSql(String logicSql) {
            this.logicSql = logicSql;
            return this;
        }
        public String getLogicSql() {
            return this.logicSql;
        }

        public SmartqQueryAbilityResponseBodyResult setMetaType(java.util.List<SmartqQueryAbilityResponseBodyResultMetaType> metaType) {
            this.metaType = metaType;
            return this;
        }
        public java.util.List<SmartqQueryAbilityResponseBodyResultMetaType> getMetaType() {
            return this.metaType;
        }

        public SmartqQueryAbilityResponseBodyResult setValues(java.util.List<SmartqQueryAbilityResponseBodyResultValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<SmartqQueryAbilityResponseBodyResultValues> getValues() {
            return this.values;
        }

    }

}
