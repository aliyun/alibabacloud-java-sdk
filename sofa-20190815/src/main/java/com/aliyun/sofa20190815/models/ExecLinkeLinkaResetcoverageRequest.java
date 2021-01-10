// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinkaResetcoverageRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    public static ExecLinkeLinkaResetcoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinkaResetcoverageRequest self = new ExecLinkeLinkaResetcoverageRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinkaResetcoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
