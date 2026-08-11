// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ResultValue extends TeaModel {
    /**
     * <p>Specifies whether to pause deployments to all destinations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseAll")
    public Boolean pauseAll;

    /**
     * <p>Specifies whether to pause deployments of new full indexes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseIndex")
    public Boolean pauseIndex;

    /**
     * <p>Specifies whether to pause deployments of incremental batches.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseIndexBatch")
    public Boolean pauseIndexBatch;

    /**
     * <p>Specifies whether to pause configuration deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseBiz")
    public Boolean pauseBiz;

    /**
     * <p>Specifies whether to pause real-time incremental updates.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseRuntime")
    public Boolean pauseRuntime;

    public static ResultValue build(java.util.Map<String, ?> map) throws Exception {
        ResultValue self = new ResultValue();
        return TeaModel.build(map, self);
    }

    public ResultValue setPauseAll(Boolean pauseAll) {
        this.pauseAll = pauseAll;
        return this;
    }
    public Boolean getPauseAll() {
        return this.pauseAll;
    }

    public ResultValue setPauseIndex(Boolean pauseIndex) {
        this.pauseIndex = pauseIndex;
        return this;
    }
    public Boolean getPauseIndex() {
        return this.pauseIndex;
    }

    public ResultValue setPauseIndexBatch(Boolean pauseIndexBatch) {
        this.pauseIndexBatch = pauseIndexBatch;
        return this;
    }
    public Boolean getPauseIndexBatch() {
        return this.pauseIndexBatch;
    }

    public ResultValue setPauseBiz(Boolean pauseBiz) {
        this.pauseBiz = pauseBiz;
        return this;
    }
    public Boolean getPauseBiz() {
        return this.pauseBiz;
    }

    public ResultValue setPauseRuntime(Boolean pauseRuntime) {
        this.pauseRuntime = pauseRuntime;
        return this;
    }
    public Boolean getPauseRuntime() {
        return this.pauseRuntime;
    }

}
