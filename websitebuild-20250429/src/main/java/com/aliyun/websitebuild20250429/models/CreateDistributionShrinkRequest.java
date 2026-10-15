// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateDistributionShrinkRequest extends TeaModel {
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
    public String channelsShrink;

    public static CreateDistributionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionShrinkRequest self = new CreateDistributionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionShrinkRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public CreateDistributionShrinkRequest setChannelsShrink(String channelsShrink) {
        this.channelsShrink = channelsShrink;
        return this;
    }
    public String getChannelsShrink() {
        return this.channelsShrink;
    }

}
