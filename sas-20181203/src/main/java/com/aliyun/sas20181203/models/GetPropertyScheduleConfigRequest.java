// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>The type of Asset Fingerprints for which the automatic collection frequency is configured. Valid values:</p>
     * <ul>
     * <li><strong>scheduler_port_period</strong>: listening port</li>
     * <li><strong>scheduler_process_period</strong>: running process</li>
     * <li><strong>scheduler_account_period</strong>: account asset</li>
     * <li><strong>scheduler_software_period</strong>: software asset</li>
     * <li><strong>scheduler_cron_period</strong>: scheduled node</li>
     * <li><strong>scheduler_sca_period</strong>: middleware</li>
     * <li><strong>scheduler_autorun_period</strong>: startup item</li>
     * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
     * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>scheduler_sca_period</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetPropertyScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPropertyScheduleConfigRequest self = new GetPropertyScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPropertyScheduleConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPropertyScheduleConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
