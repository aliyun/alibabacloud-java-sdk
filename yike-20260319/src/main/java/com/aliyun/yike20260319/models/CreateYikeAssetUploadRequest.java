// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeAssetUploadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExt")
    public String fileExt;

    /**
     * <strong>example:</strong>
     * <p>StoryboardInput</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static CreateYikeAssetUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeAssetUploadRequest self = new CreateYikeAssetUploadRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeAssetUploadRequest setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public CreateYikeAssetUploadRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
