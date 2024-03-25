// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneViewList")
    public java.util.List<ListPtsSceneResponseBodySceneViewList> sceneViewList;

    @NameInMap("Success")
    public Boolean success;

    public static ListPtsSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsSceneResponseBody self = new ListPtsSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPtsSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsSceneResponseBody setSceneViewList(java.util.List<ListPtsSceneResponseBodySceneViewList> sceneViewList) {
        this.sceneViewList = sceneViewList;
        return this;
    }
    public java.util.List<ListPtsSceneResponseBodySceneViewList> getSceneViewList() {
        return this.sceneViewList;
    }

    public ListPtsSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsSceneResponseBodySceneViewList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Status")
        public String status;

        public static ListPtsSceneResponseBodySceneViewList build(java.util.Map<String, ?> map) throws Exception {
            ListPtsSceneResponseBodySceneViewList self = new ListPtsSceneResponseBodySceneViewList();
            return TeaModel.build(map, self);
        }

        public ListPtsSceneResponseBodySceneViewList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPtsSceneResponseBodySceneViewList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListPtsSceneResponseBodySceneViewList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListPtsSceneResponseBodySceneViewList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
