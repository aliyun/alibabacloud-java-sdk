// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetUdfArtifactsRequest extends TeaModel {
    /**
     * <p>The name of the JAR or Python file that corresponds to the UDF.</p>
     * 
     * <strong>example:</strong>
     * <p>test-udf</p>
     */
    @NameInMap("udfArtifactName")
    public String udfArtifactName;

    public static GetUdfArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUdfArtifactsRequest self = new GetUdfArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public GetUdfArtifactsRequest setUdfArtifactName(String udfArtifactName) {
        this.udfArtifactName = udfArtifactName;
        return this;
    }
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

}
