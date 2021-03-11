// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceCaptureRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("Image")
    public Integer image;

    @NameInMap("Video")
    public Integer video;

    public static ModifyDeviceCaptureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceCaptureRequest self = new ModifyDeviceCaptureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceCaptureRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDeviceCaptureRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public ModifyDeviceCaptureRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyDeviceCaptureRequest setImage(Integer image) {
        this.image = image;
        return this;
    }
    public Integer getImage() {
        return this.image;
    }

    public ModifyDeviceCaptureRequest setVideo(Integer video) {
        this.video = video;
        return this;
    }
    public Integer getVideo() {
        return this.video;
    }

}
