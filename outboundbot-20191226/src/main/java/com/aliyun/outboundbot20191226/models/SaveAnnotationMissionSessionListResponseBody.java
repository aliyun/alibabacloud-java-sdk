// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionSessionListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SaveAnnotationMissionSessionListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>76E93048-F90F-57B7-BD46-6097611A706D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveAnnotationMissionSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionSessionListResponseBody self = new SaveAnnotationMissionSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionSessionListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveAnnotationMissionSessionListResponseBody setData(SaveAnnotationMissionSessionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveAnnotationMissionSessionListResponseBodyData getData() {
        return this.data;
    }

    public SaveAnnotationMissionSessionListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveAnnotationMissionSessionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveAnnotationMissionSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveAnnotationMissionSessionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest extends TeaModel {
        @NameInMap("AnnotationMissionSessionListJsonString")
        public String annotationMissionSessionListJsonString;

        public static SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest self = new SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest setAnnotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
            this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
            return this;
        }
        public String getAnnotationMissionSessionListJsonString() {
            return this.annotationMissionSessionListJsonString;
        }

    }

    public static class SaveAnnotationMissionSessionListResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageList")
        public java.util.List<String> messageList;

        @NameInMap("SaveAnnotationMissionSessionListRequest")
        public SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SaveAnnotationMissionSessionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListResponseBodyData self = new SaveAnnotationMissionSessionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SaveAnnotationMissionSessionListResponseBodyData setMessageList(java.util.List<String> messageList) {
            this.messageList = messageList;
            return this;
        }
        public java.util.List<String> getMessageList() {
            return this.messageList;
        }

        public SaveAnnotationMissionSessionListResponseBodyData setSaveAnnotationMissionSessionListRequest(SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest) {
            this.saveAnnotationMissionSessionListRequest = saveAnnotationMissionSessionListRequest;
            return this;
        }
        public SaveAnnotationMissionSessionListResponseBodyDataSaveAnnotationMissionSessionListRequest getSaveAnnotationMissionSessionListRequest() {
            return this.saveAnnotationMissionSessionListRequest;
        }

        public SaveAnnotationMissionSessionListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
