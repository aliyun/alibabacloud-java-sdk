// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktUploadinfoRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("Type")
    public String type;

    public static GetLinkeLinktUploadinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktUploadinfoRequest self = new GetLinkeLinktUploadinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktUploadinfoRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetLinkeLinktUploadinfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
