// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulGlobalConfigRequest extends TeaModel {
    /**
     * <p>The key of the configuration item. Valid values:</p>
     * <br>
     * <p>*   **vul_scan_ip_list**: The IP addresses that are detected.</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    public static ListVulGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulGlobalConfigRequest self = new ListVulGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListVulGlobalConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
