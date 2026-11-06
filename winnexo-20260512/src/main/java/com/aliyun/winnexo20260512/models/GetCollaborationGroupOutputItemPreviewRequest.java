// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetCollaborationGroupOutputItemPreviewRequest extends TeaModel {
    /**
     * <p>协作空间ID，必填，长度1至64。调用者必须是该租户下该空间的有效成员。可从ListCollaborationGroups返回的items中获取。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>对话生成文件的产出明细ID。取GetNodeDetail返回的artifacts中ref.kind为USER_OUTPUT_ITEM的ref.id；不是artifactId。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51469466</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>业务租户ID，可选。必须属于当前调用身份的可访问租户；无权访问时拒绝请求。未传时按现有鉴权规则解析租户，多租户用户无法唯一确定时需显式指定。</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetCollaborationGroupOutputItemPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCollaborationGroupOutputItemPreviewRequest self = new GetCollaborationGroupOutputItemPreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetCollaborationGroupOutputItemPreviewRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetCollaborationGroupOutputItemPreviewRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public GetCollaborationGroupOutputItemPreviewRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
