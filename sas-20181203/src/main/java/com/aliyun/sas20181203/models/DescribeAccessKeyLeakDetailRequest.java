// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair leak event.</p>
     * <br>
     * <p>> You can call the [DescribeAccesskeyLeakList](~~DescribeAccesskeyLeakList~~) operation to obtain the event ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to query the ID.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static DescribeAccessKeyLeakDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessKeyLeakDetailRequest self = new DescribeAccessKeyLeakDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessKeyLeakDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeAccessKeyLeakDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
