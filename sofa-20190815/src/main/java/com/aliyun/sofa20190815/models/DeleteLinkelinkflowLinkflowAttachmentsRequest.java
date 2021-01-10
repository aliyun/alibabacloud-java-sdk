// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkelinkflowLinkflowAttachmentsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkelinkflowLinkflowAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkelinkflowLinkflowAttachmentsRequest self = new DeleteLinkelinkflowLinkflowAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkelinkflowLinkflowAttachmentsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
