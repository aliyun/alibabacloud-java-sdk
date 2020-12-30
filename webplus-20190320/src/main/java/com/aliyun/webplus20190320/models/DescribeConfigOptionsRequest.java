// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigOptionsRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("ProfileName")
    public String profileName;

    public static DescribeConfigOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOptionsRequest self = new DescribeConfigOptionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOptionsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DescribeConfigOptionsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeConfigOptionsRequest setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }
    public String getProfileName() {
        return this.profileName;
    }

}
