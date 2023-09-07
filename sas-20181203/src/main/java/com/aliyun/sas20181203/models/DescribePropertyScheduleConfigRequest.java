// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprints. Valid values:</p>
     * <br>
     * <p>*   **scheduler_port_period**: listening port</p>
     * <p>*   **scheduler_process_period**: running process</p>
     * <p>*   **scheduler_account_period**: account</p>
     * <p>*   **scheduler_software_period**: software</p>
     * <p>*   **scheduler_cron_period**: scheduled task</p>
     * <p>*   **scheduler_sca_period**: middleware</p>
     * <p>*   **scheduler_autorun_period**: startup item</p>
     * <p>*   **scheduler_lkm_period**: kernel module</p>
     * <p>*   **scheduler_sca_proxy_period**: website</p>
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
