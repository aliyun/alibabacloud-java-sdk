// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest self = new CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeantcodeAntcodeNewlabelforgivenrepositorywithgivennameandcolorRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
