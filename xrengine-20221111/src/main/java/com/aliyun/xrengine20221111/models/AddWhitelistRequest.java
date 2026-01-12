// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class AddWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Remark")
    public String remark;

    public static AddWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWhitelistRequest self = new AddWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddWhitelistRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public AddWhitelistRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public AddWhitelistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
