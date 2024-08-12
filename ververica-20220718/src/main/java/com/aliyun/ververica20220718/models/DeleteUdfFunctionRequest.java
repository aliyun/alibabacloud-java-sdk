// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteUdfFunctionRequest extends TeaModel {
    /**
     * <p>The name of the class that corresponds to the UDF.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Category</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The name of the resource that corresponds to the UDF that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-udf</p>
     */
    @NameInMap("udfArtifactName")
    public String udfArtifactName;

    public static DeleteUdfFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdfFunctionRequest self = new DeleteUdfFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUdfFunctionRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public DeleteUdfFunctionRequest setUdfArtifactName(String udfArtifactName) {
        this.udfArtifactName = udfArtifactName;
        return this;
    }
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

}
