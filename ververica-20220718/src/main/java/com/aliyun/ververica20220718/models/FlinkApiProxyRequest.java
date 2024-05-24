// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FlinkApiProxyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("flinkApiPath")
    public String flinkApiPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static FlinkApiProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        FlinkApiProxyRequest self = new FlinkApiProxyRequest();
        return TeaModel.build(map, self);
    }

    public FlinkApiProxyRequest setFlinkApiPath(String flinkApiPath) {
        this.flinkApiPath = flinkApiPath;
        return this;
    }
    public String getFlinkApiPath() {
        return this.flinkApiPath;
    }

    public FlinkApiProxyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FlinkApiProxyRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public FlinkApiProxyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
