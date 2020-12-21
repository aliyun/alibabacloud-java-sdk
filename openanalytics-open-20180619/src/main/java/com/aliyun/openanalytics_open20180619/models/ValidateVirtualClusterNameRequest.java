// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ValidateVirtualClusterNameRequest extends TeaModel {
    @NameInMap("VcName")
    public String vcName;

    public static ValidateVirtualClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateVirtualClusterNameRequest self = new ValidateVirtualClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public ValidateVirtualClusterNameRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
