// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RegisterUdfFunctionRequest extends TeaModel {
    /**
     * <p>The name of the class that corresponds to the UDF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>orderRank</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The name of the UDF. In most cases, the name of the UDF is the same as the class name. You can specify a name for the UDF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>orderRank</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The name of the JAR or Python file that corresponds to the UDF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-udf</p>
     */
    @NameInMap("udfArtifactName")
    public String udfArtifactName;

    public static RegisterUdfFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterUdfFunctionRequest self = new RegisterUdfFunctionRequest();
        return TeaModel.build(map, self);
    }

    public RegisterUdfFunctionRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public RegisterUdfFunctionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public RegisterUdfFunctionRequest setUdfArtifactName(String udfArtifactName) {
        this.udfArtifactName = udfArtifactName;
        return this;
    }
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

}
