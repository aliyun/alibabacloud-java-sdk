// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseDirectoryRequest extends TeaModel {
    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>recorder function</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oklabs_tongyici</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wd-lxykjnnw4lyl9eq</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>692318833855074</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateKnowledgeBaseDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseDirectoryRequest self = new CreateKnowledgeBaseDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateKnowledgeBaseDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
