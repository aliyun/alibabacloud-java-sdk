// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitImageAnalysisOutputRequest extends TeaModel {
    // 等同 msgBody
    @NameInMap("Body")
    public String body;

    // 是否gzip压缩
    @NameInMap("IsCompress")
    public Boolean isCompress;

    // 是否加密
    @NameInMap("IsEncrypt")
    public Boolean isEncrypt;

    @NameInMap("SourceIp")
    public String sourceIp;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    // token
    @NameInMap("Token")
    public String token;

    // 等同 handler code
    @NameInMap("Type")
    public String type;

    public static SubmitImageAnalysisOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageAnalysisOutputRequest self = new SubmitImageAnalysisOutputRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageAnalysisOutputRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SubmitImageAnalysisOutputRequest setIsCompress(Boolean isCompress) {
        this.isCompress = isCompress;
        return this;
    }
    public Boolean getIsCompress() {
        return this.isCompress;
    }

    public SubmitImageAnalysisOutputRequest setIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }
    public Boolean getIsEncrypt() {
        return this.isEncrypt;
    }

    public SubmitImageAnalysisOutputRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SubmitImageAnalysisOutputRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SubmitImageAnalysisOutputRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitImageAnalysisOutputRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
