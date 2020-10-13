// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class EditPcdnControlRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static EditPcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EditPcdnControlRuleResponse self = new EditPcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public EditPcdnControlRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditPcdnControlRuleResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EditPcdnControlRuleResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
