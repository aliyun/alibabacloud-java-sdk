// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousUUIDConfigRequest extends TeaModel {
    /**
     * <p>The type of proactive defense. Valid values:</p>
     * <br>
     * <p>*   **auto_breaking**: virus defense</p>
     * <p>*   **ransomware_breaking**: ransomware capture</p>
     * <p>*   **webshell\_cloud_breaking**: webshell defense</p>
     * <p>*   **alinet**: malicious behavior defense</p>
     * <p>*   **alisecguard**: client protection</p>
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
