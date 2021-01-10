// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeLinklogKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgeRequest self = new GetLinkeLinklogKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
