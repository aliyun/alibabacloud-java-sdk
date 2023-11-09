// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateMemberRequest extends TeaModel {
    @NameInMap("body")
    public Member body;

    public static UpdateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberRequest self = new UpdateMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemberRequest setBody(Member body) {
        this.body = body;
        return this;
    }
    public Member getBody() {
        return this.body;
    }

}
