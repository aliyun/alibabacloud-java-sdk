// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutWebapideletelterationRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeBahamutWebapideletelterationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutWebapideletelterationRequest self = new DeleteLinkeBahamutWebapideletelterationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutWebapideletelterationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
