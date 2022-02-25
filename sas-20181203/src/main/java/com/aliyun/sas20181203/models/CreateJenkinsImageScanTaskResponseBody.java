// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateJenkinsImageScanTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static CreateJenkinsImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageScanTaskResponseBody self = new CreateJenkinsImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageScanTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateJenkinsImageScanTaskResponseBody setData(CreateJenkinsImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateJenkinsImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateJenkinsImageScanTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateJenkinsImageScanTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateJenkinsImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJenkinsImageScanTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateJenkinsImageScanTaskResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class CreateJenkinsImageScanTaskResponseBodyData extends TeaModel {
        // 镜像扫描授权数目
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        // repoId
        @NameInMap("RepoId")
        public String repoId;

        // 镜像仓实例id
        @NameInMap("RepoInstanceId")
        public String repoInstanceId;

        // 镜像仓regionId
        @NameInMap("RepoRegionId")
        public String repoRegionId;

        // 扫描任务 id
        @NameInMap("TaskId")
        public String taskId;

        // 资产 uuid
        @NameInMap("Uuid")
        public String uuid;

        public static CreateJenkinsImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateJenkinsImageScanTaskResponseBodyData self = new CreateJenkinsImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateJenkinsImageScanTaskResponseBodyData setImageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoInstanceId(String repoInstanceId) {
            this.repoInstanceId = repoInstanceId;
            return this;
        }
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
