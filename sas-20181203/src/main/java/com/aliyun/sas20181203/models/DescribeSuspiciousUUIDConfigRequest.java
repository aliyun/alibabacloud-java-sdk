// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousUUIDConfigRequest extends TeaModel {
    /**
     * <p>The defense type of the proactive defense to query. Valid values:</p>
     * <ul>
     * <li><strong>auto_breaking</strong>: Anti-virus.</li>
     * <li><strong>ransomware_breaking</strong>: Anti-ransomware (bait capture).</li>
     * <li><strong>webshell_cloud_breaking</strong>: Web shell connection defense.</li>
     * <li><strong>alinet</strong>: Malicious network behavior defense.</li>
     * <li><strong>alisecguard</strong>: Client self-protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alinet</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSuspiciousUUIDConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousUUIDConfigRequest self = new DescribeSuspiciousUUIDConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousUUIDConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
