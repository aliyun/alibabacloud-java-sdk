// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGroupSourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>资料描述</p>
     * 
     * <strong>example:</strong>
     * <p>recorder function</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>创建时间，ISO8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-26T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>修改时间，ISO8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T14:00:00+08:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>本次授权读取的协作空间ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>资料名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>资料实际范围；引用资料保留 PERSONAL 或 TENANT</p>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>资料ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>知识归属类型，沿用 Source 分类</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceKind")
    public String sourceKind;

    /**
     * <p>资料标签JSON字符串列表</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;重点&quot;,&quot;文档&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>资料类型，例如 TEXT、FILE、ONLINE_DOC、FEISHU</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>当前资料状态，例如 READY、RUNNING、FAILED</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static GetGroupSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupSourceResponseBody self = new GetGroupSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGroupSourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGroupSourceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetGroupSourceResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetGroupSourceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetGroupSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGroupSourceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetGroupSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupSourceResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetGroupSourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetGroupSourceResponseBody setSourceKind(String sourceKind) {
        this.sourceKind = sourceKind;
        return this;
    }
    public String getSourceKind() {
        return this.sourceKind;
    }

    public GetGroupSourceResponseBody setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public GetGroupSourceResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetGroupSourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
