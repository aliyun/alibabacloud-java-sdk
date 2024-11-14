// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListResponseBody extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The name of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The tag of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptag</p>
     */
    @NameInMap("GroupTag")
    public String groupTag;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>195F64C2-8F11-532B-A436-FC08A221D756</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP addresses in the whitelist of the instance. Multiple IP addresses are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX,127.2.XX.XX</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The IP address type.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("SecurityIPType")
    public String securityIPType;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>479095561</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The network type of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>mix</p>
     */
    @NameInMap("WhitelistNetType")
    public String whitelistNetType;

    public static ModifySecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPListResponseBody self = new ModifySecurityIPListResponseBody();
        return TeaModel.build(map, self);
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
