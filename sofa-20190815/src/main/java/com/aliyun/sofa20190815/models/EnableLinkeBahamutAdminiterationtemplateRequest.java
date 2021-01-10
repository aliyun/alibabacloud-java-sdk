// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkeBahamutAdminiterationtemplateRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Id")
    public String id;

    public static EnableLinkeBahamutAdminiterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkeBahamutAdminiterationtemplateRequest self = new EnableLinkeBahamutAdminiterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public EnableLinkeBahamutAdminiterationtemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public EnableLinkeBahamutAdminiterationtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
