// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRdsCustomInitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasServiceLinkedRole")
    public String hasServiceLinkedRole;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RegisterUidSuccess")
    public Boolean registerUidSuccess;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequireServiceLinkedRole")
    public String requireServiceLinkedRole;

    public static CheckRdsCustomInitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsCustomInitResponseBody self = new CheckRdsCustomInitResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRdsCustomInitResponseBody setHasServiceLinkedRole(String hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public String getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    public CheckRdsCustomInitResponseBody setRegisterUidSuccess(Boolean registerUidSuccess) {
        this.registerUidSuccess = registerUidSuccess;
        return this;
    }
    public Boolean getRegisterUidSuccess() {
        return this.registerUidSuccess;
    }

    public CheckRdsCustomInitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRdsCustomInitResponseBody setRequireServiceLinkedRole(String requireServiceLinkedRole) {
        this.requireServiceLinkedRole = requireServiceLinkedRole;
        return this;
    }
    public String getRequireServiceLinkedRole() {
        return this.requireServiceLinkedRole;
    }

}
