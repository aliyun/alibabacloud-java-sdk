// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the built-in service registry of SAE.</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * <p>The default value is true. If you do not use the built-in service registry, set this parameter to false to speed up namespace creation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMicroRegistration")
    public Boolean enableMicroRegistration;

    /**
     * <p>The short-format namespace ID. You do not need to specify a region ID. This parameter is recommended. The ID cannot exceed 20 characters in length and can contain only lowercase letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The description of the namespace. The description cannot exceed 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("NamespaceDescription")
    public String namespaceDescription;

    /**
     * <p>The long-format namespace ID. If you specify this parameter, NameSpaceShortId is ignored. This parameter is retained for compatibility. Use the short-format namespace ID instead. The format is <code>&lt;RegionId&gt;:&lt;NamespaceId&gt;</code>. The <code>NamespaceId</code> can contain only lowercase letters and digits and cannot exceed 32 characters in length. Example: <code>cn-beijing:test</code>. For information about the regions that SAE supports, see <a href="https://help.aliyun.com/document_detail/126213.html">DescribeRegions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The name of the namespace. The name cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static CreateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceRequest self = new CreateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceRequest setEnableMicroRegistration(Boolean enableMicroRegistration) {
        this.enableMicroRegistration = enableMicroRegistration;
        return this;
    }
    public Boolean getEnableMicroRegistration() {
        return this.enableMicroRegistration;
    }

    public CreateNamespaceRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public CreateNamespaceRequest setNamespaceDescription(String namespaceDescription) {
        this.namespaceDescription = namespaceDescription;
        return this;
    }
    public String getNamespaceDescription() {
        return this.namespaceDescription;
    }

    public CreateNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
