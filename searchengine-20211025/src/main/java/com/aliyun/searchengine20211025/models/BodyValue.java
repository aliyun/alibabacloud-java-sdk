// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BodyValue extends TeaModel {
    /**
     * <p>Specifies whether to suspend all pushes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseAll")
    public Boolean pauseAll;

    /**
     * <p>Specifies whether to suspend the push for the new full index version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseIndex")
    public Boolean pauseIndex;

    /**
     * <p>Specifies whether to suspend the push for the incremental indexes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseIndexBatch")
    public Boolean pauseIndexBatch;

    /**
     * <p>Specifies whether to suspend the push for the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseBiz")
    public Boolean pauseBiz;

    /**
     * <p>Specifies whether to suspend the push for the real-time incremental indexes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pauseRuntime")
    public Boolean pauseRuntime;

    public static BodyValue build(java.util.Map<String, ?> map) throws Exception {
        BodyValue self = new BodyValue();
        return TeaModel.build(map, self);
    }

    public BodyValue setPauseAll(Boolean pauseAll) {
        this.pauseAll = pauseAll;
        return this;
    }
    public Boolean getPauseAll() {
        return this.pauseAll;
    }

    public BodyValue setPauseIndex(Boolean pauseIndex) {
        this.pauseIndex = pauseIndex;
        return this;
    }
    public Boolean getPauseIndex() {
        return this.pauseIndex;
    }

    public BodyValue setPauseIndexBatch(Boolean pauseIndexBatch) {
        this.pauseIndexBatch = pauseIndexBatch;
        return this;
    }
    public Boolean getPauseIndexBatch() {
        return this.pauseIndexBatch;
    }

    public BodyValue setPauseBiz(Boolean pauseBiz) {
        this.pauseBiz = pauseBiz;
        return this;
    }
    public Boolean getPauseBiz() {
        return this.pauseBiz;
    }

    public BodyValue setPauseRuntime(Boolean pauseRuntime) {
        this.pauseRuntime = pauseRuntime;
        return this;
    }
    public Boolean getPauseRuntime() {
        return this.pauseRuntime;
    }

}
