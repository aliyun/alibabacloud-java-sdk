// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLogMetaRequest extends TeaModel {
    /**
     * <p>The name of the dedicated Logstore in which logs are stored.</p>
     * <br>
     * <p>>  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the name of the Logstore.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static GetLogMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogMetaRequest self = new GetLogMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetLogMetaRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public GetLogMetaRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
