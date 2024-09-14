// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RegisterCustomConnectorRequest extends TeaModel {
    /**
     * <p>The URL in which the JAR package of the custom connector is stored. The platform must be able to access this address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://flink/connector/mysql123</p>
     */
    @NameInMap("jarUrl")
    public String jarUrl;

    public static RegisterCustomConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomConnectorRequest self = new RegisterCustomConnectorRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCustomConnectorRequest setJarUrl(String jarUrl) {
        this.jarUrl = jarUrl;
        return this;
    }
    public String getJarUrl() {
        return this.jarUrl;
    }

}
