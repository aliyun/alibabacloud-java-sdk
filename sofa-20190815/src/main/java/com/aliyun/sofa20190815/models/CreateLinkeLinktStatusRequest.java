// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktStatusRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stage")
    public Long stage;

    public static CreateLinkeLinktStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktStatusRequest self = new CreateLinkeLinktStatusRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktStatusRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktStatusRequest setStage(Long stage) {
        this.stage = stage;
        return this;
    }
    public Long getStage() {
        return this.stage;
    }

}
