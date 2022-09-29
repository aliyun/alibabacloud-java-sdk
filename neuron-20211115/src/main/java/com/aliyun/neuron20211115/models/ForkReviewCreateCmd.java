// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReviewCreateCmd extends TeaModel {
    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("usage")
    public String usage;

    public static ForkReviewCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ForkReviewCreateCmd self = new ForkReviewCreateCmd();
        return TeaModel.build(map, self);
    }

    public ForkReviewCreateCmd setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public ForkReviewCreateCmd setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public ForkReviewCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
