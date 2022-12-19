// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousUUIDConfigRequest extends TeaModel {
    // The type of proactive defense. Valid values:
    // 
    // *   **auto_breaking**: virus defense
    // *   **ransomware_breaking**: ransomware capture
    // *   **webshell\_cloud_breaking**: webshell defense
    // *   **alinet**: malicious behavior defense
    // *   **alisecguard**: client protection
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
