// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateDistributionRequest extends TeaModel {
    /**
     * <p>The article ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>28733</p>
     */
    @NameInMap("ArticleId")
    public String articleId;

    /**
     * <p>The list of selected channels.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Channels")
    public java.util.List<String> channels;

    public static CreateDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionRequest self = new CreateDistributionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public CreateDistributionRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

}
