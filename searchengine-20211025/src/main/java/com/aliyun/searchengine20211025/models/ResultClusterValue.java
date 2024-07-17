// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ResultClusterValue extends TeaModel {
    /**
     * <p>The maximum number of full indexes that can be concurrently built.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("buildParallelNum")
    public Integer buildParallelNum;

    /**
     * <p>The maximum number of full indexes that can be concurrently merged.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("mergeParallelNum")
    public Integer mergeParallelNum;

    public static ResultClusterValue build(java.util.Map<String, ?> map) throws Exception {
        ResultClusterValue self = new ResultClusterValue();
        return TeaModel.build(map, self);
    }

    public ResultClusterValue setBuildParallelNum(Integer buildParallelNum) {
        this.buildParallelNum = buildParallelNum;
        return this;
    }
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    public ResultClusterValue setMergeParallelNum(Integer mergeParallelNum) {
        this.mergeParallelNum = mergeParallelNum;
        return this;
    }
    public Integer getMergeParallelNum() {
        return this.mergeParallelNum;
    }

}
