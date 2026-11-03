// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the built-in registry of SAE. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>If you set this parameter to true, a shared registry and related information are created for the namespace. After the shared registry is created, it cannot be disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMicroRegistration")
    public Boolean enableMicroRegistration;

    /**
     * <p>The short namespace ID. You do not need to include the region ID. The value can contain only lowercase letters and digits and cannot exceed 20 characters in length. We recommend that you use this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The namespace description. The value cannot exceed 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("NamespaceDescription")
    public String namespaceDescription;

    /**
     * <p>The long namespace ID. If you specify this parameter, it takes effect and NameSpaceShortId is ignored. This parameter is retained for backward compatibility. We recommend that you use the short namespace ID. The format is <code>&lt;RegionId&gt;:&lt;NamespaceId&gt;</code>. <code>NamespaceId</code> can contain only lowercase letters and digits, such as <code>cn-beijing:test</code>. The value cannot exceed 32 characters in length. For more information about the <strong>RegionId</strong> values supported by SAE, see <a href="https://help.aliyun.com/document_detail/2834842.html">DescribeRegions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The namespace name. The value cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static UpdateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceRequest self = new UpdateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceRequest setEnableMicroRegistration(Boolean enableMicroRegistration) {
        this.enableMicroRegistration = enableMicroRegistration;
        return this;
    }
    public Boolean getEnableMicroRegistration() {
        return this.enableMicroRegistration;
    }

    public UpdateNamespaceRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public UpdateNamespaceRequest setNamespaceDescription(String namespaceDescription) {
        this.namespaceDescription = namespaceDescription;
        return this;
    }
    public String getNamespaceDescription() {
        return this.namespaceDescription;
    }

    public UpdateNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
