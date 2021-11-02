// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigRequest extends TeaModel {
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigRequest self = new DescribeVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeVersionConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
