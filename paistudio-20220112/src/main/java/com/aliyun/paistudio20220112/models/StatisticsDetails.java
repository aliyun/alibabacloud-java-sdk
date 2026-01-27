// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StatisticsDetails extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("IdleNum")
    public Long idleNum;

    public static StatisticsDetails build(java.util.Map<String, ?> map) throws Exception {
        StatisticsDetails self = new StatisticsDetails();
        return TeaModel.build(map, self);
    }

    public StatisticsDetails setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public StatisticsDetails setIdleNum(Long idleNum) {
        this.idleNum = idleNum;
        return this;
    }
    public Long getIdleNum() {
        return this.idleNum;
    }

}
