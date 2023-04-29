// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The value of the field that can be used in the whitelist rule.</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The field that can be used in the whitelist rule.</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    /**
     * <p>The operation that is supported in the whitelist rule. Valid values:</p>
     * <br>
     * <p>*   **contains**: contains</p>
     * <p>*   **notContains**: does not contain</p>
     * <p>*   **regex**: regular expression</p>
     * <p>*   **strEqual**: equals</p>
     * <p>*   **strNotEqual**: does not equal</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecurityEventOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsRequest self = new DescribeSecurityEventOperationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityEventOperationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityEventOperationsRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public DescribeSecurityEventOperationsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
