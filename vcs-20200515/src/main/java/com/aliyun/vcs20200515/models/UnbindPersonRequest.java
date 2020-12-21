// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindPersonRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("ProfileId")
    public Long profileId;

    public static UnbindPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPersonRequest self = new UnbindPersonRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPersonRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UnbindPersonRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public UnbindPersonRequest setProfileId(Long profileId) {
        this.profileId = profileId;
        return this;
    }
    public Long getProfileId() {
        return this.profileId;
    }

}
