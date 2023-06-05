// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAlgorithmNamesByDeviceIdsRequest extends TeaModel {
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
