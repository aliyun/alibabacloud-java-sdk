// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDirectoryResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>目录描述</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>新建目录 ID</p>
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
     * <p>所属数字员工名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>父目录 ID（service 若回填默认根目录，这里返回回填后的父目录 ID）</p>
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

    public static CreatePersonalDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDirectoryResponseBody self = new CreatePersonalDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalDirectoryResponseBody setDirectoryKind(String directoryKind) {
        this.directoryKind = directoryKind;
        return this;
    }
    public String getDirectoryKind() {
        return this.directoryKind;
    }

    public CreatePersonalDirectoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalDirectoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreatePersonalDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDirectoryResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreatePersonalDirectoryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreatePersonalDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
