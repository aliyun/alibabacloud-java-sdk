// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreRestartRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Crawler")
    public String crawler;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ExecDWSStoreRestartRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreRestartRequest self = new ExecDWSStoreRestartRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreRestartRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSStoreRestartRequest setCrawler(String crawler) {
        this.crawler = crawler;
        return this;
    }
    public String getCrawler() {
        return this.crawler;
    }

    public ExecDWSStoreRestartRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
