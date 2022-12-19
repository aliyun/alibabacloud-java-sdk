// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeRequest extends TeaModel {
    @NameInMap("ProbeId")
    public String probeId;

    public static GetHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotProbeRequest self = new GetHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
