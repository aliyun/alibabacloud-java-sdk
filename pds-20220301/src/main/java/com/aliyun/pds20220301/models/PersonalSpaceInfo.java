// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PersonalSpaceInfo extends TeaModel {
    @NameInMap("total_size")
    public Long totalSize;

    @NameInMap("used_size")
    public Long usedSize;

    public static PersonalSpaceInfo build(java.util.Map<String, ?> map) throws Exception {
        PersonalSpaceInfo self = new PersonalSpaceInfo();
        return TeaModel.build(map, self);
    }

    public PersonalSpaceInfo setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PersonalSpaceInfo setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
