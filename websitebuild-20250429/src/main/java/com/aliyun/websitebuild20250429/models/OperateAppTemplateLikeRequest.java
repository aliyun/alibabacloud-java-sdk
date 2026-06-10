// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppTemplateLikeRequest extends TeaModel {
    /**
     * <p>Indicates whether the item is collected</p>
     */
    @NameInMap("Liked")
    public Boolean liked;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>K191WHV12URYQN06</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static OperateAppTemplateLikeRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAppTemplateLikeRequest self = new OperateAppTemplateLikeRequest();
        return TeaModel.build(map, self);
    }

    public OperateAppTemplateLikeRequest setLiked(Boolean liked) {
        this.liked = liked;
        return this;
    }
    public Boolean getLiked() {
        return this.liked;
    }

    public OperateAppTemplateLikeRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
