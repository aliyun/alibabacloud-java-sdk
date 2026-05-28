// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ServiceStatus extends TeaModel {
    /**
     * <p>Indicates whether the service is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Current status.</p>
     * <ul>
     * <li>Opened: The service is activated.</li>
     * <li>NotExist: The service does not exist.</li>
     * <li>Opening: The service is activating.</li>
     * <li>Closed: The service has overdue payments and is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NotExist</p>
     */
    @NameInMap("status")
    public String status;

    public static ServiceStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceStatus self = new ServiceStatus();
        return TeaModel.build(map, self);
    }

    public ServiceStatus setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ServiceStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
