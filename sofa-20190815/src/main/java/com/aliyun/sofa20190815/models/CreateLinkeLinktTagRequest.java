// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktTagRequest extends TeaModel {
    @NameInMap("CheckDuplicate")
    public String checkDuplicate;

    @NameInMap("Color")
    public String color;

    @NameInMap("Content")
    public String content;

    @NameInMap("ProjectSign")
    public String projectSign;

    public static CreateLinkeLinktTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktTagRequest self = new CreateLinkeLinktTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktTagRequest setCheckDuplicate(String checkDuplicate) {
        this.checkDuplicate = checkDuplicate;
        return this;
    }
    public String getCheckDuplicate() {
        return this.checkDuplicate;
    }

    public CreateLinkeLinktTagRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateLinkeLinktTagRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLinkeLinktTagRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
