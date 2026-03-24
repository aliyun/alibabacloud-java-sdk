// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID using the Cloud Security Center service.   </p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/28681.html">GetUser</a> API to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigRequest self = new DescribeVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
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
