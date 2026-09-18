// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceGroupSourceFileResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>替换后的文件 OSS 地址</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example/new.txt</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>替换后的文件访问 URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/new.txt">https://example.com/new.txt</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>替换后的文件记录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>file_example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>操作后的资料名称，沿用已有名称维护规则</p>
     * 
     * <strong>example:</strong>
     * <p>项目资料</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>资料 ID；替换、编辑、重新解析均保持该 ID</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>资料类型</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>当前资料状态；RUNNING 表示处理中，异步受理不代表解析完成</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("status")
    public String status;

    public static ReplaceGroupSourceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceGroupSourceFileResponseBody self = new ReplaceGroupSourceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceGroupSourceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceGroupSourceFileResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ReplaceGroupSourceFileResponseBody setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public ReplaceGroupSourceFileResponseBody setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public ReplaceGroupSourceFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceGroupSourceFileResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ReplaceGroupSourceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceGroupSourceFileResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceGroupSourceFileResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ReplaceGroupSourceFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
