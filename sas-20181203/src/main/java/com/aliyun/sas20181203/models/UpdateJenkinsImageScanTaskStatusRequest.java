// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageScanTaskStatusRequest extends TeaModel {
    // 任务执行结果，一般用于存储扫描失败的报错信息
    @NameInMap("Result")
    public String result;

    @NameInMap("SourceIp")
    public String sourceIp;

    // 处理阶段
    @NameInMap("Status")
    public String status;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    // jenkins 镜像仓库 token，必填
    @NameInMap("Token")
    public String token;

    public static UpdateJenkinsImageScanTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageScanTaskStatusRequest self = new UpdateJenkinsImageScanTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageScanTaskStatusRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public UpdateJenkinsImageScanTaskStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateJenkinsImageScanTaskStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateJenkinsImageScanTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateJenkinsImageScanTaskStatusRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
