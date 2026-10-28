// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AliyunAccounts extends TeaModel {
    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>The employee ID of the internal user.</p>
     */
    @NameInMap("EmployeeId")
    public String employeeId;

    /**
     * <p>The creation time of the record.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modification time of the record.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    public static AliyunAccounts build(java.util.Map<String, ?> map) throws Exception {
        AliyunAccounts self = new AliyunAccounts();
        return TeaModel.build(map, self);
    }

    public AliyunAccounts setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public AliyunAccounts setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }

    public AliyunAccounts setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public AliyunAccounts setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

}
