// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowSlowestItem extends TeaModel {
    /**
     * <p>The UID of the sample.</p>
     * 
     * <strong>example:</strong>
     * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The ordinal number of the event trace.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    /**
     * <p>The execution duration of the stage, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>9.2</p>
     */
    @NameInMap("Sec")
    public Double sec;

    public static RLFlowSlowestItem build(java.util.Map<String, ?> map) throws Exception {
        RLFlowSlowestItem self = new RLFlowSlowestItem();
        return TeaModel.build(map, self);
    }

    public RLFlowSlowestItem setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public RLFlowSlowestItem setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public RLFlowSlowestItem setSec(Double sec) {
        this.sec = sec;
        return this;
    }
    public Double getSec() {
        return this.sec;
    }

}
