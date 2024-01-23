// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListOpenJMeterScenesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JMeterScene")
    public java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> JMeterScene;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOpenJMeterScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenJMeterScenesResponseBody self = new ListOpenJMeterScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenJMeterScenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOpenJMeterScenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOpenJMeterScenesResponseBody setJMeterScene(java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> JMeterScene) {
        this.JMeterScene = JMeterScene;
        return this;
    }
    public java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> getJMeterScene() {
        return this.JMeterScene;
    }

    public ListOpenJMeterScenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOpenJMeterScenesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOpenJMeterScenesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOpenJMeterScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenJMeterScenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOpenJMeterScenesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOpenJMeterScenesResponseBodyJMeterScene extends TeaModel {
        @NameInMap("DurationStr")
        public String durationStr;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Status")
        public String status;

        public static ListOpenJMeterScenesResponseBodyJMeterScene build(java.util.Map<String, ?> map) throws Exception {
            ListOpenJMeterScenesResponseBodyJMeterScene self = new ListOpenJMeterScenesResponseBodyJMeterScene();
            return TeaModel.build(map, self);
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setDurationStr(String durationStr) {
            this.durationStr = durationStr;
            return this;
        }
        public String getDurationStr() {
            return this.durationStr;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
