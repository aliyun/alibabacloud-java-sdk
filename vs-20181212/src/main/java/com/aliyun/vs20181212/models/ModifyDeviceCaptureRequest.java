// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceCaptureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Image")
    public Integer image;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Video")
    public Integer video;

    public static ModifyDeviceCaptureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceCaptureRequest self = new ModifyDeviceCaptureRequest();
        return TeaModel.build(map, self);
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

    public ModifyDeviceCaptureRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDeviceCaptureRequest setVideo(Integer video) {
        this.video = video;
        return this;
    }
    public Integer getVideo() {
        return this.video;
    }

}
