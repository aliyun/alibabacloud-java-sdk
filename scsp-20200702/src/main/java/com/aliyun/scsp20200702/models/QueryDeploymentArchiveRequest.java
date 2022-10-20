// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryDeploymentArchiveRequest extends TeaModel {
    @NameInMap("DeploymentCode")
    public String deploymentCode;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Index")
    public Integer index;

    @NameInMap("Size")
    public Integer size;

    public static QueryDeploymentArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentArchiveRequest self = new QueryDeploymentArchiveRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentArchiveRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public QueryDeploymentArchiveRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public QueryDeploymentArchiveRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public QueryDeploymentArchiveRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
