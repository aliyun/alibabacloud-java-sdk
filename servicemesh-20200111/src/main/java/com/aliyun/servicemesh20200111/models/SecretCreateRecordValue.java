// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SecretCreateRecordValue extends TeaModel {
    /**
     * <p>The result of creating the secret. Valid values:</p>
     * <ul>
     * <li><code>success</code>: The secret was created.</li>
     * <li><code>fail</code>: The secret failed to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the cluster on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8xe10d****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The error message returned when exceptions occur. Otherwise, an empty value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>timeout</p>
     */
    @NameInMap("Message")
    public String message;

    public static SecretCreateRecordValue build(java.util.Map<String, ?> map) throws Exception {
        SecretCreateRecordValue self = new SecretCreateRecordValue();
        return TeaModel.build(map, self);
    }

    public SecretCreateRecordValue setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SecretCreateRecordValue setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SecretCreateRecordValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
