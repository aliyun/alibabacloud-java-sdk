// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindCorpGroupRequest extends TeaModel {
    @NameInMap("CorpGroupId")
    public String corpGroupId;

    @NameInMap("CorpId")
    public String corpId;

    public static UnbindCorpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindCorpGroupRequest self = new UnbindCorpGroupRequest();
        return TeaModel.build(map, self);
    }

    public UnbindCorpGroupRequest setCorpGroupId(String corpGroupId) {
        this.corpGroupId = corpGroupId;
        return this;
    }
    public String getCorpGroupId() {
        return this.corpGroupId;
    }

    public UnbindCorpGroupRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
