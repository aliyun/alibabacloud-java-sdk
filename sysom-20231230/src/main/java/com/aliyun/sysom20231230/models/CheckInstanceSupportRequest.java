// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;i-2zxxxxxx&quot;]</p>
     */
    @NameInMap("instances")
    public java.util.List<String> instances;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static CheckInstanceSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportRequest self = new CheckInstanceSupportRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public CheckInstanceSupportRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
