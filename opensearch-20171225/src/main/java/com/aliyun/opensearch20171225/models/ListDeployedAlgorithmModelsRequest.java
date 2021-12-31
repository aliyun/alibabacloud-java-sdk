// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDeployedAlgorithmModelsRequest extends TeaModel {
    @NameInMap("algorithmType")
    public String algorithmType;

    @NameInMap("inServiceOnly")
    public Boolean inServiceOnly;

    public static ListDeployedAlgorithmModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedAlgorithmModelsRequest self = new ListDeployedAlgorithmModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployedAlgorithmModelsRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public ListDeployedAlgorithmModelsRequest setInServiceOnly(Boolean inServiceOnly) {
        this.inServiceOnly = inServiceOnly;
        return this;
    }
    public Boolean getInServiceOnly() {
        return this.inServiceOnly;
    }

}
