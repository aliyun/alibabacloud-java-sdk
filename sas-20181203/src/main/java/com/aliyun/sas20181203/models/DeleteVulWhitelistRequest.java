// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Whitelist")
    public String whitelist;

    public static DeleteVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulWhitelistRequest self = new DeleteVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVulWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
