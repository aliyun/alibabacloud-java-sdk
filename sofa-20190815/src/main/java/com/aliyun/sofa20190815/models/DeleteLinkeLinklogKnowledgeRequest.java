// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogKnowledgeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLinkeLinklogKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogKnowledgeRequest self = new DeleteLinkeLinklogKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogKnowledgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
