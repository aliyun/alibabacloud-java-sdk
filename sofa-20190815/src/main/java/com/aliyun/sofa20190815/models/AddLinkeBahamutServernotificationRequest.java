// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutServernotificationRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    public static AddLinkeBahamutServernotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutServernotificationRequest self = new AddLinkeBahamutServernotificationRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutServernotificationRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
