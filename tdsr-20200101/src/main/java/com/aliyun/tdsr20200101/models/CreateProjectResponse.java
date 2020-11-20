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

    public CreateProjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateProjectResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateProjectResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
