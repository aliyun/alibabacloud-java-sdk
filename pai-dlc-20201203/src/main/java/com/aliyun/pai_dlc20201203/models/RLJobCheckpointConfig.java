// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobCheckpointConfig extends TeaModel {
    /**
     * <p>工作容器内的绝对路径，必须位于可读写的数据源挂载目录内。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/output</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Checkpoint 保存间隔。-1 表示关闭，正整数表示每 N 个训练步保存</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SaveIntervalSteps")
    public Integer saveIntervalSteps;

    public static RLJobCheckpointConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobCheckpointConfig self = new RLJobCheckpointConfig();
        return TeaModel.build(map, self);
    }

    public RLJobCheckpointConfig setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public RLJobCheckpointConfig setSaveIntervalSteps(Integer saveIntervalSteps) {
        this.saveIntervalSteps = saveIntervalSteps;
        return this;
    }
    public Integer getSaveIntervalSteps() {
        return this.saveIntervalSteps;
    }

}
