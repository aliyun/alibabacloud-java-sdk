// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogKnowledgeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("KnowledgeJsonStr")
    public String knowledgeJsonStr;

    public static UpdateLinkeLinklogKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogKnowledgeRequest self = new UpdateLinkeLinklogKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogKnowledgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeLinklogKnowledgeRequest setKnowledgeJsonStr(String knowledgeJsonStr) {
        this.knowledgeJsonStr = knowledgeJsonStr;
        return this;
    }
    public String getKnowledgeJsonStr() {
        return this.knowledgeJsonStr;
    }

}
