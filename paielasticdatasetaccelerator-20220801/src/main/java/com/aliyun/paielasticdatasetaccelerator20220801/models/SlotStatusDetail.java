// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class SlotStatusDetail extends TeaModel {
    @NameInMap("LoadedFileNum")
    public Long loadedFileNum;

    @NameInMap("LoadedFileSize")
    public String loadedFileSize;

    @NameInMap("LoadingTimeCost")
    public Long loadingTimeCost;

    public static SlotStatusDetail build(java.util.Map<String, ?> map) throws Exception {
        SlotStatusDetail self = new SlotStatusDetail();
        return TeaModel.build(map, self);
    }

    public SlotStatusDetail setLoadedFileNum(Long loadedFileNum) {
        this.loadedFileNum = loadedFileNum;
        return this;
    }
    public Long getLoadedFileNum() {
        return this.loadedFileNum;
    }

    public SlotStatusDetail setLoadedFileSize(String loadedFileSize) {
        this.loadedFileSize = loadedFileSize;
        return this;
    }
    public String getLoadedFileSize() {
        return this.loadedFileSize;
    }

    public SlotStatusDetail setLoadingTimeCost(Long loadingTimeCost) {
        this.loadingTimeCost = loadingTimeCost;
        return this;
    }
    public Long getLoadingTimeCost() {
        return this.loadingTimeCost;
    }

}
