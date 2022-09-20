// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAKRequest extends TeaModel {
    @NameInMap("body")
    public Long body;

    public static BuildStsAKRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAKRequest self = new BuildStsAKRequest();
        return TeaModel.build(map, self);
    }

    public BuildStsAKRequest setBody(Long body) {
        this.body = body;
        return this;
    }
    public Long getBody() {
        return this.body;
    }

}
