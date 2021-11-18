// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ImageNamespace extends TeaModel {
    // 命名空间名称
    @NameInMap("Namespace")
    public String namespace;

    // 命名空间状态
    @NameInMap("NamespaceStatus")
    public String namespaceStatus;

    public static ImageNamespace build(java.util.Map<String, ?> map) throws Exception {
        ImageNamespace self = new ImageNamespace();
        return TeaModel.build(map, self);
    }

    public ImageNamespace setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ImageNamespace setNamespaceStatus(String namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
        return this;
    }
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

}
