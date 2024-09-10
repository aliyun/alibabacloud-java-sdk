// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallPmAgentRequest extends TeaModel {
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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58.35.xx.xx</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the client.</p>
     * <ul>
     * <li><strong>aliyun_assist</strong>: Cloud Assistant client</li>
     * <li><strong>aliyun_monitor</strong>: CloudMonitor client</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_monitor</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server. If you specify multiple UUIDs, separate the UUIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-a6444920-d303-4ccf-ab87-a1d3cd49****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static InstallPmAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPmAgentRequest self = new InstallPmAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallPmAgentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public InstallPmAgentRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public InstallPmAgentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InstallPmAgentRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
