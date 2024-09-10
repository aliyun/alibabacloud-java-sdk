// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCloudVendorAccountAKRequest extends TeaModel {
    /**
     * <p>The unique ID of the AccessKey pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2363</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>The modules that are associated with the AccessKey pair.</p>
     */
    @NameInMap("AuthModules")
    public java.util.List<String> authModules;

    public static DeleteCloudVendorAccountAKRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudVendorAccountAKRequest self = new DeleteCloudVendorAccountAKRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudVendorAccountAKRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public DeleteCloudVendorAccountAKRequest setAuthModules(java.util.List<String> authModules) {
        this.authModules = authModules;
        return this;
    }
    public java.util.List<String> getAuthModules() {
        return this.authModules;
    }

}
