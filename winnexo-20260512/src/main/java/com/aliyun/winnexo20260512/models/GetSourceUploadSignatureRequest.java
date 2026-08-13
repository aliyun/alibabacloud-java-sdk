// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceUploadSignatureRequest extends TeaModel {
    /**
     * <p>文件 Content-Type（可选，不传则自动推断）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>签名 URL 过期时间（秒），默认 3600</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("expires")
    public Long expires;

    /**
     * <p>文件名（含后缀，如 report.pdf）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <p>Agent 命名空间标识（数字员工名称）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>数据源归属范围: source（个人数据源，映射 PERSONAL）/ knowledge（企业知识库，映射 TENANT）</p>
     * 
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
