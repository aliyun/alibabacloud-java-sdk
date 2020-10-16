// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindUserRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    public static UnbindUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserRequest self = new UnbindUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindUserRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UnbindUserRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public UnbindUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
