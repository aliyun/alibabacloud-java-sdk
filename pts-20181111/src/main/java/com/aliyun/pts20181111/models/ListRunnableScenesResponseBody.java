// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class ListRunnableScenesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenes")
    public ListRunnableScenesResponseBodyScenes scenes;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRunnableScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunnableScenesResponseBody self = new ListRunnableScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunnableScenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRunnableScenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRunnableScenesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRunnableScenesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRunnableScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunnableScenesResponseBody setScenes(ListRunnableScenesResponseBodyScenes scenes) {
        this.scenes = scenes;
        return this;
    }
    public ListRunnableScenesResponseBodyScenes getScenes() {
        return this.scenes;
    }

    public ListRunnableScenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRunnableScenesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRunnableScenesResponseBodyScenesScene extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("SceneId")
        public Long sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        public static ListRunnableScenesResponseBodyScenesScene build(java.util.Map<String, ?> map) throws Exception {
            ListRunnableScenesResponseBodyScenesScene self = new ListRunnableScenesResponseBodyScenesScene();
            return TeaModel.build(map, self);
        }

        public ListRunnableScenesResponseBodyScenesScene setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRunnableScenesResponseBodyScenesScene setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRunnableScenesResponseBodyScenesScene setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public ListRunnableScenesResponseBodyScenesScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class ListRunnableScenesResponseBodyScenes extends TeaModel {
        @NameInMap("Scene")
        public java.util.List<ListRunnableScenesResponseBodyScenesScene> scene;

        public static ListRunnableScenesResponseBodyScenes build(java.util.Map<String, ?> map) throws Exception {
            ListRunnableScenesResponseBodyScenes self = new ListRunnableScenesResponseBodyScenes();
            return TeaModel.build(map, self);
        }

        public ListRunnableScenesResponseBodyScenes setScene(java.util.List<ListRunnableScenesResponseBodyScenesScene> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<ListRunnableScenesResponseBodyScenesScene> getScene() {
            return this.scene;
        }

    }

}
