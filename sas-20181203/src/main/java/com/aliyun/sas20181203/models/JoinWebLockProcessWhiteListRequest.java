// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class JoinWebLockProcessWhiteListRequest extends TeaModel {
    @NameInMap("ProcessPaths")
    public java.util.List<String> processPaths;

    @NameInMap("Uuids")
    public String uuids;

    public static JoinWebLockProcessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinWebLockProcessWhiteListRequest self = new JoinWebLockProcessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public JoinWebLockProcessWhiteListRequest setProcessPaths(java.util.List<String> processPaths) {
        this.processPaths = processPaths;
        return this;
    }
    public java.util.List<String> getProcessPaths() {
        return this.processPaths;
    }

    public JoinWebLockProcessWhiteListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
