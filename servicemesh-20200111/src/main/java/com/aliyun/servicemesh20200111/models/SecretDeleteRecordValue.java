// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SecretDeleteRecordValue extends TeaModel {
    @NameInMap("State")
    public String state;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Message")
    public String message;

    public static SecretDeleteRecordValue build(java.util.Map<String, ?> map) throws Exception {
        SecretDeleteRecordValue self = new SecretDeleteRecordValue();
        return TeaModel.build(map, self);
    }

    public SecretDeleteRecordValue setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SecretDeleteRecordValue setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SecretDeleteRecordValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
