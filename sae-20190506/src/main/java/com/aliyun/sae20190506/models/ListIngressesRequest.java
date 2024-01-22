// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesRequest extends TeaModel {
    /**
     * <p>The list of routing rules.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListIngressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesRequest self = new ListIngressesRequest();
        return TeaModel.build(map, self);
    }

    public ListIngressesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListIngressesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
