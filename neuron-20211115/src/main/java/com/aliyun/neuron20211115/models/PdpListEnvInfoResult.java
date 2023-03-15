// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpListEnvInfoResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<EnvInfoDO> data;

    @NameInMap("requestId")
    public String requestId;

    public static PdpListEnvInfoResult build(java.util.Map<String, ?> map) throws Exception {
        PdpListEnvInfoResult self = new PdpListEnvInfoResult();
        return TeaModel.build(map, self);
    }

    public PdpListEnvInfoResult setData(java.util.List<EnvInfoDO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EnvInfoDO> getData() {
        return this.data;
    }

    public PdpListEnvInfoResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
