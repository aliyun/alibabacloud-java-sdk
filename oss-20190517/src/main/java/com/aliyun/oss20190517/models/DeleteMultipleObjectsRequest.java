// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteMultipleObjectsRequest extends TeaModel {
    @NameInMap("Delete")
    public Delete delete;

    @NameInMap("encoding-type")
    public String encodingType;

    public static DeleteMultipleObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipleObjectsRequest self = new DeleteMultipleObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultipleObjectsRequest setDelete(Delete delete) {
        this.delete = delete;
        return this;
    }
    public Delete getDelete() {
        return this.delete;
    }

    public DeleteMultipleObjectsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

}
