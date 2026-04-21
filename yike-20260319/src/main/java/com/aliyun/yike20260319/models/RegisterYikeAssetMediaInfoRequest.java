// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class RegisterYikeAssetMediaInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fd-ABMFfAB2bA</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <strong>example:</strong>
     * <p>ProductionId</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static RegisterYikeAssetMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterYikeAssetMediaInfoRequest self = new RegisterYikeAssetMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public RegisterYikeAssetMediaInfoRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public RegisterYikeAssetMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public RegisterYikeAssetMediaInfoRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public RegisterYikeAssetMediaInfoRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
