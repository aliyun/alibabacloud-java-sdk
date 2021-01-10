// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreClearRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Crawler")
    public String crawler;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ExecDWSStoreClearRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreClearRequest self = new ExecDWSStoreClearRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreClearRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSStoreClearRequest setCrawler(String crawler) {
        this.crawler = crawler;
        return this;
    }
    public String getCrawler() {
        return this.crawler;
    }

    public ExecDWSStoreClearRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
