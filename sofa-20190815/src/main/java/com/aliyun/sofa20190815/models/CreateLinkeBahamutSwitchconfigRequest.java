// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutSwitchconfigRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    public static CreateLinkeBahamutSwitchconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutSwitchconfigRequest self = new CreateLinkeBahamutSwitchconfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutSwitchconfigRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
