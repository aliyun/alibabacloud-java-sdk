// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseShrinkRequest extends TeaModel {
    /**
     * <p>目标个人目录 ID；不传时自动绑定到用户默认根目录，传入时必须是当前用户的已有个人目录（PERSONAL）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>知识库显示名称；不传时由后台从远程拉取的根节点名称回填</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("kbName")
    public String kbName;

    /**
     * <p>阿里钉知识库的可公开访问 URL</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("kbUrl")
    public String kbUrl;

    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>Agent 命名空间标识，可选</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    @NameInMap("syncConfig")
    public String syncConfigShrink;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
