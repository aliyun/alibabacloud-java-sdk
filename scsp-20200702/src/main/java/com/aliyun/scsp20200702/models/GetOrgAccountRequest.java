// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOrgAccountRequest extends TeaModel {
    // 实例编号
    @NameInMap("InstanceId")
    public String instanceId;

    // 部门COde
    @NameInMap("DeptCode")
    public String deptCode;

    // 部门名称
    @NameInMap("DeptName")
    public String deptName;

    public static GetOrgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrgAccountRequest self = new GetOrgAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetOrgAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOrgAccountRequest setDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }
    public String getDeptCode() {
        return this.deptCode;
    }

    public GetOrgAccountRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

}
