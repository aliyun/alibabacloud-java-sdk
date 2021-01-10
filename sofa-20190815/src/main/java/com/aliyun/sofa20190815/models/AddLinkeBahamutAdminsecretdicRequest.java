// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminsecretdicRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    public static AddLinkeBahamutAdminsecretdicRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminsecretdicRequest self = new AddLinkeBahamutAdminsecretdicRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminsecretdicRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
