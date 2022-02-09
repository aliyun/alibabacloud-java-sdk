// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckUserInServiceWhiteListRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    public static CheckUserInServiceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInServiceWhiteListRequest self = new CheckUserInServiceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserInServiceWhiteListRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
