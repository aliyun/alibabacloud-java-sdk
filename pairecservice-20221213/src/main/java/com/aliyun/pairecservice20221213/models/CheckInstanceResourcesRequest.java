// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
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
