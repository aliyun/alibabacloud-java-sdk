// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalSearchTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;ds-1&quot;, &quot;ds-2&quot;]</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>Multimodal-Embedding</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <strong>example:</strong>
     * <p>指示牌</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>Multimodal-Search</p>
     */
    @NameInMap("SearchModel")
    public String searchModel;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static CreateMultimodalSearchTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalSearchTaskShrinkRequest self = new CreateMultimodalSearchTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalSearchTaskShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalSearchTaskShrinkRequest setDatasetIdsShrink(String datasetIdsShrink) {
        this.datasetIdsShrink = datasetIdsShrink;
        return this;
    }
    public String getDatasetIdsShrink() {
        return this.datasetIdsShrink;
    }

    public CreateMultimodalSearchTaskShrinkRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateMultimodalSearchTaskShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public CreateMultimodalSearchTaskShrinkRequest setSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    public String getSearchModel() {
        return this.searchModel;
    }

    public CreateMultimodalSearchTaskShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
