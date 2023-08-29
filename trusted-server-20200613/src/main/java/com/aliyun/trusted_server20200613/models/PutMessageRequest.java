// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class PutMessageRequest extends TeaModel {
    @NameInMap("FileData")
    public String fileData;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static PutMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMessageRequest self = new PutMessageRequest();
        return TeaModel.build(map, self);
    }

    public PutMessageRequest setFileData(String fileData) {
        this.fileData = fileData;
        return this;
    }
    public String getFileData() {
        return this.fileData;
    }

    public PutMessageRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
