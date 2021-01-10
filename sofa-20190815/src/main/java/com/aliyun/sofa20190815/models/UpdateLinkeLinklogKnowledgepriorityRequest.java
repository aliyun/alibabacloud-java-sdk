// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogKnowledgepriorityRequest extends TeaModel {
    @NameInMap("PriorityTypeRepeatList")
    public java.util.List<String> priorityTypeRepeatList;

    @NameInMap("SelectStoreId")
    public Long selectStoreId;

    public static UpdateLinkeLinklogKnowledgepriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogKnowledgepriorityRequest self = new UpdateLinkeLinklogKnowledgepriorityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogKnowledgepriorityRequest setPriorityTypeRepeatList(java.util.List<String> priorityTypeRepeatList) {
        this.priorityTypeRepeatList = priorityTypeRepeatList;
        return this;
    }
    public java.util.List<String> getPriorityTypeRepeatList() {
        return this.priorityTypeRepeatList;
    }

    public UpdateLinkeLinklogKnowledgepriorityRequest setSelectStoreId(Long selectStoreId) {
        this.selectStoreId = selectStoreId;
        return this;
    }
    public Long getSelectStoreId() {
        return this.selectStoreId;
    }

}
