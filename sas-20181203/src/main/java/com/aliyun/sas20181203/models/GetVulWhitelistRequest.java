// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistRequest extends TeaModel {
    @NameInMap("VulWhitelistId")
    public Long vulWhitelistId;

    public static GetVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulWhitelistRequest self = new GetVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public GetVulWhitelistRequest setVulWhitelistId(Long vulWhitelistId) {
        this.vulWhitelistId = vulWhitelistId;
        return this;
    }
    public Long getVulWhitelistId() {
        return this.vulWhitelistId;
    }

}
