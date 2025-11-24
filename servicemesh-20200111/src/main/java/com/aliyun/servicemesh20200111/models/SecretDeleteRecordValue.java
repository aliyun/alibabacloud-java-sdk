// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SecretDeleteRecordValue extends TeaModel {
    /**
     * <p>The result of deleting the secret. Valid values:</p>
     * <ul>
     * <li><code>success</code>: The secret was deleted.</li>
     * <li><code>fail</code>: The secret failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
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
