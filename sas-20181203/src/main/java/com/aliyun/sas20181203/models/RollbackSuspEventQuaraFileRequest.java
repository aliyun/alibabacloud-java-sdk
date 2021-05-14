// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    @NameInMap("From")
    public String from;

    public static RollbackSuspEventQuaraFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileRequest self = new RollbackSuspEventQuaraFileRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public RollbackSuspEventQuaraFileRequest setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    public RollbackSuspEventQuaraFileRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
