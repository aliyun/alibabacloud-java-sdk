// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LinkImageRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    // 图片或者视频名称xxx.jpg
    @NameInMap("FileName")
    public String fileName;

    // 相机高度 单位 cm
    @NameInMap("CameraHeight")
    public Integer cameraHeight;

    // 平台标识，默认PC
    @NameInMap("Platform")
    public String platform;

    public static LinkImageRequest build(java.util.Map<String, ?> map) throws Exception {
        LinkImageRequest self = new LinkImageRequest();
        return TeaModel.build(map, self);
    }

    public LinkImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public LinkImageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public LinkImageRequest setCameraHeight(Integer cameraHeight) {
        this.cameraHeight = cameraHeight;
        return this;
    }
    public Integer getCameraHeight() {
        return this.cameraHeight;
    }

    public LinkImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
