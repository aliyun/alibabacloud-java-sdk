// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectVerticalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CountDetectDoor")
    public Integer countDetectDoor;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DetectDoor")
    public Boolean detectDoor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("SubSceneId")
    public String subSceneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;844946777965268992&quot;:[[0.42418407210144654,0.33625107620738004,0.42620819117478337,0.635753199572695],[0.5158627587152769,0.3071978991900134,0.5177513758740194,0.6312118011104786],[0.582693212445534,0.3733969265933281,0.5807612760319687,0.6139402811250833]]}</p>
     */
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
