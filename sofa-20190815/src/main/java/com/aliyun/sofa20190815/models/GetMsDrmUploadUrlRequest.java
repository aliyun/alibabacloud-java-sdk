// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsDrmUploadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Type")
    public String type;

    public static GetMsDrmUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsDrmUploadUrlRequest self = new GetMsDrmUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMsDrmUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetMsDrmUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMsDrmUploadUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
