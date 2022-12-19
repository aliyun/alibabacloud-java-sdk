// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetConfigRequest extends TeaModel {
    // Specifies whether to enable vulnerability detection. Valid values:
    // 
    // *   **on**: yes
    // *   **off**: no
    @NameInMap("Config")
    public String config;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the vulnerability. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **emg**: urgent vulnerability
    @NameInMap("Type")
    public String type;

    // The UUID of the server.
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyVulTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetConfigRequest self = new ModifyVulTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyVulTargetConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyVulTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyVulTargetConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
