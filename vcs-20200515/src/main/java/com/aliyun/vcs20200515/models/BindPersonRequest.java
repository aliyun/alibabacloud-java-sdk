// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindPersonRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("PersonMatchingRate")
    public String personMatchingRate;

    @NameInMap("ProfileId")
    public Long profileId;

    public static BindPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPersonRequest self = new BindPersonRequest();
        return TeaModel.build(map, self);
    }

    public BindPersonRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public BindPersonRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public BindPersonRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public BindPersonRequest setPersonMatchingRate(String personMatchingRate) {
        this.personMatchingRate = personMatchingRate;
        return this;
    }
    public String getPersonMatchingRate() {
        return this.personMatchingRate;
    }

    public BindPersonRequest setProfileId(Long profileId) {
        this.profileId = profileId;
        return this;
    }
    public Long getProfileId() {
        return this.profileId;
    }

}
