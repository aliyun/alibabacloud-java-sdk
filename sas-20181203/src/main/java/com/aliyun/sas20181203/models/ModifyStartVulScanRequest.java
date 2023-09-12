// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanRequest extends TeaModel {
    /**
     * <p>The types of vulnerabilities that can be detected. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerabilities</p>
     * <p>*   **sys**: Windows system vulnerabilities</p>
     * <p>*   **cms**: Web-CMS vulnerabilities</p>
     * <p>*   **app**: application vulnerabilities</p>
     * <p>*   **emg**: urgent vulnerabilities</p>
     * <p>*   **image**: container image vulnerabilities</p>
     * <p>*   **sca**: vulnerabilities that are detected based on software component analysis</p>
     * <br>
     * <p>> If you leave this parameter empty, all types of vulnerabilities can be detected.</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The UUIDs of servers.</p>
     */
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
