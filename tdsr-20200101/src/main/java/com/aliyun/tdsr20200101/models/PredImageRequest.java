// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredImageRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    // 是否门预测
    @NameInMap("DetectDoor")
    public Boolean detectDoor;

    // 门数量(DetectDoor为false时，可为0)
    @NameInMap("CountDetectDoor")
    public Long countDetectDoor;

    // 是否垂直矫正
    @NameInMap("CorrectVertical")
    public Boolean correctVertical;

    public static PredImageRequest build(java.util.Map<String, ?> map) throws Exception {
        PredImageRequest self = new PredImageRequest();
        return TeaModel.build(map, self);
    }

    public PredImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public PredImageRequest setDetectDoor(Boolean detectDoor) {
        this.detectDoor = detectDoor;
        return this;
    }
    public Boolean getDetectDoor() {
        return this.detectDoor;
    }

    public PredImageRequest setCountDetectDoor(Long countDetectDoor) {
        this.countDetectDoor = countDetectDoor;
        return this;
    }
    public Long getCountDetectDoor() {
        return this.countDetectDoor;
    }

    public PredImageRequest setCorrectVertical(Boolean correctVertical) {
        this.correctVertical = correctVertical;
        return this;
    }
    public Boolean getCorrectVertical() {
        return this.correctVertical;
    }

}
