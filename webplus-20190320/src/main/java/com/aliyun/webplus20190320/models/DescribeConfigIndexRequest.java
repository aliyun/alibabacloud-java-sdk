// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigIndexRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("ProfileName")
    public String profileName;

    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeConfigIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigIndexRequest self = new DescribeConfigIndexRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigIndexRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DescribeConfigIndexRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeConfigIndexRequest setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }
    public String getProfileName() {
        return this.profileName;
    }

    public DescribeConfigIndexRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
