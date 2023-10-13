// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupTag")
    public String groupTag;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityIPType")
    public String securityIPType;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("WhitelistNetType")
    public String whitelistNetType;

    public static ModifySecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPListResponseBody self = new ModifySecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySecurityIPListResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifySecurityIPListResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifySecurityIPListResponseBody setGroupTag(String groupTag) {
        this.groupTag = groupTag;
        return this;
    }
    public String getGroupTag() {
        return this.groupTag;
    }

    public ModifySecurityIPListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityIPListResponseBody setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public ModifySecurityIPListResponseBody setSecurityIPType(String securityIPType) {
        this.securityIPType = securityIPType;
        return this;
    }
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    public ModifySecurityIPListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifySecurityIPListResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ModifySecurityIPListResponseBody setWhitelistNetType(String whitelistNetType) {
        this.whitelistNetType = whitelistNetType;
        return this;
    }
    public String getWhitelistNetType() {
        return this.whitelistNetType;
    }

}
