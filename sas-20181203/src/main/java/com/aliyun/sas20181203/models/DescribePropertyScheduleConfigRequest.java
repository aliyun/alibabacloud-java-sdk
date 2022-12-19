// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigRequest extends TeaModel {
    // The type of the asset fingerprints to query. Valid values:
    // 
    // *   **scheduler_port_period**: listening port
    // *   **scheduler_process_period**: running process
    // *   **scheduler_account_period**: account
    // *   **scheduler_software_period**: software
    // *   **scheduler_cron_period**: scheduled task
    // *   **scheduler_sca_period**: middleware
    // *   **scheduler_autorun_period**: startup item
    // *   **scheduler_lkm_period**: kernel module
    // *   **scheduler_sca_proxy_period**: website
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
