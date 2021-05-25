// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSaTokenRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceAccountName")
    public String serviceAccountName;

    @NameInMap("NeedRefresh")
    public Boolean needRefresh;

    public static GetSaTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSaTokenRequest self = new GetSaTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetSaTokenRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetSaTokenRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetSaTokenRequest setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    public GetSaTokenRequest setNeedRefresh(Boolean needRefresh) {
        this.needRefresh = needRefresh;
        return this;
    }
    public Boolean getNeedRefresh() {
        return this.needRefresh;
    }

}
