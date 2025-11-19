// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("IsCleanImageCode")
    public Boolean isCleanImageCode;

    @NameInMap("SessionId")
    public String sessionId;

    public static DeleteDesktopImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopImageRequest self = new DeleteDesktopImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopImageRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DeleteDesktopImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DeleteDesktopImageRequest setIsCleanImageCode(Boolean isCleanImageCode) {
        this.isCleanImageCode = isCleanImageCode;
        return this;
    }
    public Boolean getIsCleanImageCode() {
        return this.isCleanImageCode;
    }

    public DeleteDesktopImageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
