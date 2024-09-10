// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeBindRequest extends TeaModel {
    /**
     * <p>The unique ID of the bound service.</p>
     * 
     * <strong>example:</strong>
     * <p>aa20815f-f0f3-4e3b-8e13-55771742****</p>
     */
    @NameInMap("BindId")
    public String bindId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <p> You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aa234650-cfcf-4e25-b61f-c58f603f****</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    public static DeleteHoneypotProbeBindRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeBindRequest self = new DeleteHoneypotProbeBindRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeBindRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public DeleteHoneypotProbeBindRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteHoneypotProbeBindRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

}
