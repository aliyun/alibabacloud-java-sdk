// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    public static AddCheckResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListRequest self = new AddCheckResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

}
