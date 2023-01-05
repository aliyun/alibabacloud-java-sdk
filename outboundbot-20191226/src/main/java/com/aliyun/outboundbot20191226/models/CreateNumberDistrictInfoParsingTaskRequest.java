// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberDistrictInfoParsingTaskRequest extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("FileSize")
    public Long fileSize;

    public static CreateNumberDistrictInfoParsingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberDistrictInfoParsingTaskRequest self = new CreateNumberDistrictInfoParsingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateNumberDistrictInfoParsingTaskRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateNumberDistrictInfoParsingTaskRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

}
