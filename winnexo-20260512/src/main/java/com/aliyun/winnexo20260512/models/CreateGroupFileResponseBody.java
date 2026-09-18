// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFileResponseBody extends TeaModel {
    /**
     * <p>业务状态码，成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>解析并绑定的真实目录ID</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>创建时间，ISO8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>协作空间ID</p>
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
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Provider处理后的实际资料名称</p>
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
     * <p>资料范围，固定GROUP</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>新建资料ID</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>实际资料状态；RUNNING表示处理中，FAILED表示创建处理失败</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateGroupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFileResponseBody self = new CreateGroupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupFileResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFileResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateGroupFileResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupFileResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupFileResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateGroupFileResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateGroupFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
