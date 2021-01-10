// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationtemplateRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Id")
    public String id;

    public static UpdateLinkeBahamutIterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationtemplateRequest self = new UpdateLinkeBahamutIterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationtemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateLinkeBahamutIterationtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
