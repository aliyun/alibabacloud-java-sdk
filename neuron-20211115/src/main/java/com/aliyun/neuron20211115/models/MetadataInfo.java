// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MetadataInfo extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("env")
    public String env;

    @NameInMap("id")
    public Long id;

    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("namespaceId")
    public Long namespaceId;

    @NameInMap("namespaceName")
    public String namespaceName;

    @NameInMap("orgId")
    public Integer orgId;

    public static MetadataInfo build(java.util.Map<String, ?> map) throws Exception {
        MetadataInfo self = new MetadataInfo();
        return TeaModel.build(map, self);
    }

    public MetadataInfo setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public MetadataInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MetadataInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MetadataInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public MetadataInfo setNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    public MetadataInfo setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public MetadataInfo setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

}
