// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppTasksResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 应用任务列表
    @NameInMap("Data")
    public java.util.List<GetAppTasksResponseBodyData> data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetAppTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppTasksResponseBody self = new GetAppTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAppTasksResponseBody setData(java.util.List<GetAppTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAppTasksResponseBodyData> getData() {
        return this.data;
    }

    public GetAppTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppTasksResponseBodyData extends TeaModel {
        // id
        @NameInMap("Id")
        public String id;

        // 名称
        @NameInMap("Name")
        public String name;

        // 创建时间
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 更新时间
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 当前应用快照
        @NameInMap("AppArchive")
        public DAppArchive appArchive;

        // 基线应用快照
        @NameInMap("BaseAppArchive")
        public DAppArchive baseAppArchive;

        // 状态
        @NameInMap("Status")
        public DPair status;

        // 资源计数
        @NameInMap("ResCount")
        public DAppResCount resCount;

        // 待处理资源计数
        @NameInMap("PendingResCount")
        public DAppResCount pendingResCount;

        public static GetAppTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppTasksResponseBodyData self = new GetAppTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppTasksResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppTasksResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppTasksResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppTasksResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAppTasksResponseBodyData setAppArchive(DAppArchive appArchive) {
            this.appArchive = appArchive;
            return this;
        }
        public DAppArchive getAppArchive() {
            return this.appArchive;
        }

        public GetAppTasksResponseBodyData setBaseAppArchive(DAppArchive baseAppArchive) {
            this.baseAppArchive = baseAppArchive;
            return this;
        }
        public DAppArchive getBaseAppArchive() {
            return this.baseAppArchive;
        }

        public GetAppTasksResponseBodyData setStatus(DPair status) {
            this.status = status;
            return this;
        }
        public DPair getStatus() {
            return this.status;
        }

        public GetAppTasksResponseBodyData setResCount(DAppResCount resCount) {
            this.resCount = resCount;
            return this;
        }
        public DAppResCount getResCount() {
            return this.resCount;
        }

        public GetAppTasksResponseBodyData setPendingResCount(DAppResCount pendingResCount) {
            this.pendingResCount = pendingResCount;
            return this;
        }
        public DAppResCount getPendingResCount() {
            return this.pendingResCount;
        }

    }

}
