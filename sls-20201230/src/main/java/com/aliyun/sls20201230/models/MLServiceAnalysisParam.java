// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLServiceAnalysisParam extends TeaModel {
    @NameInMap("input")
    public java.util.List<java.util.Map<String, String>> input;

    @NameInMap("parameter")
    public java.util.Map<String, String> parameter;

    public static MLServiceAnalysisParam build(java.util.Map<String, ?> map) throws Exception {
        MLServiceAnalysisParam self = new MLServiceAnalysisParam();
        return TeaModel.build(map, self);
    }

    public MLServiceAnalysisParam setInput(java.util.List<java.util.Map<String, String>> input) {
        this.input = input;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getInput() {
        return this.input;
    }

    public MLServiceAnalysisParam setParameter(java.util.Map<String, String> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, String> getParameter() {
        return this.parameter;
    }

}
