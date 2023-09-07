// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterTDEResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Indicates whether automatic encryption is enabled for new tables. Valid values:</p>
     * <br>
     * <p>*   **ON**</p>
     * <p>*   **OFF**</p>
     */
    @NameInMap("EncryptNewTables")
    public String encryptNewTables;

    /**
     * <p>The ID of the custom key.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region where the TDE key resides.</p>
     */
    @NameInMap("TDERegion")
    public String TDERegion;

    /**
     * <p>Indicates whether TDE encryption is enabled. Valid values:</p>
     * <br>
     * <p>*   **Enabled**</p>
     * <p>*   **Disabled**</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static DescribeDBClusterTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterTDEResponseBody self = new DescribeDBClusterTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterTDEResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterTDEResponseBody setEncryptNewTables(String encryptNewTables) {
        this.encryptNewTables = encryptNewTables;
        return this;
    }
    public String getEncryptNewTables() {
        return this.encryptNewTables;
    }

    public DescribeDBClusterTDEResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBClusterTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterTDEResponseBody setTDERegion(String TDERegion) {
        this.TDERegion = TDERegion;
        return this;
    }
    public String getTDERegion() {
        return this.TDERegion;
    }

    public DescribeDBClusterTDEResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
