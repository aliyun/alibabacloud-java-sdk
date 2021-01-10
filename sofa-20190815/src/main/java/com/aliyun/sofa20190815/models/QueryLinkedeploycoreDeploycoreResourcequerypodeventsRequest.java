// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PodId")
    public String podId;

    @NameInMap("PodName")
    public String podName;

    public static QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest self = new QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

}
