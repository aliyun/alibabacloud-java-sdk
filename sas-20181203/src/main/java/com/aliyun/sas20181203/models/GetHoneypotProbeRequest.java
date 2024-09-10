// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The probe ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6c1ebc9-a90d-4c9e-9490-328814d1ca00</p>
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
