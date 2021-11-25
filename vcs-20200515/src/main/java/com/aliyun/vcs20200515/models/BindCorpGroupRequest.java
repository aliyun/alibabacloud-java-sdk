// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindCorpGroupRequest extends TeaModel {
    @NameInMap("CorpGroupId")
    public String corpGroupId;

    @NameInMap("CorpId")
    public String corpId;

    public static BindCorpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCorpGroupRequest self = new BindCorpGroupRequest();
        return TeaModel.build(map, self);
    }

    public BindCorpGroupRequest setCorpGroupId(String corpGroupId) {
        this.corpGroupId = corpGroupId;
        return this;
    }
    public String getCorpGroupId() {
        return this.corpGroupId;
    }

    public BindCorpGroupRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
