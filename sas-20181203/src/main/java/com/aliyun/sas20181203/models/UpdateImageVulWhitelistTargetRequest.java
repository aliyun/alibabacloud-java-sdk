// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageVulWhitelistTargetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Source")
    public String source;

    @NameInMap("Target")
    public String target;

    public static UpdateImageVulWhitelistTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageVulWhitelistTargetRequest self = new UpdateImageVulWhitelistTargetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageVulWhitelistTargetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateImageVulWhitelistTargetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateImageVulWhitelistTargetRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateImageVulWhitelistTargetRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateImageVulWhitelistTargetRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
