// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailRequest extends TeaModel {
    /**
     * <p>The ID of the AccessKey pair leak event to query.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>389357</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the member account in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
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
