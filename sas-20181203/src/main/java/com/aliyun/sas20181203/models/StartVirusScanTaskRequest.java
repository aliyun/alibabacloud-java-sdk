// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    @NameInMap("TargetInfo")
    public String targetInfo;

    public static StartVirusScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskRequest self = new StartVirusScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
