// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CheckLayerRequest extends TeaModel {
    @NameInMap("ParamNames")
    public String paramNames;

    public static CheckLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLayerRequest self = new CheckLayerRequest();
        return TeaModel.build(map, self);
    }

    public CheckLayerRequest setParamNames(String paramNames) {
        this.paramNames = paramNames;
        return this;
    }
    public String getParamNames() {
        return this.paramNames;
    }

}
