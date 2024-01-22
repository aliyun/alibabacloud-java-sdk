// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BuildPipelineRunLogLine extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Offset")
    public Long offset;

    public static BuildPipelineRunLogLine build(java.util.Map<String, ?> map) throws Exception {
        BuildPipelineRunLogLine self = new BuildPipelineRunLogLine();
        return TeaModel.build(map, self);
    }

    public BuildPipelineRunLogLine setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public BuildPipelineRunLogLine setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
