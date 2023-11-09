// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateMemberRequest extends TeaModel {
    @NameInMap("body")
    public Member body;

    public static CreateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberRequest self = new CreateMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberRequest setBody(Member body) {
        this.body = body;
        return this;
    }
    public Member getBody() {
        return this.body;
    }

}
