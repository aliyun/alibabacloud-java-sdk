// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAlarmMachineCountRequest extends TeaModel {
    /**
     * <p>The source identifier of the request. Set this parameter to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public GetAlarmMachineCountRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
