// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanRequest extends TeaModel {
    // The types of vulnerabilities that can be detected. Valid values:
    // 
    // *   **cve**: Linux software vulnerabilities
    // *   **sys**: Windows system vulnerabilities
    // *   **cms**: Web-CMS vulnerabilities
    // *   **app**: application vulnerabilities
    // *   **emg**: urgent vulnerabilities
    // *   **image**: container image vulnerabilities
    // 
    // >  If you leave this parameter empty, all types of vulnerabilities can be detected.
    @NameInMap("Types")
    public String types;

    // The UUIDs of servers.
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyStartVulScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStartVulScanRequest self = new ModifyStartVulScanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStartVulScanRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public ModifyStartVulScanRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
