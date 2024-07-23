// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FlinkApiProxyRequest extends TeaModel {
    /**
     * <p>The path of the Flink UI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/jobs/4df35f8e54554b23bf7dcd38a151****</p>
     */
    @NameInMap("flinkApiPath")
    public String flinkApiPath;

    /**
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a27a3aa-c5b9-4dc1-8c86-be57d2d6****</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>jobs</li>
     * <li>sessionclusters</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jobs</p>
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
