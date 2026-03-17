// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAclAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0n*****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The name of the ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>dpi_test</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The number of SAG devices that are associated with the ACL who has DPI configuration errors.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/197566.html">ListDpiConfigError</a> operation to query exception details and SAG device information.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorConfigSmartAGCount")
    public Integer errorConfigSmartAGCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5D2013F0-85AB-4332-9094-8023A598C2C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAclAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAclAttributeResponseBody self = new GetAclAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAclAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public GetAclAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public GetAclAttributeResponseBody setErrorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
        this.errorConfigSmartAGCount = errorConfigSmartAGCount;
        return this;
    }
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    public GetAclAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
