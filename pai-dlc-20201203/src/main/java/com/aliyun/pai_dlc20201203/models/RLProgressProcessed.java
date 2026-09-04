// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressProcessed extends TeaModel {
    /**
     * <p>已处理条数</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Done")
    public Integer done;

    /**
     * <p>总条数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static RLProgressProcessed build(java.util.Map<String, ?> map) throws Exception {
        RLProgressProcessed self = new RLProgressProcessed();
        return TeaModel.build(map, self);
    }

    public RLProgressProcessed setDone(Integer done) {
        this.done = done;
        return this;
    }
    public Integer getDone() {
        return this.done;
    }

    public RLProgressProcessed setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
