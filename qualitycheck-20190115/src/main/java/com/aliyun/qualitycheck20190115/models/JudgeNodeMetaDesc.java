// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class JudgeNodeMetaDesc extends TeaModel {
    /**
     * <p>The actual value. <strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p><strong>[Deprecated]</strong></p>
     */
    @NameInMap("ActualValue")
    public String actualValue;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataType")
    public Integer dataType;

    /**
     * <p><strong>[Deprecated]</strong></p>
     */
    @NameInMap("ExpressionMetaDesc")
    public JudgeNodeMetaDescExpressionMetaDesc expressionMetaDesc;

    /**
     * <p>The system field.</p>
     * 
     * <strong>example:</strong>
     * <p>remark1</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The field data source type. 1: System predefined field. 2: Parameter-passed quality inspection field.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FieldType")
    public Integer fieldType;

    /**
     * <p>The logical expression.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Symbol")
    public Integer symbol;

    /**
     * <p>The preset value. <strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p><strong>[Deprecated]</strong></p>
     */
    @NameInMap("Value")
    public String value;

    public static JudgeNodeMetaDesc build(java.util.Map<String, ?> map) throws Exception {
        JudgeNodeMetaDesc self = new JudgeNodeMetaDesc();
        return TeaModel.build(map, self);
    }

    public JudgeNodeMetaDesc setActualValue(String actualValue) {
        this.actualValue = actualValue;
        return this;
    }
    public String getActualValue() {
        return this.actualValue;
    }

    public JudgeNodeMetaDesc setDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }
    public Integer getDataType() {
        return this.dataType;
    }

    public JudgeNodeMetaDesc setExpressionMetaDesc(JudgeNodeMetaDescExpressionMetaDesc expressionMetaDesc) {
        this.expressionMetaDesc = expressionMetaDesc;
        return this;
    }
    public JudgeNodeMetaDescExpressionMetaDesc getExpressionMetaDesc() {
        return this.expressionMetaDesc;
    }

    public JudgeNodeMetaDesc setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public JudgeNodeMetaDesc setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public Integer getFieldType() {
        return this.fieldType;
    }

    public JudgeNodeMetaDesc setSymbol(Integer symbol) {
        this.symbol = symbol;
        return this;
    }
    public Integer getSymbol() {
        return this.symbol;
    }

    public JudgeNodeMetaDesc setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class JudgeNodeMetaDescExpressionMetaDesc extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("LeftFieldType")
        public Integer leftFieldType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("LeftOperand")
        public String leftOperand;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("RightFieldType")
        public Integer rightFieldType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("RightOperand")
        public String rightOperand;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("RoundingMode")
        public String roundingMode;

        public static JudgeNodeMetaDescExpressionMetaDesc build(java.util.Map<String, ?> map) throws Exception {
            JudgeNodeMetaDescExpressionMetaDesc self = new JudgeNodeMetaDescExpressionMetaDesc();
            return TeaModel.build(map, self);
        }

        public JudgeNodeMetaDescExpressionMetaDesc setLeftFieldType(Integer leftFieldType) {
            this.leftFieldType = leftFieldType;
            return this;
        }
        public Integer getLeftFieldType() {
            return this.leftFieldType;
        }

        public JudgeNodeMetaDescExpressionMetaDesc setLeftOperand(String leftOperand) {
            this.leftOperand = leftOperand;
            return this;
        }
        public String getLeftOperand() {
            return this.leftOperand;
        }

        public JudgeNodeMetaDescExpressionMetaDesc setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public JudgeNodeMetaDescExpressionMetaDesc setRightFieldType(Integer rightFieldType) {
            this.rightFieldType = rightFieldType;
            return this;
        }
        public Integer getRightFieldType() {
            return this.rightFieldType;
        }

        public JudgeNodeMetaDescExpressionMetaDesc setRightOperand(String rightOperand) {
            this.rightOperand = rightOperand;
            return this;
        }
        public String getRightOperand() {
            return this.rightOperand;
        }

        public JudgeNodeMetaDescExpressionMetaDesc setRoundingMode(String roundingMode) {
            this.roundingMode = roundingMode;
            return this;
        }
        public String getRoundingMode() {
            return this.roundingMode;
        }

    }

}
