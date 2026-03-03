// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class EnvListResult extends TeaModel {
    @NameInMap("envList")
    public java.util.List<String> envList;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnvListResult build(java.util.Map<String, ?> map) throws Exception {
        EnvListResult self = new EnvListResult();
        return TeaModel.build(map, self);
    }

    public EnvListResult setEnvList(java.util.List<String> envList) {
        this.envList = envList;
        return this;
    }
    public java.util.List<String> getEnvList() {
        return this.envList;
    }

    public EnvListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
