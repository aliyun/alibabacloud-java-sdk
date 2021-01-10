// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetTSMiddlewareInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetTSMiddlewareInstanceResponseBodyData data;

    public static GetTSMiddlewareInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTSMiddlewareInstanceResponseBody self = new GetTSMiddlewareInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTSMiddlewareInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTSMiddlewareInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTSMiddlewareInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetTSMiddlewareInstanceResponseBody setData(GetTSMiddlewareInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTSMiddlewareInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class GetTSMiddlewareInstanceResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static GetTSMiddlewareInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTSMiddlewareInstanceResponseBodyData self = new GetTSMiddlewareInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTSMiddlewareInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTSMiddlewareInstanceResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTSMiddlewareInstanceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
