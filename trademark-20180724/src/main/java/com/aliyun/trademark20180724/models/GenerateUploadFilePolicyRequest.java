// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FileType")
    public String fileType;

    public static GenerateUploadFilePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyRequest self = new GenerateUploadFilePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GenerateUploadFilePolicyRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
