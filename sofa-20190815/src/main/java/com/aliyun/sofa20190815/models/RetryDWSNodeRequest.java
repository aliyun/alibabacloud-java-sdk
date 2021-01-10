// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryDWSNodeRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("Title")
    public String title;

    public static RetryDWSNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDWSNodeRequest self = new RetryDWSNodeRequest();
        return TeaModel.build(map, self);
    }

    public RetryDWSNodeRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RetryDWSNodeRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public RetryDWSNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryDWSNodeRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public RetryDWSNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public RetryDWSNodeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
