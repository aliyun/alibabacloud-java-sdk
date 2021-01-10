// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgeprioritylistRequest extends TeaModel {
    @NameInMap("StoreId")
    public String storeId;

    public static GetLinkeLinklogKnowledgeprioritylistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgeprioritylistRequest self = new GetLinkeLinklogKnowledgeprioritylistRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgeprioritylistRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
