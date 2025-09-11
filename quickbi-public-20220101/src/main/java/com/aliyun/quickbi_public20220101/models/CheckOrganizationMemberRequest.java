// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckOrganizationMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adfssd-sdf****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CheckOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationMemberRequest self = new CheckOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
