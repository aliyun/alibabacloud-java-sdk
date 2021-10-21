// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadNotaryDataRequest extends TeaModel {
    @NameInMap("NotaryType")
    public Integer notaryType;

    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    @NameInMap("UploadContext")
    public String uploadContext;

    public static UploadNotaryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryDataRequest self = new UploadNotaryDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadNotaryDataRequest setNotaryType(Integer notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public Integer getNotaryType() {
        return this.notaryType;
    }

    public UploadNotaryDataRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public UploadNotaryDataRequest setUploadContext(String uploadContext) {
        this.uploadContext = uploadContext;
        return this;
    }
    public String getUploadContext() {
        return this.uploadContext;
    }

}
