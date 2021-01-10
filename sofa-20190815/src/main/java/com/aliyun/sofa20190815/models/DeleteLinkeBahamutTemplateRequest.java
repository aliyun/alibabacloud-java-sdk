// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutTemplateRequest self = new DeleteLinkeBahamutTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
