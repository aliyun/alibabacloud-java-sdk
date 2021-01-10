// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAttachmentsuploadinfoRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static GetLinkelinkflowLinkflowAttachmentsuploadinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAttachmentsuploadinfoRequest self = new GetLinkelinkflowLinkflowAttachmentsuploadinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
