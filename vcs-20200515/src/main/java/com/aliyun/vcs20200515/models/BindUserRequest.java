// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindUserRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("MatchingRate")
    @Validation(required = true)
    public String matchingRate;

    @NameInMap("PersonId")
    @Validation(required = true)
    public String personId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    public static BindUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindUserRequest self = new BindUserRequest();
        return TeaModel.build(map, self);
    }

    public BindUserRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public BindUserRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public BindUserRequest setMatchingRate(String matchingRate) {
        this.matchingRate = matchingRate;
        return this;
    }
    public String getMatchingRate() {
        return this.matchingRate;
    }

    public BindUserRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public BindUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
