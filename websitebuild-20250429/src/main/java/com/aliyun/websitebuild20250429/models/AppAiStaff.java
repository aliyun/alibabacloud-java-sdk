// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppAiStaff extends TeaModel {
    @NameInMap("StaffId")
    public String staffId;

    @NameInMap("StaffName")
    public String staffName;

    @NameInMap("StaffType")
    public String staffType;

    /**
     * <p>可能的值：unknown, init, testing, online</p>
     */
    @NameInMap("Status")
    public String status;

    public static AppAiStaff build(java.util.Map<String, ?> map) throws Exception {
        AppAiStaff self = new AppAiStaff();
        return TeaModel.build(map, self);
    }

    public AppAiStaff setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public AppAiStaff setStaffName(String staffName) {
        this.staffName = staffName;
        return this;
    }
    public String getStaffName() {
        return this.staffName;
    }

    public AppAiStaff setStaffType(String staffType) {
        this.staffType = staffType;
        return this;
    }
    public String getStaffType() {
        return this.staffType;
    }

    public AppAiStaff setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
