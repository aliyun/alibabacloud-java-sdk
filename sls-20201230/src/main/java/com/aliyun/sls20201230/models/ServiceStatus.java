// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ServiceStatus extends TeaModel {
    /**
     * <p>是否开通</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>当前状态。</p>
     * <ul>
     * <li>Opened：已开通。</li>
     * <li>NotExist：不存在。</li>
     * <li>Opening：正在开通。</li>
     * <li>Closed：已欠费禁用。</li>
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
