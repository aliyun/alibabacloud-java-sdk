// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetUploadPolicyRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Type")
    public String type;

    public static GetUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadPolicyRequest self = new GetUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadPolicyRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetUploadPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUploadPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
