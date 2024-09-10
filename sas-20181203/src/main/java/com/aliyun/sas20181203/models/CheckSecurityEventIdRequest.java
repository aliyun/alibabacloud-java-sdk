// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdRequest extends TeaModel {
    /**
     * <p>The IDs of alert events. You can specify up to 100 IDs. If you do not specify this parameter, the value of the response parameter <strong>Data</strong> is <strong>false</strong>. The value false indicates that no alert events are generated on the server.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the IDs of alert events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1234567&quot;,&quot;98765432&quot;]</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
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
