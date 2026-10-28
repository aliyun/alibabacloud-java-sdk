// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StatisticsDetails extends TeaModel {
    /**
     * <p>The count.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The idle count.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
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
