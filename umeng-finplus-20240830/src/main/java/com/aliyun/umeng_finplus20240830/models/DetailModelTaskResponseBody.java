// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class DetailModelTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DetailModelTaskResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DetailModelTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailModelTaskResponseBody self = new DetailModelTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailModelTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetailModelTaskResponseBody setData(DetailModelTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetailModelTaskResponseBodyData getData() {
        return this.data;
    }

    public DetailModelTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DetailModelTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailModelTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DetailModelTaskResponseBodyData extends TeaModel {
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

        public static DetailModelTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetailModelTaskResponseBodyData self = new DetailModelTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetailModelTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DetailModelTaskResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DetailModelTaskResponseBodyData setModelBcId(String modelBcId) {
            this.modelBcId = modelBcId;
            return this;
        }
        public String getModelBcId() {
            return this.modelBcId;
        }

        public DetailModelTaskResponseBodyData setModelComment(String modelComment) {
            this.modelComment = modelComment;
            return this;
        }
        public String getModelComment() {
            return this.modelComment;
        }

        public DetailModelTaskResponseBodyData setModelDownloadUrl(String modelDownloadUrl) {
            this.modelDownloadUrl = modelDownloadUrl;
            return this;
        }
        public String getModelDownloadUrl() {
            return this.modelDownloadUrl;
        }

        public DetailModelTaskResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DetailModelTaskResponseBodyData setModelTags(String modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public String getModelTags() {
            return this.modelTags;
        }

        public DetailModelTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DetailModelTaskResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DetailModelTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DetailModelTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DetailModelTaskResponseBodyData setUmengUid(String umengUid) {
            this.umengUid = umengUid;
            return this;
        }
        public String getUmengUid() {
            return this.umengUid;
        }

    }

}
