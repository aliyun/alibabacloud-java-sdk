// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchRemoveOperatingObjectFavoritesRequest extends TeaModel {
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
    public java.util.List<String> objectIds;

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

    public static BatchRemoveOperatingObjectFavoritesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveOperatingObjectFavoritesRequest self = new BatchRemoveOperatingObjectFavoritesRequest();
        return TeaModel.build(map, self);
    }

    public BatchRemoveOperatingObjectFavoritesRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public BatchRemoveOperatingObjectFavoritesRequest setObjectIds(java.util.List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    public BatchRemoveOperatingObjectFavoritesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public BatchRemoveOperatingObjectFavoritesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public BatchRemoveOperatingObjectFavoritesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
