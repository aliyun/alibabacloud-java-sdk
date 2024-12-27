// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPodsOfInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c96e34d74eb6748f3b2a46552d5d653f6</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListPodsOfInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPodsOfInstanceRequest self = new ListPodsOfInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListPodsOfInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPodsOfInstanceRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListPodsOfInstanceRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public ListPodsOfInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
