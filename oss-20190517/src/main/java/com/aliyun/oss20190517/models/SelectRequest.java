// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectRequest extends TeaModel {
    // description
    @NameInMap("Expression")
    public String expression;

    @NameInMap("InputSerialization")
    public InputSerialization inputSerialization;

    @NameInMap("Options")
    public SelectRequestOptions options;

    @NameInMap("OutputSerialization")
    public OutputSerialization outputSerialization;

    public static SelectRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectRequest self = new SelectRequest();
        return TeaModel.build(map, self);
    }

    public SelectRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public SelectRequest setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
        return this;
    }
    public InputSerialization getInputSerialization() {
        return this.inputSerialization;
    }

    public SelectRequest setOptions(SelectRequestOptions options) {
        this.options = options;
        return this;
    }
    public SelectRequestOptions getOptions() {
        return this.options;
    }

    public SelectRequest setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
        return this;
    }
    public OutputSerialization getOutputSerialization() {
        return this.outputSerialization;
    }

}
