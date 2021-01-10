// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppcustomciconfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutAppcustomciconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppcustomciconfigRequest self = new DeleteLinkeBahamutAppcustomciconfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppcustomciconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
