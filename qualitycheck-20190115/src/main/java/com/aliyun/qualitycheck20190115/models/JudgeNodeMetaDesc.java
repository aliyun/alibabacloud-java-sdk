// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class JudgeNodeMetaDesc extends TeaModel {
    @NameInMap("ActualValue")
    public String actualValue;

    @NameInMap("DataType")
    public Integer dataType;

    @NameInMap("ExpressionMetaDesc")
    public JudgeNodeMetaDescExpressionMetaDesc expressionMetaDesc;

    @NameInMap("Field")
    public String field;

    @NameInMap("FieldType")
    public Integer fieldType;

    @NameInMap("Symbol")
    public Integer symbol;

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
        @NameInMap("LeftFieldType")
        public Integer leftFieldType;

        @NameInMap("LeftOperand")
        public String leftOperand;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RightFieldType")
        public Integer rightFieldType;

        @NameInMap("RightOperand")
        public String rightOperand;

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
