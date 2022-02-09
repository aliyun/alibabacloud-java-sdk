// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaListResoucesRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    public static OmaListResoucesRequest build(java.util.Map<String, ?> map) throws Exception {
        OmaListResoucesRequest self = new OmaListResoucesRequest();
        return TeaModel.build(map, self);
    }

    public OmaListResoucesRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
