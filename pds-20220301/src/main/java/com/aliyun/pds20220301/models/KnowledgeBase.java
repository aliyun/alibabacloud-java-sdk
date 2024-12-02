// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class KnowledgeBase extends TeaModel {
    @NameInMap("cover_uri")
    public String coverUri;

    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("file_filter")
    public String fileFilter;

    @NameInMap("knowledge_base_id")
    public String knowledgeBaseId;

    @NameInMap("link_rule_list")
    public java.util.List<LinkRule> linkRuleList;

    @NameInMap("name")
    public String name;

    @NameInMap("owner_id")
    public String ownerId;

    @NameInMap("owner_name")
    public String ownerName;

    @NameInMap("owner_type")
    public String ownerType;

    @NameInMap("updated_at")
    public Long updatedAt;

    public static KnowledgeBase build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBase self = new KnowledgeBase();
        return TeaModel.build(map, self);
    }

    public KnowledgeBase setCoverUri(String coverUri) {
        this.coverUri = coverUri;
        return this;
    }
    public String getCoverUri() {
        return this.coverUri;
    }

    public KnowledgeBase setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBase setFileFilter(String fileFilter) {
        this.fileFilter = fileFilter;
        return this;
    }
    public String getFileFilter() {
        return this.fileFilter;
    }

    public KnowledgeBase setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeBase setLinkRuleList(java.util.List<LinkRule> linkRuleList) {
        this.linkRuleList = linkRuleList;
        return this;
    }
    public java.util.List<LinkRule> getLinkRuleList() {
        return this.linkRuleList;
    }

    public KnowledgeBase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KnowledgeBase setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public KnowledgeBase setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public KnowledgeBase setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public KnowledgeBase setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
