// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatenewgroupRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Path")
    public String path;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeCreatenewgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatenewgroupRequest self = new CreateLinkeantcodeAntcodeCreatenewgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
