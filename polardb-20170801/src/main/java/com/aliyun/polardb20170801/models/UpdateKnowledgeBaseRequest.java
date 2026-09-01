// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>test desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The name of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
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
     * <li>balanced (default): balanced mode.</li>
     * <li>precise: precise mode.</li>
     * <li>semantic: semantic mode.</li>
     * <li>knn: KNN mode.</li>
     * <li>rrf: reciprocal rank fusion (RRF) mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>balanced</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    public static UpdateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseRequest self = new UpdateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKnowledgeBaseRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

}
