// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogIndicationRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("ConditionsRepeatList")
    public java.util.List<String> conditionsRepeatList;

    public static AddLinkeLinklogIndicationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogIndicationRequest self = new AddLinkeLinklogIndicationRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogIndicationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddLinkeLinklogIndicationRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public AddLinkeLinklogIndicationRequest setConditionsRepeatList(java.util.List<String> conditionsRepeatList) {
        this.conditionsRepeatList = conditionsRepeatList;
        return this;
    }
    public java.util.List<String> getConditionsRepeatList() {
        return this.conditionsRepeatList;
    }

}
