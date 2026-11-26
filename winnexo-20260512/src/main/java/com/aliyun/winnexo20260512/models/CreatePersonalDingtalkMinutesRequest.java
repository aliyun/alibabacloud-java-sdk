// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkMinutesRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The name of the worksheet.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes content (optional). The notes are used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The original Shanji note link (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("shanjiUrl")
    public String shanjiUrl;

    /**
     * <p>A list of resource tag JSON strings.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;,&quot;Shanji&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>692318833855074</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalDingtalkMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkMinutesRequest self = new CreatePersonalDingtalkMinutesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkMinutesRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreatePersonalDingtalkMinutesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDingtalkMinutesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalDingtalkMinutesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDingtalkMinutesRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalDingtalkMinutesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDingtalkMinutesRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalDingtalkMinutesRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalDingtalkMinutesRequest setShanjiUrl(String shanjiUrl) {
        this.shanjiUrl = shanjiUrl;
        return this;
    }
    public String getShanjiUrl() {
        return this.shanjiUrl;
    }

    public CreatePersonalDingtalkMinutesRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalDingtalkMinutesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
