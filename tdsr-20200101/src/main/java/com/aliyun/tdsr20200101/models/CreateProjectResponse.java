// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    public static CreateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponse self = new CreateProjectResponse();
        return TeaModel.build(map, self);
    }

}
