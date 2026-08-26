// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>testkbDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the knowledge base: PERSONAL or PUBLIC.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("KnowledgeBaseType")
    public String knowledgeBaseType;

    /**
     * <p>The unique identifier of the knowledge space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>The name of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testkb</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li>balanced (default): balanced mode</li>
     * <li>precise: precise mode</li>
     * <li>semantic: semantic mode</li>
     * <li>knn: KNN mode</li>
     * <li>rrf: reciprocal rank fusion</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>balanced</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    public static CreateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseRequest self = new CreateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseRequest setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public CreateKnowledgeBaseRequest setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public CreateKnowledgeBaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKnowledgeBaseRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

}
