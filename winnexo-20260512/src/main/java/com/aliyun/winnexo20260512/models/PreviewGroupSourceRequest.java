// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewGroupSourceRequest extends TeaModel {
    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src_feishu_doc_1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. You can pass this parameter explicitly by using the --tenant-id option in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static PreviewGroupSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewGroupSourceRequest self = new PreviewGroupSourceRequest();
        return TeaModel.build(map, self);
    }

    public PreviewGroupSourceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PreviewGroupSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public PreviewGroupSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
