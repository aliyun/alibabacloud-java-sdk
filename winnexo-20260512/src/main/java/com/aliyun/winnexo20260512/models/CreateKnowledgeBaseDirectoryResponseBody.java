// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseDirectoryResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>分类描述</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>新建分类 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>目录 KB 归属类型：normal / aliding_kb_root / aliding_kb_internal</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("directoryKind")
    public String directoryKind;

    /**
     * <p>创建时间戳（毫秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>修改时间戳（毫秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>父分类 ID；新分类挂在租户根目录下时返回 null</p>
     * 
     * <strong>example:</strong>
     * <p>exampleParentDirectoryId</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>文件 OSS URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateKnowledgeBaseDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseDirectoryResponseBody self = new CreateKnowledgeBaseDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDirectoryKind(String directoryKind) {
        this.directoryKind = directoryKind;
        return this;
    }
    public String getDirectoryKind() {
        return this.directoryKind;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
