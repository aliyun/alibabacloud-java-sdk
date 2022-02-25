// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadAnalyzerRuntimeLogRequest extends TeaModel {
    // 日志内容
    @NameInMap("Content")
    public String content;

    // 扩展内容
    @NameInMap("ExtendedContent")
    public java.util.Map<String, ?> extendedContent;

    // 日志级别
    @NameInMap("Level")
    public String level;

    @NameInMap("SourceIp")
    public String sourceIp;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    // token
    @NameInMap("Token")
    public String token;

    public static UploadAnalyzerRuntimeLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAnalyzerRuntimeLogRequest self = new UploadAnalyzerRuntimeLogRequest();
        return TeaModel.build(map, self);
    }

    public UploadAnalyzerRuntimeLogRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadAnalyzerRuntimeLogRequest setExtendedContent(java.util.Map<String, ?> extendedContent) {
        this.extendedContent = extendedContent;
        return this;
    }
    public java.util.Map<String, ?> getExtendedContent() {
        return this.extendedContent;
    }

    public UploadAnalyzerRuntimeLogRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public UploadAnalyzerRuntimeLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadAnalyzerRuntimeLogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UploadAnalyzerRuntimeLogRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
