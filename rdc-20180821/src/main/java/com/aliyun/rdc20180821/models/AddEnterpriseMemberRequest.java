// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class AddEnterpriseMemberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StaffId")
    public String staffId;

    @NameInMap("Operator")
    public String operator;

    public static AddEnterpriseMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseMemberRequest self = new AddEnterpriseMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseMemberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddEnterpriseMemberRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public AddEnterpriseMemberRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
