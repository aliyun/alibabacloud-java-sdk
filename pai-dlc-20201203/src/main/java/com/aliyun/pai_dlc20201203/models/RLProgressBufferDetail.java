// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressBufferDetail extends TeaModel {
    /**
     * <p>已被 trainer 消费的样本数</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Consumed")
    public Integer consumed;

    /**
     * <p>已完成样本数</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Finished")
    public Integer finished;

    /**
     * <p>已就绪样本数</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Ready")
    public Integer ready;

    /**
     * <p>buffer 标签，即 global batch 序号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tag")
    public Integer tag;

    /**
     * <p>目标样本数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static RLProgressBufferDetail build(java.util.Map<String, ?> map) throws Exception {
        RLProgressBufferDetail self = new RLProgressBufferDetail();
        return TeaModel.build(map, self);
    }

    public RLProgressBufferDetail setConsumed(Integer consumed) {
        this.consumed = consumed;
        return this;
    }
    public Integer getConsumed() {
        return this.consumed;
    }

    public RLProgressBufferDetail setFinished(Integer finished) {
        this.finished = finished;
        return this;
    }
    public Integer getFinished() {
        return this.finished;
    }

    public RLProgressBufferDetail setReady(Integer ready) {
        this.ready = ready;
        return this;
    }
    public Integer getReady() {
        return this.ready;
    }

    public RLProgressBufferDetail setTag(Integer tag) {
        this.tag = tag;
        return this;
    }
    public Integer getTag() {
        return this.tag;
    }

    public RLProgressBufferDetail setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
