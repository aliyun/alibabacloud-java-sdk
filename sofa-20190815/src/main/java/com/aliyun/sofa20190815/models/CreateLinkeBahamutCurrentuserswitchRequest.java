// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCurrentuserswitchRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Type")
    public String type;

    public static CreateLinkeBahamutCurrentuserswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCurrentuserswitchRequest self = new CreateLinkeBahamutCurrentuserswitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCurrentuserswitchRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateLinkeBahamutCurrentuserswitchRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
