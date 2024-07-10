// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceRequest extends TeaModel {
    @NameInMap("EnableMicroRegistration")
    public Boolean enableMicroRegistration;

    /**
     * <p>The short ID of the namespace. You do not need to specify a region ID. We recommend that you configure this parameter. The value of this parameter can be up to 20 characters in length and can contain only lowercase letters and digits.</p>
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
     * <p>The long ID of the namespace. If you configure this parameter, the long ID take effects and the value of the NameSpaceShortId parameter is ignored. To ensure compatibility, we recommend that you specify a short namespace ID. A long namespace ID follows the <code>&lt;RegionId&gt;:&lt;NamespaceId&gt;</code> format. The <code>NamespaceId</code> variable can contain only lowercase letters and digits. Example: <code>cn-beijing:test</code>. The value of the NamespaceId variable cannot exceed 32 characters in length. For more information about <strong>RegionId</strong>, you can call the <a href="https://help.aliyun.com/document_detail/126213.html">DescribeRegions</a> operation to obtain the IDs of regions supported by SAE.</p>
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
