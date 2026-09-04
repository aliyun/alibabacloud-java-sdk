// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressMicro extends TeaModel {
    /**
     * <p>当前 micro-batch 序号</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>micro-batch 总数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static RLProgressMicro build(java.util.Map<String, ?> map) throws Exception {
        RLProgressMicro self = new RLProgressMicro();
        return TeaModel.build(map, self);
    }

    public RLProgressMicro setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public RLProgressMicro setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
