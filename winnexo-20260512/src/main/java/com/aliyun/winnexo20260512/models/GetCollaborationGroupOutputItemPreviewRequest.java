// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetCollaborationGroupOutputItemPreviewRequest extends TeaModel {
    /**
     * <p>The collaboration space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The output detail ID. This ID is obtained from the ref.id of a USER_OUTPUT_ITEM node or the space output list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51469466</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
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
