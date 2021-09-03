// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventSourceResponseBody extends TeaModel {
    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public CreateDefaultEventSourceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDefaultEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventSourceResponseBody self = new CreateDefaultEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventSourceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CreateDefaultEventSourceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CreateDefaultEventSourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDefaultEventSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDefaultEventSourceResponseBody setData(CreateDefaultEventSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDefaultEventSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateDefaultEventSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDefaultEventSourceResponseBodyData extends TeaModel {
        @NameInMap("EventSourceId")
        public String eventSourceId;

        @NameInMap("EventSourceName")
        public String eventSourceName;

        @NameInMap("EventSourceType")
        public String eventSourceType;

        @NameInMap("EventSourceCode")
        public String eventSourceCode;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("CreateId")
        public String createId;

        @NameInMap("ModifyId")
        public String modifyId;

        @NameInMap("OrgnizationId")
        public String orgnizationId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ErrDescription")
        public String errDescription;

        @NameInMap("IsUse")
        public Integer isUse;

        public static CreateDefaultEventSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDefaultEventSourceResponseBodyData self = new CreateDefaultEventSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDefaultEventSourceResponseBodyData setEventSourceId(String eventSourceId) {
            this.eventSourceId = eventSourceId;
            return this;
        }
        public String getEventSourceId() {
            return this.eventSourceId;
        }

        public CreateDefaultEventSourceResponseBodyData setEventSourceName(String eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }
        public String getEventSourceName() {
            return this.eventSourceName;
        }

        public CreateDefaultEventSourceResponseBodyData setEventSourceType(String eventSourceType) {
            this.eventSourceType = eventSourceType;
            return this;
        }
        public String getEventSourceType() {
            return this.eventSourceType;
        }

        public CreateDefaultEventSourceResponseBodyData setEventSourceCode(String eventSourceCode) {
            this.eventSourceCode = eventSourceCode;
            return this;
        }
        public String getEventSourceCode() {
            return this.eventSourceCode;
        }

        public CreateDefaultEventSourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateDefaultEventSourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDefaultEventSourceResponseBodyData setCreateId(String createId) {
            this.createId = createId;
            return this;
        }
        public String getCreateId() {
            return this.createId;
        }

        public CreateDefaultEventSourceResponseBodyData setModifyId(String modifyId) {
            this.modifyId = modifyId;
            return this;
        }
        public String getModifyId() {
            return this.modifyId;
        }

        public CreateDefaultEventSourceResponseBodyData setOrgnizationId(String orgnizationId) {
            this.orgnizationId = orgnizationId;
            return this;
        }
        public String getOrgnizationId() {
            return this.orgnizationId;
        }

        public CreateDefaultEventSourceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateDefaultEventSourceResponseBodyData setErrDescription(String errDescription) {
            this.errDescription = errDescription;
            return this;
        }
        public String getErrDescription() {
            return this.errDescription;
        }

        public CreateDefaultEventSourceResponseBodyData setIsUse(Integer isUse) {
            this.isUse = isUse;
            return this;
        }
        public Integer getIsUse() {
            return this.isUse;
        }

    }

}
