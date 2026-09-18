// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveGroupResourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码，成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>协作空间 ID</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>移动前的目录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>移动的资料 ID，移动前后保持不变</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>移动后的目录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("targetDirectoryId")
    public String targetDirectoryId;

    public static MoveGroupResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupResourceResponseBody self = new MoveGroupResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveGroupResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MoveGroupResourceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MoveGroupResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveGroupResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveGroupResourceResponseBody setSourceDirectoryId(String sourceDirectoryId) {
        this.sourceDirectoryId = sourceDirectoryId;
        return this;
    }
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    public MoveGroupResourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MoveGroupResourceResponseBody setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

}
