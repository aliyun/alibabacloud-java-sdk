// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupPublicUrlRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is performed as the user identified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>Group collaboration document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_tenant_kb_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The ID of the project group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>Corporate Policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The content of the meeting notes. This parameter is optional and is used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract the applicable scope and key terms</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the digital employee. This parameter is optional.</p>
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
     * <p>The URL of the web page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A">https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A</a></p>
     */
    @NameInMap("originalUrl")
    public String originalUrl;

    /**
     * <p>The resource tags. This parameter is optional. Specify a JSON array of strings, such as [&quot;tagA&quot;,&quot;tagB&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;, &quot;Meeting&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The ID of the tenant where the operation takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateGroupPublicUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupPublicUrlRequest self = new CreateGroupPublicUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupPublicUrlRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateGroupPublicUrlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupPublicUrlRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupPublicUrlRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupPublicUrlRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupPublicUrlRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateGroupPublicUrlRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateGroupPublicUrlRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateGroupPublicUrlRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateGroupPublicUrlRequest setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public CreateGroupPublicUrlRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupPublicUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
