// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    public static GenerateUploadFilePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyRequest self = new GenerateUploadFilePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
