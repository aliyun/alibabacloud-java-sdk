// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ArmsConfig extends TeaModel {
    @NameInMap("agentVersion")
    public String agentVersion;

    @NameInMap("appId")
    public String appId;

    @NameInMap("licenseKey")
    public String licenseKey;

    public static ArmsConfig build(java.util.Map<String, ?> map) throws Exception {
        ArmsConfig self = new ArmsConfig();
        return TeaModel.build(map, self);
    }

    public ArmsConfig setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ArmsConfig setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ArmsConfig setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

}
