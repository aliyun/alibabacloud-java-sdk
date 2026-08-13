// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskUnderstandDetailShrinkRequest extends TeaModel {
    /**
     * <p>所属协作群组 ID（如 cg_101）；群任务理解时传入（调用者需为有效群成员），候选技能额外并入群绑定技能</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>数字员工名称列表，用于过滤可用技能；必传（传空列表表示仅用租户 global 技能）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeNameShrink;

    @NameInMap("segments")
    public String segmentsShrink;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>自然语言任务描述</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userInput")
    public String userInput;

    public static GetScheduledTaskUnderstandDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskUnderstandDetailShrinkRequest self = new GetScheduledTaskUnderstandDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskUnderstandDetailShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetScheduledTaskUnderstandDetailShrinkRequest setDigitalEmployeeNameShrink(String digitalEmployeeNameShrink) {
        this.digitalEmployeeNameShrink = digitalEmployeeNameShrink;
        return this;
    }
    public String getDigitalEmployeeNameShrink() {
        return this.digitalEmployeeNameShrink;
    }

    public GetScheduledTaskUnderstandDetailShrinkRequest setSegmentsShrink(String segmentsShrink) {
        this.segmentsShrink = segmentsShrink;
        return this;
    }
    public String getSegmentsShrink() {
        return this.segmentsShrink;
    }

    public GetScheduledTaskUnderstandDetailShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetScheduledTaskUnderstandDetailShrinkRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
