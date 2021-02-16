// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterTDEResponseBody extends TeaModel {
    @NameInMap("TDEStatus")
    public String TDEStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    public static DescribeDBClusterTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterTDEResponseBody self = new DescribeDBClusterTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterTDEResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public DescribeDBClusterTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterTDEResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterTDEResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

}
