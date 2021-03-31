// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AliyunAccounts extends TeaModel {
    // Aliyun账号的UID
    @NameInMap("AliyunUid")
    public String aliyunUid;

    // 弹内用户的工号
    @NameInMap("EmployeeId")
    public String employeeId;

    // 这条记录的创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 这条记录的上次修改时间
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
