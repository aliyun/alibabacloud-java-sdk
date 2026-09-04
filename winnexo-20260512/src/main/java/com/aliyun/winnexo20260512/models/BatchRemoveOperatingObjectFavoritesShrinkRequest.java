// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchRemoveOperatingObjectFavoritesShrinkRequest extends TeaModel {
    /**
     * <p>The graph name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The list of primary object business IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contract-001</p>
     */
    @NameInMap("objectIds")
    public String objectIdsShrink;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The operating object name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer_assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly in winnexo-cli by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static BatchRemoveOperatingObjectFavoritesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveOperatingObjectFavoritesShrinkRequest self = new BatchRemoveOperatingObjectFavoritesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setObjectIdsShrink(String objectIdsShrink) {
        this.objectIdsShrink = objectIdsShrink;
        return this;
    }
    public String getObjectIdsShrink() {
        return this.objectIdsShrink;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
