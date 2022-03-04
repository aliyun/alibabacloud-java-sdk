// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class TextToVideoRequest extends TeaModel {
    @NameInMap("BeginAction")
    public String beginAction;

    @NameInMap("BeginText")
    public String beginText;

    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("EndAction")
    public String endAction;

    @NameInMap("EndText")
    public String endText;

    @NameInMap("ExtendParams")
    public java.util.Map<String, String> extendParams;

    @NameInMap("Id")
    public String id;

    @NameInMap("SceneType")
    public String sceneType;

    @NameInMap("SpeechText")
    public String speechText;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    public static TextToVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        TextToVideoRequest self = new TextToVideoRequest();
        return TeaModel.build(map, self);
    }

    public TextToVideoRequest setBeginAction(String beginAction) {
        this.beginAction = beginAction;
        return this;
    }
    public String getBeginAction() {
        return this.beginAction;
    }

    public TextToVideoRequest setBeginText(String beginText) {
        this.beginText = beginText;
        return this;
    }
    public String getBeginText() {
        return this.beginText;
    }

    public TextToVideoRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public TextToVideoRequest setEndAction(String endAction) {
        this.endAction = endAction;
        return this;
    }
    public String getEndAction() {
        return this.endAction;
    }

    public TextToVideoRequest setEndText(String endText) {
        this.endText = endText;
        return this;
    }
    public String getEndText() {
        return this.endText;
    }

    public TextToVideoRequest setExtendParams(java.util.Map<String, String> extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public java.util.Map<String, String> getExtendParams() {
        return this.extendParams;
    }

    public TextToVideoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TextToVideoRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public TextToVideoRequest setSpeechText(String speechText) {
        this.speechText = speechText;
        return this;
    }
    public String getSpeechText() {
        return this.speechText;
    }

    public TextToVideoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TextToVideoRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

}
