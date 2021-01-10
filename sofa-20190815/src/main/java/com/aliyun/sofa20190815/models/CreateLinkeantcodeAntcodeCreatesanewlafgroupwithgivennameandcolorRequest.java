// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest self = new CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeantcodeAntcodeCreatesanewlafgroupwithgivennameandcolorRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
