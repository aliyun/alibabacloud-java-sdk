// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListScenesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListScenesResponseData> data;

    public static ListScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponse self = new ListScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListScenesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListScenesResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListScenesResponse setData(java.util.List<ListScenesResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListScenesResponseData> getData() {
        return this.data;
    }

    public static class ListScenesResponseData extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        public static ListScenesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseData self = new ListScenesResponseData();
            return TeaModel.build(map, self);
        }

        public ListScenesResponseData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
