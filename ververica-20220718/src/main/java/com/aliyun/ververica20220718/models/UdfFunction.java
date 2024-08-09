// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UdfFunction extends TeaModel {
    @NameInMap("className")
    public String className;

    @NameInMap("functionName")
    public String functionName;

    @NameInMap("udfArtifactName")
    public String udfArtifactName;

    public static UdfFunction build(java.util.Map<String, ?> map) throws Exception {
        UdfFunction self = new UdfFunction();
        return TeaModel.build(map, self);
    }

    public UdfFunction setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public UdfFunction setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public UdfFunction setUdfArtifactName(String udfArtifactName) {
        this.udfArtifactName = udfArtifactName;
        return this;
    }
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

}
