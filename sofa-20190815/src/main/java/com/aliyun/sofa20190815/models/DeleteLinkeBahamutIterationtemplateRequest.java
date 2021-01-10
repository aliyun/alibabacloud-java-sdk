// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutIterationtemplateRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutIterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutIterationtemplateRequest self = new DeleteLinkeBahamutIterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutIterationtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
