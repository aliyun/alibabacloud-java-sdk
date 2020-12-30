// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class EditPcdnControlRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Code")
    public Integer code;

    public static EditPcdnControlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditPcdnControlRuleResponseBody self = new EditPcdnControlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EditPcdnControlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditPcdnControlRuleResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public EditPcdnControlRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
