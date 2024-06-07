// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Uri")
    public String uri;

    public static CheckInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceResourcesRequest self = new CheckInstanceResourcesRequest();
        return TeaModel.build(map, self);
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
