// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkTokenRequest extends TeaModel {
    /**
     * <p>The requested validity period for the share token, in seconds. Valid values range from 1 to 7,200. If this parameter is omitted or set to 0, it defaults to 7,200.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("expire_sec")
    public Integer expireSec;

    /**
     * <p>The share ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The share password.</p>
     * 
     * <strong>example:</strong>
     * <p>abcF123x</p>
     */
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
