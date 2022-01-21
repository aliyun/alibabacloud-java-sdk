// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class LabelPartnerUserRequest extends TeaModel {
    @NameInMap("UserPK")
    public Long userPK;

    @NameInMap("UserTag")
    public String userTag;

    public static LabelPartnerUserRequest build(java.util.Map<String, ?> map) throws Exception {
        LabelPartnerUserRequest self = new LabelPartnerUserRequest();
        return TeaModel.build(map, self);
    }

    public LabelPartnerUserRequest setUserPK(Long userPK) {
        this.userPK = userPK;
        return this;
    }
    public Long getUserPK() {
        return this.userPK;
    }

    public LabelPartnerUserRequest setUserTag(String userTag) {
        this.userTag = userTag;
        return this;
    }
    public String getUserTag() {
        return this.userTag;
    }

}
