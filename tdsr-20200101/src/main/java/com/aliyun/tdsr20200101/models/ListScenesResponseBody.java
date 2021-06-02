// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListScenesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListScenesResponseBodyData> data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponseBody self = new ListScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenesResponseBody setData(java.util.List<ListScenesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListScenesResponseBodyData> getData() {
        return this.data;
    }

    public ListScenesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListScenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScenesResponseBodyData extends TeaModel {
        @NameInMap("SceneId")
        public String sceneId;

        public static ListScenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseBodyData self = new ListScenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScenesResponseBodyData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
