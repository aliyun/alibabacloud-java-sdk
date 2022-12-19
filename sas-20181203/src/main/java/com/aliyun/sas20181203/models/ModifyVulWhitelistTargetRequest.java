// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulWhitelistTargetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TargetInfo")
    public String targetInfo;

    public static ModifyVulWhitelistTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulWhitelistTargetRequest self = new ModifyVulWhitelistTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulWhitelistTargetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyVulWhitelistTargetRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyVulWhitelistTargetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyVulWhitelistTargetRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
