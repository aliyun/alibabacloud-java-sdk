// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The probe ID.</p>
     * <br>
     * <p>> You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    public static GetHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotProbeRequest self = new GetHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotProbeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
