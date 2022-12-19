// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileRequest extends TeaModel {
    // The ID of the request source. Set the value to sas.
    @NameInMap("From")
    public String from;

    // The ID of the quarantined file.   
    // > If you do not configure this parameter, you cannot call the RollbackSuspEventQuaraFile operation to restore a quarantined file. You can call the [DescribeSuspEventQuaraFiles](~~DescribeSuspEventQuaraFiles~~) operation to query the IDs of quarantined files.
    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static RollbackSuspEventQuaraFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileRequest self = new RollbackSuspEventQuaraFileRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public RollbackSuspEventQuaraFileRequest setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    public RollbackSuspEventQuaraFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
