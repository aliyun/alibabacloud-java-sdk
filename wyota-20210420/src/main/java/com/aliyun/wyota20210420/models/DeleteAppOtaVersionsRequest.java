// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteAppOtaVersionsRequest extends TeaModel {
    @NameInMap("VersionUidList")
    public java.util.List<String> versionUidList;

    public static DeleteAppOtaVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppOtaVersionsRequest self = new DeleteAppOtaVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppOtaVersionsRequest setVersionUidList(java.util.List<String> versionUidList) {
        this.versionUidList = versionUidList;
        return this;
    }
    public java.util.List<String> getVersionUidList() {
        return this.versionUidList;
    }

}
