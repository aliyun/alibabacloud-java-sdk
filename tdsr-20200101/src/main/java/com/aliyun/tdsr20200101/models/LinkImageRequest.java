// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LinkImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("CameraHeight")
    public Integer cameraHeight;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****.jpg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static LinkImageRequest build(java.util.Map<String, ?> map) throws Exception {
        LinkImageRequest self = new LinkImageRequest();
        return TeaModel.build(map, self);
    }

    public LinkImageRequest setCameraHeight(Integer cameraHeight) {
        this.cameraHeight = cameraHeight;
        return this;
    }
    public Integer getCameraHeight() {
        return this.cameraHeight;
    }

    public LinkImageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public LinkImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public LinkImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
