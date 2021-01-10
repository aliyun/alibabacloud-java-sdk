// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeGroupslabelRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("IdOrName")
    public String idOrName;

    @NameInMap("NewName")
    public String newName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeGroupslabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeGroupslabelRequest self = new UpdateLinkeantcodeAntcodeGroupslabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setIdOrName(String idOrName) {
        this.idOrName = idOrName;
        return this;
    }
    public String getIdOrName() {
        return this.idOrName;
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateLinkeantcodeAntcodeGroupslabelRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
