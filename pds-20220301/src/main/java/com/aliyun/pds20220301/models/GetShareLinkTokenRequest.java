// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkTokenRequest extends TeaModel {
    @NameInMap("expire_sec")
    public Integer expireSec;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("share_pwd")
    public String sharePwd;

    public static GetShareLinkTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkTokenRequest self = new GetShareLinkTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetShareLinkTokenRequest setExpireSec(Integer expireSec) {
        this.expireSec = expireSec;
        return this;
    }
    public Integer getExpireSec() {
        return this.expireSec;
    }

    public GetShareLinkTokenRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetShareLinkTokenRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

}
