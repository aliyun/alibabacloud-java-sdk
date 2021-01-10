// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PodId")
    public String podId;

    public static QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest self = new QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodlogsRequest setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

}
