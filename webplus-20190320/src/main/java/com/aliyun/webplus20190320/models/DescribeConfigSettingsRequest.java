// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigSettingsRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("PathName")
    public String pathName;

    @NameInMap("OptionName")
    public String optionName;

    public static DescribeConfigSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigSettingsRequest self = new DescribeConfigSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigSettingsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeConfigSettingsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeConfigSettingsRequest setPathName(String pathName) {
        this.pathName = pathName;
        return this;
    }
    public String getPathName() {
        return this.pathName;
    }

    public DescribeConfigSettingsRequest setOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }
    public String getOptionName() {
        return this.optionName;
    }

}
