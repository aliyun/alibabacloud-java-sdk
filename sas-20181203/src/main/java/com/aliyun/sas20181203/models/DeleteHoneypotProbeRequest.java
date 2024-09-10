// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeRequest extends TeaModel {
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
     * <p>The ID of the probe.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95f0f79c-f7e9-4b09-a6e3-95a4cb6d****</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    public static DeleteHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeRequest self = new DeleteHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
