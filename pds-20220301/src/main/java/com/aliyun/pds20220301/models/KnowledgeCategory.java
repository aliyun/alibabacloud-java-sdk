// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class KnowledgeCategory extends TeaModel {
    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("keywords")
    public java.util.List<String> keywords;

    @NameInMap("knowledge_base_id")
    public String knowledgeBaseId;

    @NameInMap("knowledge_base_name")
    public String knowledgeBaseName;

    @NameInMap("knowledge_category_id")
    public String knowledgeCategoryId;

    @NameInMap("name")
    public String name;

    @NameInMap("owner")
    public String owner;

    @NameInMap("owner_type")
    public String ownerType;

    @NameInMap("parent_knowledge_category_id")
    public String parentKnowledgeCategoryId;

    @NameInMap("status")
    public String status;

    @NameInMap("updated_at")
    public Long updatedAt;

    public static KnowledgeCategory build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeCategory self = new KnowledgeCategory();
        return TeaModel.build(map, self);
    }

    public KnowledgeCategory setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeCategory setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeCategory setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public KnowledgeCategory setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeCategory setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public KnowledgeCategory setKnowledgeCategoryId(String knowledgeCategoryId) {
        this.knowledgeCategoryId = knowledgeCategoryId;
        return this;
    }
    public String getKnowledgeCategoryId() {
        return this.knowledgeCategoryId;
    }

    public KnowledgeCategory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KnowledgeCategory setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public KnowledgeCategory setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public KnowledgeCategory setParentKnowledgeCategoryId(String parentKnowledgeCategoryId) {
        this.parentKnowledgeCategoryId = parentKnowledgeCategoryId;
        return this;
    }
    public String getParentKnowledgeCategoryId() {
        return this.parentKnowledgeCategoryId;
    }

    public KnowledgeCategory setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeCategory setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
