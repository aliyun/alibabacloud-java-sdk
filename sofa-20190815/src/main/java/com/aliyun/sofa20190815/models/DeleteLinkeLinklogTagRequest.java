// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogTagRequest extends TeaModel {
    @NameInMap("RelationId")
    public String relationId;

    public static DeleteLinkeLinklogTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogTagRequest self = new DeleteLinkeLinklogTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogTagRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

}
