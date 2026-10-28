// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressMicro extends TeaModel {
    /**
     * <p>The current micro-batch ordinal number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The micro-batch total count.</p>
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
