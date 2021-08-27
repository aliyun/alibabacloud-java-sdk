// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class TextToVideoShrinkRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("SpeechText")
    public String speechText;

    @NameInMap("Id")
    public String id;

    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("SceneType")
    public String sceneType;

    @NameInMap("BeginText")
    public String beginText;

    @NameInMap("BeginAction")
    public String beginAction;

    @NameInMap("EndText")
    public String endText;

    @NameInMap("EndAction")
    public String endAction;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    @NameInMap("ExtendParams")
    public String extendParamsShrink;

    public static TextToVideoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TextToVideoShrinkRequest self = new TextToVideoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TextToVideoShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TextToVideoShrinkRequest setSpeechText(String speechText) {
        this.speechText = speechText;
        return this;
    }
    public String getSpeechText() {
        return this.speechText;
    }

    public TextToVideoShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TextToVideoShrinkRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public TextToVideoShrinkRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public TextToVideoShrinkRequest setBeginText(String beginText) {
        this.beginText = beginText;
        return this;
    }
    public String getBeginText() {
        return this.beginText;
    }

    public TextToVideoShrinkRequest setBeginAction(String beginAction) {
        this.beginAction = beginAction;
        return this;
    }
    public String getBeginAction() {
        return this.beginAction;
    }

    public TextToVideoShrinkRequest setEndText(String endText) {
        this.endText = endText;
        return this;
    }
    public String getEndText() {
        return this.endText;
    }

    public TextToVideoShrinkRequest setEndAction(String endAction) {
        this.endAction = endAction;
        return this;
    }
    public String getEndAction() {
        return this.endAction;
    }

    public TextToVideoShrinkRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

    public TextToVideoShrinkRequest setExtendParamsShrink(String extendParamsShrink) {
        this.extendParamsShrink = extendParamsShrink;
        return this;
    }
    public String getExtendParamsShrink() {
        return this.extendParamsShrink;
    }

}
