// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SecretDeleteRecordValue extends TeaModel {
    /**
     * <p>The result of deleting the secret. Valid values:</p>
     * <br>
     * <p>*   `success`: The secret was deleted.</p>
     * <p>*   `fail`: The secret failed to be deleted.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The error message returned when exceptions occur. Otherwise, an empty value is returned.</p>
     */
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
