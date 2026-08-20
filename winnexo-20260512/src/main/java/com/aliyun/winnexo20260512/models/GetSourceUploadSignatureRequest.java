// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceUploadSignatureRequest extends TeaModel {
    /**
     * <p>The content type. Valid values: Text and Markdown.</p>
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
     * <p>The name of the digital employee (operating object name). This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

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

    public GetSourceUploadSignatureRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
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
