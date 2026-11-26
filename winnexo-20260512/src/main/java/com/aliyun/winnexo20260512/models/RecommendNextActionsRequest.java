// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RecommendNextActionsRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The extraction instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>Only recommend next steps related to data analysis</p>
     */
    @NameInMap("customPrompt")
    public String customPrompt;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The output type: <code>conversation/skill/task</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>followUpOnly</p>
     */
    @NameInMap("outputType")
    public String outputType;

    /**
     * <p>The number of recent messages used to assemble the contextual information.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("recentMessageCount")
    public Long recentMessageCount;

    /**
     * <p>The session ID to filter by. If specified, returns all Active/Expired status information associated with this session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this value explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RecommendNextActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RecommendNextActionsRequest self = new RecommendNextActionsRequest();
        return TeaModel.build(map, self);
    }

    public RecommendNextActionsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public RecommendNextActionsRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public RecommendNextActionsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public RecommendNextActionsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public RecommendNextActionsRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public RecommendNextActionsRequest setRecentMessageCount(Long recentMessageCount) {
        this.recentMessageCount = recentMessageCount;
        return this;
    }
    public Long getRecentMessageCount() {
        return this.recentMessageCount;
    }

    public RecommendNextActionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecommendNextActionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
