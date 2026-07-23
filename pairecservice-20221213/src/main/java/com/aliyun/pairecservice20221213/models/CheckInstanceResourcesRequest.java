// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>Hologres</p>
     * </li>
     * <li><p>EAS</p>
     * </li>
     * <li><p>BE</p>
     * </li>
     * <li><p>Rec</p>
     * </li>
     * <li><p>Platform</p>
     * </li>
     * <li><p>SLS</p>
     * </li>
     * <li><p>DataHub</p>
     * </li>
     * <li><p>Kafka</p>
     * </li>
     * <li><p>Flinkvvp</p>
     * </li>
     * <li><p>ACR</p>
     * </li>
     * <li><p>OSS</p>
     * </li>
     * <li><p>DataWorks</p>
     * </li>
     * <li><p>PAI</p>
     * </li>
     * <li><p>MaxCompute</p>
     * </li>
     * <li><p>GraphCompute</p>
     * </li>
     * <li><p>Redis</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The resource URI.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-test-123</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CheckInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceResourcesRequest self = new CheckInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CheckInstanceResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckInstanceResourcesRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
