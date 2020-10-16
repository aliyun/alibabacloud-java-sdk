// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("ProfileId")
    @Validation(required = true)
    public Long profileId;

    public static DeleteProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileRequest self = new DeleteProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProfileRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteProfileRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public DeleteProfileRequest setProfileId(Long profileId) {
        this.profileId = profileId;
        return this;
    }
    public Long getProfileId() {
        return this.profileId;
    }

}
