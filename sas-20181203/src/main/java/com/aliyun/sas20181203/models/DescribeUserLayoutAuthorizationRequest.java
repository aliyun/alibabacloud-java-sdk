// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserLayoutAuthorizationRequest extends TeaModel {
    // The language of the content within the request and response. Valid values:
    // - **zh**: Chinese
    // - **en**: English
    @NameInMap("Lang")
    public String lang;

    // The ID of the asset owner.
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUserLayoutAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLayoutAuthorizationRequest self = new DescribeUserLayoutAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserLayoutAuthorizationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserLayoutAuthorizationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUserLayoutAuthorizationRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
