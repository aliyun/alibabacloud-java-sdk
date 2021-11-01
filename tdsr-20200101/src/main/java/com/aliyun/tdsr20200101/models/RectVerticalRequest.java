// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectVerticalRequest extends TeaModel {
    // 需要预测的门的数量
    @NameInMap("CountDetectDoor")
    public Integer countDetectDoor;

    // 是否开启门预测
    @NameInMap("DetectDoor")
    public Boolean detectDoor;

    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    // 矫正数据
    @NameInMap("VerticalRect")
    public String verticalRect;

    public static RectVerticalRequest build(java.util.Map<String, ?> map) throws Exception {
        RectVerticalRequest self = new RectVerticalRequest();
        return TeaModel.build(map, self);
    }

    public RectVerticalRequest setCountDetectDoor(Integer countDetectDoor) {
        this.countDetectDoor = countDetectDoor;
        return this;
    }
    public Integer getCountDetectDoor() {
        return this.countDetectDoor;
    }

    public RectVerticalRequest setDetectDoor(Boolean detectDoor) {
        this.detectDoor = detectDoor;
        return this;
    }
    public Boolean getDetectDoor() {
        return this.detectDoor;
    }

    public RectVerticalRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public RectVerticalRequest setVerticalRect(String verticalRect) {
        this.verticalRect = verticalRect;
        return this;
    }
    public String getVerticalRect() {
        return this.verticalRect;
    }

}
