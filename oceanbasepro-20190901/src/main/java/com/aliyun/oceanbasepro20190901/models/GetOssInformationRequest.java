// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetOssInformationRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static GetOssInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssInformationRequest self = new GetOssInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetOssInformationRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
