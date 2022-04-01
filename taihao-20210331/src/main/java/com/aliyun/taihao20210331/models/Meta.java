// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class Meta extends TeaModel {
    // score
    @NameInMap("score")
    public Integer score;

    // status
    @NameInMap("status")
    public String status;

    public static Meta build(java.util.Map<String, ?> map) throws Exception {
        Meta self = new Meta();
        return TeaModel.build(map, self);
    }

    public Meta setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public Meta setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
