// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentUploadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPEnvironmentUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentUploadUrlRequest self = new QueryODPEnvironmentUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryODPEnvironmentUploadUrlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public QueryODPEnvironmentUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
