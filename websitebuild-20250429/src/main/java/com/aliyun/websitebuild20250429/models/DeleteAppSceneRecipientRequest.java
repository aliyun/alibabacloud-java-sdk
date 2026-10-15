// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppSceneRecipientRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The recipient ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecipientId")
    public String recipientId;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000006921</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static DeleteAppSceneRecipientRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSceneRecipientRequest self = new DeleteAppSceneRecipientRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppSceneRecipientRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteAppSceneRecipientRequest setRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }
    public String getRecipientId() {
        return this.recipientId;
    }

    public DeleteAppSceneRecipientRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
