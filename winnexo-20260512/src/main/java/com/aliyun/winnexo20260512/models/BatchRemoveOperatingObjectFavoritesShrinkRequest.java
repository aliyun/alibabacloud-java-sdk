// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchRemoveOperatingObjectFavoritesShrinkRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If provided, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

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
     * <p>The list of business IDs for the primary objects.</p>
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
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, it is explicitly passed by using the --tenant-id option.</p>
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

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public BatchRemoveOperatingObjectFavoritesShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
