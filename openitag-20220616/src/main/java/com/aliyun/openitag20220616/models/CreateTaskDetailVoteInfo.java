// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class CreateTaskDetailVoteInfo extends TeaModel {
    @NameInMap("MinVote")
    public Long minVote;

    @NameInMap("VoteNum")
    public Long voteNum;

    public static CreateTaskDetailVoteInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskDetailVoteInfo self = new CreateTaskDetailVoteInfo();
        return TeaModel.build(map, self);
    }

    public CreateTaskDetailVoteInfo setMinVote(Long minVote) {
        this.minVote = minVote;
        return this;
    }
    public Long getMinVote() {
        return this.minVote;
    }

    public CreateTaskDetailVoteInfo setVoteNum(Long voteNum) {
        this.voteNum = voteNum;
        return this;
    }
    public Long getVoteNum() {
        return this.voteNum;
    }

}
