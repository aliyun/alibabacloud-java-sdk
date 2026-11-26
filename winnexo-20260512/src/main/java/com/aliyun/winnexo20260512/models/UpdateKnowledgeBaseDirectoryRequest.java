// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseDirectoryRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If you specify this parameter, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the to-do card type.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as <code>source_uid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxy user, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as <code>winnexo_uid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The ID of the parent directory.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleParentDirectoryId</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateKnowledgeBaseDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseDirectoryRequest self = new UpdateKnowledgeBaseDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseDirectoryRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateKnowledgeBaseDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateKnowledgeBaseDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeBaseDirectoryRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateKnowledgeBaseDirectoryRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateKnowledgeBaseDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public UpdateKnowledgeBaseDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
