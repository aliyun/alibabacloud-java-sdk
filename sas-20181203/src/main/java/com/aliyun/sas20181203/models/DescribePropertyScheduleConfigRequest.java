// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprints. Valid values:</p>
     * <ul>
     * <li><strong>scheduler_port_period</strong>: listening port</li>
     * <li><strong>scheduler_process_period</strong>: running process</li>
     * <li><strong>scheduler_account_period</strong>: account</li>
     * <li><strong>scheduler_software_period</strong>: software</li>
     * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
     * <li><strong>scheduler_sca_period</strong>: middleware</li>
     * <li><strong>scheduler_autorun_period</strong>: startup item</li>
     * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
     * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduler_autorun_period</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePropertyScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScheduleConfigRequest self = new DescribePropertyScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScheduleConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
