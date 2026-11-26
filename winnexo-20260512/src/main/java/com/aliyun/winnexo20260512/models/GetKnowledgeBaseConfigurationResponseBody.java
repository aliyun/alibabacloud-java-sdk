// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseConfigurationResponseBody extends TeaModel {
    /**
     * <p>是否开启后续内容更新的 AI 版本摘要</p>
     */
    @NameInMap("changeRecordEnabled")
    public Boolean changeRecordEnabled;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>企业知识库根目录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>错误描述，成功时为 success</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>数字员工可见模式；历史未显式设置 ALL 的配置按 SPECIFIED 返回</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED</p>
     */
    @NameInMap("ooVisibilityMode")
    public String ooVisibilityMode;

    /**
     * <p>显式关联的数字员工名称；ALL 返回空数组，SPECIFIED 空数组表示没有关联员工</p>
     */
    @NameInMap("operatingObjectNames")
    public java.util.List<String> operatingObjectNames;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetKnowledgeBaseConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseConfigurationResponseBody self = new GetKnowledgeBaseConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseConfigurationResponseBody setChangeRecordEnabled(Boolean changeRecordEnabled) {
        this.changeRecordEnabled = changeRecordEnabled;
        return this;
    }
    public Boolean getChangeRecordEnabled() {
        return this.changeRecordEnabled;
    }

    public GetKnowledgeBaseConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseConfigurationResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetKnowledgeBaseConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseConfigurationResponseBody setOoVisibilityMode(String ooVisibilityMode) {
        this.ooVisibilityMode = ooVisibilityMode;
        return this;
    }
    public String getOoVisibilityMode() {
        return this.ooVisibilityMode;
    }

    public GetKnowledgeBaseConfigurationResponseBody setOperatingObjectNames(java.util.List<String> operatingObjectNames) {
        this.operatingObjectNames = operatingObjectNames;
        return this;
    }
    public java.util.List<String> getOperatingObjectNames() {
        return this.operatingObjectNames;
    }

    public GetKnowledgeBaseConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
