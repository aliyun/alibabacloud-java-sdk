// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ListModelTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListModelTaskResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListModelTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelTaskResponseBody self = new ListModelTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelTaskResponseBody setData(java.util.List<ListModelTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListModelTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListModelTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListModelTaskResponseBodyData extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("modelBcId")
        public String modelBcId;

        @NameInMap("modelComment")
        public String modelComment;

        @NameInMap("modelDownloadUrl")
        public String modelDownloadUrl;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("modelTags")
        public String modelTags;

        @NameInMap("status")
        public String status;

        @NameInMap("statusName")
        public String statusName;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskName")
        public String taskName;

        @NameInMap("umengUid")
        public String umengUid;

        public static ListModelTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelTaskResponseBodyData self = new ListModelTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListModelTaskResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListModelTaskResponseBodyData setModelBcId(String modelBcId) {
            this.modelBcId = modelBcId;
            return this;
        }
        public String getModelBcId() {
            return this.modelBcId;
        }

        public ListModelTaskResponseBodyData setModelComment(String modelComment) {
            this.modelComment = modelComment;
            return this;
        }
        public String getModelComment() {
            return this.modelComment;
        }

        public ListModelTaskResponseBodyData setModelDownloadUrl(String modelDownloadUrl) {
            this.modelDownloadUrl = modelDownloadUrl;
            return this;
        }
        public String getModelDownloadUrl() {
            return this.modelDownloadUrl;
        }

        public ListModelTaskResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelTaskResponseBodyData setModelTags(String modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public String getModelTags() {
            return this.modelTags;
        }

        public ListModelTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListModelTaskResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public ListModelTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListModelTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListModelTaskResponseBodyData setUmengUid(String umengUid) {
            this.umengUid = umengUid;
            return this;
        }
        public String getUmengUid() {
            return this.umengUid;
        }

    }

}
