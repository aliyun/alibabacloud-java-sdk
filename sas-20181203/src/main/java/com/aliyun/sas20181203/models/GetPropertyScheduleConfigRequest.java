// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPropertyScheduleConfigRequest extends TeaModel {
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

    /**
     * <p>The UUID of the server.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
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
