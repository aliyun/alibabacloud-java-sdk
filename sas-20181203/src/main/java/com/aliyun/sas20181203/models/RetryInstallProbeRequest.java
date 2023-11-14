// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RetryInstallProbeRequest extends TeaModel {
    /**
     * <p>The probe ID.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    public static RetryInstallProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryInstallProbeRequest self = new RetryInstallProbeRequest();
        return TeaModel.build(map, self);
    }

    public RetryInstallProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
