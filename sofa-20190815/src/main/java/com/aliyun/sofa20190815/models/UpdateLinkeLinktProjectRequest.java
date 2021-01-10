// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktProjectRequest extends TeaModel {
    @NameInMap("Archive")
    public String archive;

    @NameInMap("AsPublic")
    public String asPublic;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Notice")
    public String notice;

    @NameInMap("ParentSign")
    public String parentSign;

    @NameInMap("ProjectSign")
    public String projectSign;

    public static UpdateLinkeLinktProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktProjectRequest self = new UpdateLinkeLinktProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktProjectRequest setArchive(String archive) {
        this.archive = archive;
        return this;
    }
    public String getArchive() {
        return this.archive;
    }

    public UpdateLinkeLinktProjectRequest setAsPublic(String asPublic) {
        this.asPublic = asPublic;
        return this;
    }
    public String getAsPublic() {
        return this.asPublic;
    }

    public UpdateLinkeLinktProjectRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeLinktProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktProjectRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public UpdateLinkeLinktProjectRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

    public UpdateLinkeLinktProjectRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
