// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceUploadSignatureRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The content type. Valid values:</p>
     * <ul>
     * <li>Text</li>
     * <li>Markdown</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The expiration time of the signed URL, in seconds. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("expires")
    public Long expires;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <p>The collaboration space ID passed from the frontend. This parameter is required when scope is set to group. The value must be a space accessible to the current user and is used in the OSS path for locating. The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). This parameter is not used for other scope values.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

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
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The tenant ID to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetSourceUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourceUploadSignatureRequest self = new GetSourceUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetSourceUploadSignatureRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public GetSourceUploadSignatureRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetSourceUploadSignatureRequest setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

    public GetSourceUploadSignatureRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetSourceUploadSignatureRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetSourceUploadSignatureRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public GetSourceUploadSignatureRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public GetSourceUploadSignatureRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public GetSourceUploadSignatureRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSourceUploadSignatureRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
