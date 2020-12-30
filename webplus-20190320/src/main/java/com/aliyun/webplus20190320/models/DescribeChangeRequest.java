// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeChangeRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("ChangeId")
    public String changeId;

    public static DescribeChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeRequest self = new DescribeChangeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChangeRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeChangeRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

}
