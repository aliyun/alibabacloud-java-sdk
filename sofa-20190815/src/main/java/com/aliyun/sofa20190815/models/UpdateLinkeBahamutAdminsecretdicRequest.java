// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminsecretdicRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    public static UpdateLinkeBahamutAdminsecretdicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminsecretdicRequest self = new UpdateLinkeBahamutAdminsecretdicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminsecretdicRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
