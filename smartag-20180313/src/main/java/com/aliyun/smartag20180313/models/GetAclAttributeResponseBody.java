// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAclAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("ErrorConfigSmartAGCount")
    public Integer errorConfigSmartAGCount;

    @NameInMap("AclName")
    public String aclName;

    public static GetAclAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAclAttributeResponseBody self = new GetAclAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAclAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAclAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public GetAclAttributeResponseBody setErrorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
        this.errorConfigSmartAGCount = errorConfigSmartAGCount;
        return this;
    }
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    public GetAclAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

}
