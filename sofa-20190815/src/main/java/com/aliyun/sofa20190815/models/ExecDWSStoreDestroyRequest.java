// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreDestroyRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Crawler")
    public String crawler;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ExecDWSStoreDestroyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreDestroyRequest self = new ExecDWSStoreDestroyRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreDestroyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSStoreDestroyRequest setCrawler(String crawler) {
        this.crawler = crawler;
        return this;
    }
    public String getCrawler() {
        return this.crawler;
    }

    public ExecDWSStoreDestroyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
