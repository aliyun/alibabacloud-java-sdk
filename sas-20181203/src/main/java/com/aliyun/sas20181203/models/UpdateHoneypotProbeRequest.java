// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeRequest extends TeaModel {
    /**
     * <p>Specifies whether address resolution protocol (ARP) is enabled for the check type.</p>
     */
    @NameInMap("Arp")
    public Boolean arp;

    /**
     * <p>The name of the probe.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether ping is enabled for the check type.</p>
     */
    @NameInMap("Ping")
    public Boolean ping;

    /**
     * <p>The ID of the probe.</p>
     * <br>
     * <p>> You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    /**
     * <p>The IP addresses that are monitored.</p>
     */
    @NameInMap("ServiceIpList")
    public java.util.List<String> serviceIpList;

    public static UpdateHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotProbeRequest self = new UpdateHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotProbeRequest setArp(Boolean arp) {
        this.arp = arp;
        return this;
    }
    public Boolean getArp() {
        return this.arp;
    }

    public UpdateHoneypotProbeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateHoneypotProbeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateHoneypotProbeRequest setPing(Boolean ping) {
        this.ping = ping;
        return this;
    }
    public Boolean getPing() {
        return this.ping;
    }

    public UpdateHoneypotProbeRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

    public UpdateHoneypotProbeRequest setServiceIpList(java.util.List<String> serviceIpList) {
        this.serviceIpList = serviceIpList;
        return this;
    }
    public java.util.List<String> getServiceIpList() {
        return this.serviceIpList;
    }

}
