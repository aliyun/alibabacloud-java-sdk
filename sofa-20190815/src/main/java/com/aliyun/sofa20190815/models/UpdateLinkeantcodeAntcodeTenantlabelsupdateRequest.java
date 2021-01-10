// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Description")
    public String description;

    @NameInMap("IdOrName")
    public String idOrName;

    @NameInMap("NewName")
    public String newName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest self = new UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest setIdOrName(String idOrName) {
        this.idOrName = idOrName;
        return this;
    }
    public String getIdOrName() {
        return this.idOrName;
    }

    public UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateLinkeantcodeAntcodeTenantlabelsupdateRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
