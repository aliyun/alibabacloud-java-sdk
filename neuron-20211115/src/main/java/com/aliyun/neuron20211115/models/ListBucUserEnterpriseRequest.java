// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListBucUserEnterpriseRequest extends TeaModel {
    @NameInMap("empId")
    public String empId;

    public static ListBucUserEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBucUserEnterpriseRequest self = new ListBucUserEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public ListBucUserEnterpriseRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

}
