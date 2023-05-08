// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBaselineAuthorizationRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>资产所有者ID。</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the asset owner.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUserBaselineAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBaselineAuthorizationRequest self = new DescribeUserBaselineAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBaselineAuthorizationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserBaselineAuthorizationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUserBaselineAuthorizationRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
