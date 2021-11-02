// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistRequest extends TeaModel {
    @NameInMap("Reason")
    public String reason;

    @NameInMap("TargetInfo")
    public String targetInfo;

    @NameInMap("Whitelist")
    public String whitelist;

    public static ModifyCreateVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistRequest self = new ModifyCreateVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyCreateVulWhitelistRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public ModifyCreateVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
