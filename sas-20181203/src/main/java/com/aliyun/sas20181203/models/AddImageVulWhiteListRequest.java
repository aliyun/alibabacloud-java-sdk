// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageVulWhiteListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Target")
    public String target;

    @NameInMap("Type")
    public String type;

    @NameInMap("Whitelist")
    public String whitelist;

    public static AddImageVulWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageVulWhiteListRequest self = new AddImageVulWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddImageVulWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddImageVulWhiteListRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AddImageVulWhiteListRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public AddImageVulWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddImageVulWhiteListRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
