// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class StartSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TeamId")
    public Long teamId;

    @NameInMap("UserId")
    public Long userId;

    public static StartSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSceneRequest self = new StartSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public StartSceneRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public StartSceneRequest setTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    public Long getTeamId() {
        return this.teamId;
    }

    public StartSceneRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
