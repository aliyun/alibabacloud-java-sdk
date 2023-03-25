// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAlarmMachineCountRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

    public static GetAlarmMachineCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmMachineCountRequest self = new GetAlarmMachineCountRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmMachineCountRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
