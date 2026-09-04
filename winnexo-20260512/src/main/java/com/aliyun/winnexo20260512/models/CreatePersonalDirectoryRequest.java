// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDirectoryRequest extends TeaModel {
    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-release-version-3-eventbridge-numeric-queue-fix-20260529</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the digital employee.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-conversation-webpage-github-default-p32JG2</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The folder ID.</p>
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
     * <p>235454102432001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDirectoryRequest self = new CreatePersonalDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDirectoryRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreatePersonalDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
