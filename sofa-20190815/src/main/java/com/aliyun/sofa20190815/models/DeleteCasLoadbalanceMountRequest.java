// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCasLoadbalanceMountRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ComputerIdsRepeatList")
    public java.util.List<String> computerIdsRepeatList;

    public static DeleteCasLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasLoadbalanceMountRequest self = new DeleteCasLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteCasLoadbalanceMountRequest setComputerIdsRepeatList(java.util.List<String> computerIdsRepeatList) {
        this.computerIdsRepeatList = computerIdsRepeatList;
        return this;
    }
    public java.util.List<String> getComputerIdsRepeatList() {
        return this.computerIdsRepeatList;
    }

}
