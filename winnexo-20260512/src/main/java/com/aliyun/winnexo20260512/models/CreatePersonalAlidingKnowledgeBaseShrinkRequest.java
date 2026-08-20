// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseShrinkRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The display name of the knowledge base. If not provided, the name is populated from the root node name pulled from the remote source.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("kbName")
    public String kbName;

    /**
     * <p>The publicly accessible URL of the AliDing knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("kbUrl")
    public String kbUrl;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The synchronization settings.</p>
     */
    @NameInMap("syncConfig")
    public String syncConfigShrink;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalAlidingKnowledgeBaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAlidingKnowledgeBaseShrinkRequest self = new CreatePersonalAlidingKnowledgeBaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setKbName(String kbName) {
        this.kbName = kbName;
        return this;
    }
    public String getKbName() {
        return this.kbName;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setKbUrl(String kbUrl) {
        this.kbUrl = kbUrl;
        return this;
    }
    public String getKbUrl() {
        return this.kbUrl;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setSyncConfigShrink(String syncConfigShrink) {
        this.syncConfigShrink = syncConfigShrink;
        return this;
    }
    public String getSyncConfigShrink() {
        return this.syncConfigShrink;
    }

    public CreatePersonalAlidingKnowledgeBaseShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
