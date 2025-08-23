// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetFileContentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss://default/aimiaobi-service-prod/aimiaobi/temp/1154600634854327_10045847/300469535473178749_300469535473178749_ee11508152b74137ac5747a6f632256e.docx</p>
     */
    @NameInMap("fileKey")
    public String fileKey;

    public static GetFileContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentRequest self = new GetFileContentRequest();
        return TeaModel.build(map, self);
    }

    public GetFileContentRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
