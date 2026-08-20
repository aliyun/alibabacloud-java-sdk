// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RecommendNextActionsRequest extends TeaModel {
    /**
     * <p>The extraction instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>Only recommend next steps related to data analysis</p>
     */
    @NameInMap("customPrompt")
    public String customPrompt;

    /**
     * <p>The output type: <code>conversation/skill/task</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>followUpOnly</p>
     */
    @NameInMap("outputType")
    public String outputType;

    /**
     * <p>The number of recent messages used to assemble contextual information.</p>
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
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this explicitly with --tenant-id.</p>
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

    public RecommendNextActionsRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
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
