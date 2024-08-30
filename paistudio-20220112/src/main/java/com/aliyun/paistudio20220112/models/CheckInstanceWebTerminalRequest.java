// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CheckInstanceWebTerminalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wss://pai-dlc-proxy-cn-shanghai.aliyun.com/terminal/t1157703270994901/dlcmjzjt1dxbmx4h/dlcmjzjt1dxbmx4h-worker-0?Token=******</p>
     */
    @NameInMap("CheckInfo")
    public String checkInfo;

    public static CheckInstanceWebTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceWebTerminalRequest self = new CheckInstanceWebTerminalRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceWebTerminalRequest setCheckInfo(String checkInfo) {
        this.checkInfo = checkInfo;
        return this;
    }
    public String getCheckInfo() {
        return this.checkInfo;
    }

}
