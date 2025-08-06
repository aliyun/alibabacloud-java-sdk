// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static GetLicenseKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyRequest self = new GetLicenseKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
