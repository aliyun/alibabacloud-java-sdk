// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigDirRequest extends TeaModel {
    @NameInMap("dirName")
    public String dirName;

    public static ListAdvanceConfigDirRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigDirRequest self = new ListAdvanceConfigDirRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigDirRequest setDirName(String dirName) {
        this.dirName = dirName;
        return this;
    }
    public String getDirName() {
        return this.dirName;
    }

}
