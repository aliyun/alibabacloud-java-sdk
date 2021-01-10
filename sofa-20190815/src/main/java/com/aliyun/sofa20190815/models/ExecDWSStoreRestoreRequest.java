// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreRestoreRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Crawler")
    public String crawler;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ExecDWSStoreRestoreRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreRestoreRequest self = new ExecDWSStoreRestoreRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreRestoreRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSStoreRestoreRequest setCrawler(String crawler) {
        this.crawler = crawler;
        return this;
    }
    public String getCrawler() {
        return this.crawler;
    }

    public ExecDWSStoreRestoreRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
