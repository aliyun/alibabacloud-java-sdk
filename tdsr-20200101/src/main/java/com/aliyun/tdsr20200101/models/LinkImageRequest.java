// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LinkImageRequest extends TeaModel {
    @NameInMap("CameraHeight")
    public Integer cameraHeight;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Platform")
    public String platform;

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
