// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The ARP check type.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Arp")
    public Boolean arp;

    /**
     * <p>The probe name.</p>
     * 
     * <strong>example:</strong>
     * <p>svwsx-vpc-4430</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ping detection type.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ping")
    public Boolean ping;

    /**
     * <p>The probe ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bbe7e382-956f-473e-beed-bc73a258****</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    /**
     * <p>The list of listening IP addresses.</p>
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
