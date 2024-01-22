// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SourceCodeRepoBranch extends TeaModel {
    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("Name")
    public String name;

    public static SourceCodeRepoBranch build(java.util.Map<String, ?> map) throws Exception {
        SourceCodeRepoBranch self = new SourceCodeRepoBranch();
        return TeaModel.build(map, self);
    }

    public SourceCodeRepoBranch setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public SourceCodeRepoBranch setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
