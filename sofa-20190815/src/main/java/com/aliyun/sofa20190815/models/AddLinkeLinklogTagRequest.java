// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogTagRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RelationId")
    public Long relationId;

    @NameInMap("TagId")
    public Long tagId;

    public static AddLinkeLinklogTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogTagRequest self = new AddLinkeLinklogTagRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogTagRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public AddLinkeLinklogTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLinkeLinklogTagRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public AddLinkeLinklogTagRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

}
