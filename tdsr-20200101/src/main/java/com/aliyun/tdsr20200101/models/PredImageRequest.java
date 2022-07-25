// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredImageRequest extends TeaModel {
    @NameInMap("CorrectVertical")
    public Boolean correctVertical;

    @NameInMap("CountDetectDoor")
    public Long countDetectDoor;

    @NameInMap("DetectDoor")
    public Boolean detectDoor;

    @NameInMap("SubSceneId")
    public String subSceneId;

    public static PredImageRequest build(java.util.Map<String, ?> map) throws Exception {
        PredImageRequest self = new PredImageRequest();
        return TeaModel.build(map, self);
    }

    public PredImageRequest setCorrectVertical(Boolean correctVertical) {
        this.correctVertical = correctVertical;
        return this;
    }
    public Boolean getCorrectVertical() {
        return this.correctVertical;
    }

    public PredImageRequest setCountDetectDoor(Long countDetectDoor) {
        this.countDetectDoor = countDetectDoor;
        return this;
    }
    public Long getCountDetectDoor() {
        return this.countDetectDoor;
    }

    public PredImageRequest setDetectDoor(Boolean detectDoor) {
        this.detectDoor = detectDoor;
        return this;
    }
    public Boolean getDetectDoor() {
        return this.detectDoor;
    }

    public PredImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
