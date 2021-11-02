// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdRequest extends TeaModel {
    @NameInMap("QuaraFileIds")
    public java.util.List<String> quaraFileIds;

    @NameInMap("Uuid")
    public String uuid;

    public static CheckQuaraFileIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckQuaraFileIdRequest self = new CheckQuaraFileIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckQuaraFileIdRequest setQuaraFileIds(java.util.List<String> quaraFileIds) {
        this.quaraFileIds = quaraFileIds;
        return this;
    }
    public java.util.List<String> getQuaraFileIds() {
        return this.quaraFileIds;
    }

    public CheckQuaraFileIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
