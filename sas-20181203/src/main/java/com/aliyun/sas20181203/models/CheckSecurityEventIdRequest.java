// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdRequest extends TeaModel {
    /**
     * <p>The IDs of the alert events to be verified. You can specify up to 100 alert event IDs. If this parameter is left empty, the verification result <strong>Data</strong> defaults to <strong>false</strong>, indicating that the events do not belong to the specified server.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to retrieve this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1234567&quot;,&quot;98765432&quot;]</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    /**
     * <p>The UUID of the server to be verified.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to retrieve this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>96ad2473-bc60-45ba-ad1c-932e2866****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static CheckSecurityEventIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdRequest self = new CheckSecurityEventIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public CheckSecurityEventIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
