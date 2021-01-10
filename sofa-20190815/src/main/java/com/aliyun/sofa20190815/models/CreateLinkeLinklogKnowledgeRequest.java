// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogKnowledgeRequest extends TeaModel {
    @NameInMap("KnowledgeJsonStr")
    public String knowledgeJsonStr;

    @NameInMap("StoreId")
    public String storeId;

    public static CreateLinkeLinklogKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogKnowledgeRequest self = new CreateLinkeLinklogKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogKnowledgeRequest setKnowledgeJsonStr(String knowledgeJsonStr) {
        this.knowledgeJsonStr = knowledgeJsonStr;
        return this;
    }
    public String getKnowledgeJsonStr() {
        return this.knowledgeJsonStr;
    }

    public CreateLinkeLinklogKnowledgeRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
