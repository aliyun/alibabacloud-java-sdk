// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UdfClass extends TeaModel {
    @NameInMap("className")
    public String className;

    @NameInMap("classType")
    public String classType;

    @NameInMap("functionNames")
    public java.util.List<String> functionNames;

    @NameInMap("udfArtifactName")
    public String udfArtifactName;

    public static UdfClass build(java.util.Map<String, ?> map) throws Exception {
        UdfClass self = new UdfClass();
        return TeaModel.build(map, self);
    }

    public UdfClass setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public UdfClass setClassType(String classType) {
        this.classType = classType;
        return this;
    }
    public String getClassType() {
        return this.classType;
    }

    public UdfClass setFunctionNames(java.util.List<String> functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public java.util.List<String> getFunctionNames() {
        return this.functionNames;
    }

    public UdfClass setUdfArtifactName(String udfArtifactName) {
        this.udfArtifactName = udfArtifactName;
        return this;
    }
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

}
