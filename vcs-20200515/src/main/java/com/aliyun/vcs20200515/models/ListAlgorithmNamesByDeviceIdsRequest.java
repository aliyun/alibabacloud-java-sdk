// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAlgorithmNamesByDeviceIdsRequest extends TeaModel {
    // 设备ID集合，多个的话以逗号分隔，最大支持200个
    @NameInMap("GbIds")
    public String gbIds;

    public static ListAlgorithmNamesByDeviceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmNamesByDeviceIdsRequest self = new ListAlgorithmNamesByDeviceIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmNamesByDeviceIdsRequest setGbIds(String gbIds) {
        this.gbIds = gbIds;
        return this;
    }
    public String getGbIds() {
        return this.gbIds;
    }

}
