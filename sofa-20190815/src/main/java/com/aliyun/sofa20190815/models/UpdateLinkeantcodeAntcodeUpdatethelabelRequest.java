// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatethelabelRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("NewName")
    public String newName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeUpdatethelabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatethelabelRequest self = new UpdateLinkeantcodeAntcodeUpdatethelabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateLinkeantcodeAntcodeUpdatethelabelRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
