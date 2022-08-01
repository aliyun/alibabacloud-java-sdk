// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshDBClusterStorageUsageResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsedStorage")
    public String usedStorage;

    @NameInMap("UsedStorageModified")
    public String usedStorageModified;

    public static RefreshDBClusterStorageUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDBClusterStorageUsageResponseBody self = new RefreshDBClusterStorageUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDBClusterStorageUsageResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RefreshDBClusterStorageUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDBClusterStorageUsageResponseBody setUsedStorage(String usedStorage) {
        this.usedStorage = usedStorage;
        return this;
    }
    public String getUsedStorage() {
        return this.usedStorage;
    }

    public RefreshDBClusterStorageUsageResponseBody setUsedStorageModified(String usedStorageModified) {
        this.usedStorageModified = usedStorageModified;
        return this;
    }
    public String getUsedStorageModified() {
        return this.usedStorageModified;
    }

}
