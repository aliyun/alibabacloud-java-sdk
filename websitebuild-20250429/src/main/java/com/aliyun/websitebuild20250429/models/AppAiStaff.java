// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppAiStaff extends TeaModel {
    /**
     * <p>The employee ID.</p>
     * 
     * <strong>example:</strong>
     * <p>370196</p>
     */
    @NameInMap("StaffId")
    public String staffId;

    /**
     * <p>The employee name.</p>
     */
    @NameInMap("StaffName")
    public String staffName;

    /**
     * <p>The employee type.</p>
     */
    @NameInMap("StaffType")
    public String staffType;

    /**
     * <p>Valid values: unknown, init, testing, and online.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
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
