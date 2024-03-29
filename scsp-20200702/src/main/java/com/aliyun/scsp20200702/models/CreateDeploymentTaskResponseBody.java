// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDeploymentTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDeploymentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskResponseBody self = new CreateDeploymentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeploymentTaskResponseBody setData(CreateDeploymentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeploymentTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateDeploymentTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDeploymentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDeploymentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeploymentTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeploymentTaskResponseBodyData extends TeaModel {
        @NameInMap("DeploymentArchive")
        public DDeploymentArchive deploymentArchive;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public DPair status;

        public static CreateDeploymentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeploymentTaskResponseBodyData self = new CreateDeploymentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeploymentTaskResponseBodyData setDeploymentArchive(DDeploymentArchive deploymentArchive) {
            this.deploymentArchive = deploymentArchive;
            return this;
        }
        public DDeploymentArchive getDeploymentArchive() {
            return this.deploymentArchive;
        }

        public CreateDeploymentTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDeploymentTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDeploymentTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDeploymentTaskResponseBodyData setStatus(DPair status) {
            this.status = status;
            return this;
        }
        public DPair getStatus() {
            return this.status;
        }

    }

}
