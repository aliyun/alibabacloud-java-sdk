// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest extends TeaModel {
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

    public static QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest self = new QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public QueryLinkeantcodeAntcodeUpdatesnexistinglabelwithnewnameornowcolorRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
